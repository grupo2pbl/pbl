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
    private int idCompartimento;
    private int idGrupoMaterial;

    public Material() {
    }

    public Material(int id, char estado, char estado_Chegada, int idCompartimento, int idGrupoMaterial) {
        this.id = id;
        this.estado = estado;
        this.estado_Chegada = estado_Chegada;
        this.idCompartimento = idCompartimento;
        this.idGrupoMaterial = idGrupoMaterial;
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
        return idCompartimento;
    }

    public void setIdCompartimento(int idCompartimento) {
        this.idCompartimento = idCompartimento;
    }

    public int getIdGrupoMaterial() {
        return idGrupoMaterial;
    }

    public void setIdGrupoMaterial(int idGrupoMaterial) {
        this.idGrupoMaterial = idGrupoMaterial;
    }

    
}
