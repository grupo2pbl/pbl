
package Teste;

import DAO.ResponsavelDAO;
import Model.Cargo;
import Model.Responsavel;

/**
 *
 * @author elton
 */
public class Teste {
    public static void main(String []args){
        /*CategoriaMaterial cm = new CategoriaMaterial();
        cm.setDesignacao("Cadeira");
        cm.setIdentiTipo('e');
        CategoriaMaterialDAO cd = new CategoriaMaterialDAO();
        cd.adicionar(cm);
        */
        
        Responsavel rp = new Responsavel();
        rp.setApelido("LAice");
        rp.setCargo_idCargo(new Cargo());
        rp.setOutrosNomes("Tomas Elton");
        ResponsavelDAO r = new ResponsavelDAO();
        r.registarResponsavel(rp);
    }
}