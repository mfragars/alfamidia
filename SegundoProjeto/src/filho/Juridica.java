/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filho;
import pai.Pessoa;

/**
 *
 * @author noite
 */
public class Juridica extends Pessoa {
    private Double capitalSocial;

    public Juridica(){
    }
    
    public Juridica(Double capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    public Juridica(Double capitalSocial, String id, String nome, String endereco, String dataInicio, String documento) {
        super(id, nome, endereco, dataInicio, documento);
        this.capitalSocial = capitalSocial;
    }
    
    public void setId(String id){
        if(id.length() <= 14 ){
            super.setId(id);
    }else{
            super.setId(null);
        }
    }

    public Double getCapitalSocial() {
        return capitalSocial;
    }

    public void setCapitalSocial(Double capitalSocial) {
        this.capitalSocial = capitalSocial;
    }
    
    
    
}
