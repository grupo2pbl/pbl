/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.CompartimentoDAO;
import Model.Compartimento;
import Model.TipoCompartimento;
import java.util.List;

/**
 *
 * @author e1000son
 */
public class CompartimentoController {
    private CompartimentoDAO compartimentoDAO; 
    
    public CompartimentoController(){
        compartimentoDAO = new CompartimentoDAO();
    }
    
     public void registarCompartimento(Compartimento compartimento ){
        try {
          compartimentoDAO.registarCompartimento(compartimento);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
   public List<Compartimento> listarCompartimento(){
        List<Compartimento> compartimentos=(List<Compartimento>)compartimentoDAO.listarTodos();
        return compartimentos;
    } 
}
