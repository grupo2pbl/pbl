/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.CategoriaMaterial;
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
public class CategoriaMaterialDAO {
    private Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    
    public CategoriaMaterialDAO(){
         try {
           this.con = ConexaoBD.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    /**
     *
     * @return
     */
    public List<CategoriaMaterial> listar(){
            String sql = "select * from CategoriaMaterial";
            try {
                List<CategoriaMaterial> lista = new ArrayList<>();
                stmt = this.con.prepareStatement(sql);//Conexao feita
                rs = stmt.executeQuery();
                while(rs.next()){
                    CategoriaMaterial cat = new CategoriaMaterial();
                    cat.setId(rs.getInt("idCategoria"));
                    cat.setDesignacao(rs.getString("designacao"));
                    cat.setIdentiTipo(rs.getString("identiTipo").charAt(0));
                    lista.add(cat);
                }
                rs.close();
                stmt.close();
                return lista;
            
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    
        public void adicionar(CategoriaMaterial cat){
        try {
            String sql = "Insert into CategoriaMaterial(designacao,identiTipo) values (?,?)";
            
            stmt = this.con.prepareStatement(sql);
            stmt.setString(1, cat.getDesignacao());
            stmt.setString(2, cat.getIdentiTipo()+"");
            
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
}
