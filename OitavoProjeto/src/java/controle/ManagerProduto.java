/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.Conexao;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Scope;
import modelo.Produto;

/**
 *
 * @author noite
 */
@ManagedBean
@SessionScoped

public class ManagerProduto {
    private String msn = "";
    private Produto produto = new Produto();
    private ArrayList<Produto> lista = new ArrayList<Produto>();

    public ArrayList<Produto> getLista() {
       Conexao c = new Conexao();
       return c.lista();
    }

    public void setLista(ArrayList<Produto> lista) {
        this.lista = lista;
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }
    
    
    /**
     * Creates a new instance of ManagerProduto
     */
    public ManagerProduto() {
    }
    
    public String insere(){
        try{
            Conexao c = new Conexao();
            this.msn = c.insere(this.produto);
            this.produto.setId(0);
            this.produto.setNome("");
            this.produto.setDescricao("");
            this.produto.setValor(0.0);
            FacesContext ct = FacesContext.getCurrentInstance();
            ct.addMessage(null, new FacesMessage("Inserido com Sucesso!!"));
            
        }catch(Exception e){
            return e.getMessage();
        }
        return "Inserido com Sucesso!!!";
    }
    
    public String atualiza(){
        try{
            Conexao c = new Conexao();
            this.msn = c.atualiza(this.produto);
            this.produto.setId(0);
            this.produto.setNome("");
            this.produto.setDescricao("");
            this.produto.setValor(0.0);
            FacesContext ct = FacesContext.getCurrentInstance();
            ct.addMessage(null, new FacesMessage("Atualizado com Sucesso!!"));
            
        }catch(Exception e){
            return e.getMessage();
        }
        return "Atualizado com Sucesso!!!";
    }
    
    
}
