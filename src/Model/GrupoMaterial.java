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
public class GrupoMaterial {
    private int id;
    private int tempo_int;
    private String data_aquisicao;
    private String marca;
    private int idFornecedor;
    private int idCategoria;

    public GrupoMaterial(int id, int tempo_int, String data_aquisicao, String marca, int idFornecedor, int idCategoria) {
        this.id = id;
        this.tempo_int = tempo_int;
        this.data_aquisicao = data_aquisicao;
        this.marca = marca;
        this.idFornecedor = idFornecedor;
        this.idCategoria = idCategoria;
    }

    public GrupoMaterial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public int getId() {
        return id;
    }



    public String getData_aquisicao() {
        return data_aquisicao;
    }

    public String getMarca() {
        return marca;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTempo_int() {
        return tempo_int;
    }

    public void setTempo_int(int tempo_int) {
        this.tempo_int = tempo_int;
    }

    public void setData_aquisicao(String data_aquisicao) {
        this.data_aquisicao = data_aquisicao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
}