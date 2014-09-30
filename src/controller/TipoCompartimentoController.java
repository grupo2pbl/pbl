/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.TipoCompartimentoDAO;
import Model.TipoCompartimento;
import java.util.List;

/**
 *
 * @author e1000son
 */
public class TipoCompartimentoController {
    private TipoCompartimentoDAO tipoCompartimentoDAO ;
    
    public TipoCompartimentoController(){
        tipoCompartimentoDAO = new TipoCompartimentoDAO();
        
    }
    
     public void registarTipoCompartimento(TipoCompartimento tipoCompartimento ){
        try {
           tipoCompartimentoDAO.registarTipoCompartimentoDAO(tipoCompartimento);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
   public List<TipoCompartimento> listarTipoCompartimento(){
        List<TipoCompartimento> tipoCompartimentos=(List<TipoCompartimento>)tipoCompartimentoDAO.listarTodos();
        return tipoCompartimentos;
    } 
    
}
