/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author estudante
 */
public class CategoriaMaterial {
    private int id;
    private String designacao;
    private char identiTipo;

    public CategoriaMaterial(int id, String designacao, char identiTipo) {
        this.id = id;
        this.designacao = designacao;
        this.identiTipo = identiTipo;
    }
    
    public CategoriaMaterial() {
        
    }

    public int getId() {
        return id;
    }

    public String getDesignacao() {
        return designacao;
    }

    public char getIdentiTipo() {
        return identiTipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public void setIdentiTipo(char identiTipo) {
        this.identiTipo = identiTipo;
    }

   
}
