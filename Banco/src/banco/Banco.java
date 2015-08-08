/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author noite
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBancaria conta;
        conta = new ContaBancaria();
        double valorDep;
        double valorSac;
        int option;
        int menu = 1;
        Scanner read = new Scanner(System.in);
        
        
        do{
        System.out.println("Informe a operação:\n1 - Deposito \n2 - Saque");
        option = read.nextInt();
        
        switch(option){
            case 1:
                System.out.println("Informe o valor do Deposito");
                conta.depositar(read.nextDouble());
            break;
            case 2:
                System.out.println("Informe o valor do saque");
                conta.sacar(read.nextDouble());
            break;
        }
            System.out.println("Gostaria de realizar outra operação?\n1 - SIM\n2 - NÃO");
            menu = read.nextInt();
        }while(menu == 1);
        System.out.println("O saldo é: " + conta.getSaldo());
        
        
        
        
        
//        conta.depositar(500d);
//        conta.depositar(300d);
//        conta.sacar(100d);
//        conta.sacar(30d);
//        // ... conta.saldo = 10d;
    }
    
}
