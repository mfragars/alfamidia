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
        String alimento = null;
        Scanner read = new Scanner(System.in);
        
        System.out.println("Informe o alimento");
        alimento = read.next();
        
        String mensagem = passaro.Comer(alimento);
        
        System.out.println(mensagem);
    }
    
}
