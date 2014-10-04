/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cargo;
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
public class CargoDAO {
    
     private Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    
    public CargoDAO(){
         try {
           this.con = ConexaoBD.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public List<Cargo> listarCargos(){
        String sql = "select * from Cargo";
        try {
            List<Cargo> lista = new ArrayList<>();
            stmt = this.con.prepareStatement(sql);//Conexao feita
            rs = stmt.executeQuery();
            while(rs.next()){
                Cargo car = new Cargo();
                car.setId(rs.getInt("idCargo"));
                car.setDesignacao(rs.getString("designacao"));
                lista.add(car);
            }
            rs.close();
            stmt.close();
            return lista;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void apagar(int idCargo) {
        try {
            String sql = "DELETE FROM Cargo WHERE idCargo=?";
            stmt = this.con.prepareStatement(sql);
            stmt.setInt(1, idCargo);
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ResponsavelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
