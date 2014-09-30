/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.CargoDAO;
import Model.Cargo;
import java.util.List;

/**
 *
 * @author e1000son
 */
public class CargoController {
    private CargoDAO cargoDAO;

    public CargoController() {
        cargoDAO = new CargoDAO();
    }
    
    public List<Cargo> listarCargos(){
       // try {
            List<Cargo> lista = (List<Cargo>)cargoDAO.listarCargos();
            return lista;
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }
    
}
