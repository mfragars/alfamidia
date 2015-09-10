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
public class Fisica extends Pessoa {

    public Fisica() {
    }

    public Fisica(String id, String nome, String endereco, String dataInicio, String documento) {
        super(id, nome, endereco, dataInicio, documento);
    }

    
    public void setId(String id){
       if(id.length() <= 11 ){
           super.setId(id);
       }else{
           super.setId(null);
       }
       
   }
    
    
    
}
