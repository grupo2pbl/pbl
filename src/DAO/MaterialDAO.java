/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Material;
import Model.Responsavel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elton
 */
public class MaterialDAO {
    private Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    
    public MaterialDAO(){
         try {
           this.con = ConexaoBD.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void adicionar(Material material){
        try {
            String sql = "Insert into Material(estado,Compartimento_idCompartimento,GrupoMaterial_idGrupoMaterial"
                    + ",estadoChegada) values (?,?,?,?)";
            
            stmt = this.con.prepareStatement(sql);
            stmt.setString(1, material.getEstado()+"");
            stmt.setInt(2, material.getIdCompartimento());
            stmt.setInt(3, material.getIdGrupoMaterial());
            stmt.setInt(4, material.getEstado_Chegada());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public List<Material> listarTodos(){
        String sql = "Select * from Material";
        try{ 
        stmt = this.con.prepareStatement(sql);
        rs = stmt.executeQuery();
       
        List<Material> material = new ArrayList<Material>();
        while (rs.next()){
            Material m = new Material();
            m.setId(rs.getInt("idMaterial"));
            m.setEstado(rs.getString("estado").charAt(0));
            m.setEstado_Chegada(rs.getString("estadoChegada").charAt(0));
            m.setIdCompartimento(rs.getInt("Compartimento_idCompartimento"));
            m.setIdGrupoMaterial(rs.getInt("GrupoMaterial_idGrupoMaterial"));
        }
        stmt.close();
        return material;
       }catch (SQLException e) {
            throw new RuntimeException(e);
    }
}
}
