/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author noite
 */
public class IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aves passaro = new Aves();
        String mensagem = passaro.Comer();
        if(mensagem.equalsIgnoreCase("MAIS")){
            System.out.println("Vou mandar mais comida");
        }
        System.out.println(mensagem);
    }
    
}
