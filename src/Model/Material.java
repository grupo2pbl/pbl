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
public class Material {
    private int id;
    private char estado;
    private char estado_Chegada;
    private int compartimento_ID;
    private int grupoMaterial_ID;

   
    

    public Material(int id, char estado, char estado_Chegada, int compartimento_ID, int grupoMaterial_ID) {
        this.id = id;
        this.estado = estado;
        this.estado_Chegada = estado_Chegada;
        this.compartimento_ID = compartimento_ID;
        this.grupoMaterial_ID = grupoMaterial_ID;
    }
    public Material() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public char getEstado_Chegada() {
        return estado_Chegada;
    }

    public void setEstado_Chegada(char estado_Chegada) {
        this.estado_Chegada = estado_Chegada;
    }

    public int getIdCompartimento() {
        return compartimento_ID;
    }

    public void setIdCompartimento(int compartimento_ID) {
        this.compartimento_ID = compartimento_ID;
    }

    public int getIdGrupoMaterial() {
        return grupoMaterial_ID;
    }

    public void setIdGrupoMaterial(int grupoMaterial_ID) {
        this.grupoMaterial_ID = grupoMaterial_ID;
    }

    
}
