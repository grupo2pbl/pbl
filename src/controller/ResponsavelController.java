/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ResponsavelDAO;
import Model.Responsavel;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author e1000son
 */
public class ResponsavelController {
    
    private ResponsavelDAO responsavelDAO;

    public ResponsavelController() {
        responsavelDAO = new ResponsavelDAO();
    }
    
    public void registarResponsavel(Responsavel responsavel){
    
        try {
            if(responsavel.getOutrosNomes().isEmpty()){
                JOptionPane.showMessageDialog(null, "O nome deve ser preenchido!");
            }
            else if(responsavel.getApelido().isEmpty()){
               JOptionPane.showMessageDialog(null, "Este campo nao deve estar vazio"); 
            }
            else
            responsavelDAO.registarResponsavel(responsavel);
        } catch (Exception e) {
            System.out.println("Errro"+e);
        }
        
    }
    
   public List<Responsavel> listarResponsavel(){
        List<Responsavel> responsaveis=(List<Responsavel>)responsavelDAO.listarTodos();
        return responsaveis;
    }
   
   public void apaga(Responsavel responsavel){
        responsavelDAO.apagar(responsavel);
    }
   
   public void actualizarResponsavel(Responsavel responsavel){
     responsavelDAO.actualizarResponsavel(responsavel);
    }
   
   
    
}
