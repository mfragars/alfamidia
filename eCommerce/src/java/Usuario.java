/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author noite
 */
public class Usuario {
    
    public  enum ShowUser {
    
    joao(1),fred(2),mauricio(3);
    
    private final int valor;
    ShowUser(int valorOpcao){
    valor = valorOpcao;
     }
    public int getValor(){
     return valor;
    }
    
    }
    
    public static void escolhe(ShowUser Opcao){
    
        if(Opcao == ShowUser.joao){
            System.out.println("joao");
            
        
        }else if (Opcao == ShowUser.fred){
              System.out.println("fred");
        
        
        }else if (Opcao == ShowUser.mauricio){
              System.out.println("mauricio");
        
        
        }
}
}
