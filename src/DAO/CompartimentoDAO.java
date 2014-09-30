/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Compartimento;
import Model.Responsavel;
import Model.TipoCompartimento;
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
 * @author e1000son
 */
public class CompartimentoDAO {
    private Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    
    public CompartimentoDAO(){
         try {
           this.con = ConexaoBD.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
    public void registarCompartimento(Compartimento compartimento ){
        try {
            String sql = "Insert into Compartimento(idCompartimento,designacao,piso,"
                    + "tipoCompartimento_idTipoCompartimento,"
                    + "responsavel_idResponsavel) values (?,?,?,?,?)";
            stmt = this.con.prepareStatement(sql);
            stmt.setInt(1,compartimento.getId());
            stmt.setString(2,compartimento.getDesignacao());
            stmt.setString(3,compartimento.getPiso());
            stmt.setInt(4,compartimento.getIdTipoCompart().getId());
            stmt.setInt(5,compartimento.getIdResponsavel().getId());         
                     
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CompartimentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public List<Compartimento> listarTodos(){
        String sql = "Select * from Compartimento";
        try{ 
        stmt = this.con.prepareStatement(sql);
        rs = stmt.executeQuery();
       
         List<Compartimento> compartimentos = new ArrayList<>();
        while (rs.next()){
            Compartimento compartimento = new Compartimento();
            compartimento.setId(rs.getInt("idCompartimento"));
            compartimento.setDesignacao(rs.getString("designacao"));
            compartimento.setIdTipoCompart((TipoCompartimento)rs.getObject("tipoCompartimento_idTipoCompartimento"));
            compartimento.setIdResponsavel((Responsavel)rs.getObject("responsavel_idResponsavel"));
        }
        stmt.close();
        return compartimentos;
       }catch (SQLException e) {
            throw new RuntimeException(e);
    }
}
     
      public void apagar(int idCompartimento) {
        try {
            String sql = "DELETE FROM Compartimento WHERE idCompartimento=?";
            stmt = this.con.prepareStatement(sql);
            stmt.setInt(1, idCompartimento);
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
