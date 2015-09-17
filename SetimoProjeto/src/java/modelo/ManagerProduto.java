/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import dao.Conexao;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author noite
 */
@ManagedBean
@SessionScoped
public class ManagerProduto {
    private ArrayList<Produto> lista = new ArrayList<Produto>();

    public ArrayList<Produto> getLista() {
       Conexao c = new Conexao();
       return c.lista();
    }

    public void setLista(ArrayList<Produto> lista) {
        this.lista = lista;
    }
    
    
    
    /**
     * Creates a new instance of ManagerProduto
     */
    public ManagerProduto() {
    }
    
}
