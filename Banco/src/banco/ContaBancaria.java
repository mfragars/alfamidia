/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author noite
 */
public class ContaBancaria {
	private String cliente;
	private double saldo = 0;

        public ContaBancaria() {
        }
        
        public ContaBancaria(String cliente){
            this.cliente = cliente;
        }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
        
        
        
	public void depositar(double deposito) {
		this.saldo += deposito;
	}
		
	public void sacar(double saque) {
	this.saldo -= saque;
	}
}
