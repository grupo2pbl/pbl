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
public class Compartimento {
    private int id;
    private String designacao;
    private String piso;
    private Model.TipoCompartimento tipoCompart_ID;
    private Responsavel responsavel_ID;

    public Compartimento(int id, String designacao, String piso,TipoCompartimento tipoCompart_ID,Responsavel  responsavel_ID) {
        this.id = id;
        this.designacao = designacao;
        this.piso = piso;
        this.tipoCompart_ID = tipoCompart_ID;
        this.responsavel_ID = responsavel_ID;
    }

    public Compartimento(){
        
    }

    public int getId() {
        return id;
    }

    public String getDesignacao() {
        return designacao;
    }

    public String getPiso() {
        return piso;
    }

    public TipoCompartimento getIdTipoCompart() {
        return tipoCompart_ID;
    }

    public Responsavel getIdResponsavel() {
        return responsavel_ID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public void setIdTipoCompart(TipoCompartimento idTipoCompart) {
        this.tipoCompart_ID = tipoCompart_ID;
    }

    public void setIdResponsavel(Responsavel idResponsavel) {
        this.responsavel_ID = responsavel_ID;
    }
    
}