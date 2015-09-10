/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pai;
import filho.*;
import java.util.Scanner;

/**
 *
 * @author noite
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Fisica f = new Fisica();
        Juridica j = new Juridica();
        
       System.out.println("Informe o CPF");
       f.setId(read.next());
             
       System.out.println("CPF: " + f.getId());
       
       System.out.println("Informe o CNPJ");
       j.setId(read.next());
       
        System.out.println("CNPJ: " + j.getId());
    }
    
}
