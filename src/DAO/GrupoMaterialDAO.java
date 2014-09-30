/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cargo;
import Model.GrupoMaterial;
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
public class GrupoMaterialDAO {
     private Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    
    public GrupoMaterialDAO(){
         try {
           this.con = ConexaoBD.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void adicionar(GrupoMaterial grupoMaterial, int quant){
        
        try {
            String sql = "Insert into GrupoMaterial(tempo_vida,Fornecedor_Endereco_idEndereco"
                    + ",CategoriaMaterial_idCategoria,marca) values (?,?,?,?)";
            
            stmt = this.con.prepareStatement(sql);
            stmt.setInt(1, grupoMaterial.getTempo_int());
            stmt.setInt(2, grupoMaterial.getIdFornecedor());
            stmt.setInt(3, grupoMaterial.getIdCategoria());
            stmt.setString(4, grupoMaterial.getMarca());
            
            for(int i = 0; i <= quant; i++){
                //aqui vem dau de material
            }
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
    
    public List<GrupoMaterial> listar(){
        String sql = "Select * from GrupoMaterial";
        try{ 
        stmt = this.con.prepareStatement(sql);
        rs = stmt.executeQuery();
       
         List<GrupoMaterial> GmaMaterials = new ArrayList<>();
        while (rs.next()){
            GrupoMaterial material = new GrupoMaterial();
            material.setId(rs.getInt("idGrupoMaterial"));
            material.setData_aquisicao(rs.getDate("data_aquisicao")+"");
            material.setIdCategoria(rs.getInt("CategoriaMaterial_idCategoria"));
            material.setIdFornecedor(rs.getInt("Fornecedor_Endereco_idEndereco"));
            material.setMarca(rs.getString("Fornecedor_Endereco_idEndereco"));
            material.setTempo_int(rs.getInt("tempo_vida"));
        }
        stmt.close();
        return GmaMaterials;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}