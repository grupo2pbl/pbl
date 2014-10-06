/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Beula
 */
public class Fornecimento {
    private int fornecedor_ID;
    private int grupoMaterial_ID;
    private int quantidade;
    private String dataAquisicao;
    private String tipoFornecimento;
    private int garantia;

    public Fornecimento(int fornecedor_ID, int grupoMaterial_ID, int quantidade, String dataAquisicao, String tipoFornecimento, int garantia) {
        this.fornecedor_ID = fornecedor_ID;
        this.grupoMaterial_ID = grupoMaterial_ID;
        this.quantidade = quantidade;
        this.dataAquisicao = dataAquisicao;
        this.tipoFornecimento = tipoFornecimento;
        this.garantia = garantia;
    }

    public int getFornecedor_ID() {
        return fornecedor_ID;
    }

    public void setFornecedor_ID(int fornecedor_ID) {
        this.fornecedor_ID = fornecedor_ID;
    }

    public int getGrupoMaterial_ID() {
        return grupoMaterial_ID;
    }

    public void setGrupoMaterial_ID(int grupoMaterial_ID) {
        this.grupoMaterial_ID = grupoMaterial_ID;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public String getTipoFornecimento() {
        return tipoFornecimento;
    }

    public void setTipoFornecimento(String tipoFornecimento) {
        this.tipoFornecimento = tipoFornecimento;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    
    
    
}
