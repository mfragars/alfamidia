/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author noite
 */
public class IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        Aves passaro = new Aves();
//        String alimento = null;
//        Scanner read = new Scanner(System.in);
//        String mensagem = null;
//        
//        System.out.println("Informe o alimento");
//        alimento = read.next();
//        
//        mensagem = passaro.Comer(alimento);
//        
//        System.out.println(mensagem);
        
         char choice;
        
        System.out.println("Help on");
        System.out.println(" 1 if");
        System.out.println(" 2 switch");
        System.out.println("Choose on");
        choice = (char) System.in.read();
        System.out.println("\n");
        
        switch(choice){
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression){;");
                System.out.println("case constant:");
                System.out.println(" statement sequence");
                System.out.println(" break;");
                System.out.println(" //...");
                System.out.println("}");
                break;
            case '3':
                double pesoTerra;
                double pesoLua;
                pesoTerra = 165;
                pesoLua = pesoTerra * 0.17;
                System.out.println(pesoTerra + "Equivale a " + pesoLua + " na lua");
                break;
            case '4':
                char ch;
                ch = 'A';
                System.out.println("ch contains " + ch);
                
                ch++; // incrementa ch
                System.out.println("ch é " + ch);
                
                ch = 90; 
                System.out.println("ch é " + ch);
                break;
            default:
                System.out.println("Selection not found");
        }
        
    }
    
}
