/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Produto;


/**
 *
 * @author noite
 */
public class Conexao {
    String result;
    public Conexao(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("OnLine");
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
        }
    }
    
    public String insere(Produto produto){
        try{
            
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/comercio", "root", "");
            PreparedStatement query = conexao.prepareStatement("INSERT INTO produto (Id, nome, descricao, preco) VALUES (?,?,?,?)");
            query.setInt(1,produto.getId());
            query.setString(2, produto.getNome());
            query.setString(3,produto.getDescricao());
            query.setDouble(4, produto.getValor());
            
            result = query.executeUpdate() == 1?"Inserido":"Não Inserido";
            conexao.close();
        }catch(Exception e){
            result= "Mensagem: ".concat(e.getMessage()).concat(" - Origem: ".concat(e.getLocalizedMessage()));
            
        }
        
        return result;
    }
    
    public String atualiza(Produto produto){
        try{
            
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/comercio", "root", "");
            PreparedStatement query = conexao.prepareStatement("UPDATE produto SET nome = ?, descricao = ?, preco = ? WHERE Id = ?");
            query.setString(1, produto.getNome());
            query.setString(2,produto.getDescricao());
            query.setDouble(3, produto.getValor());
            query.setInt(4,produto.getId());
            
            result = query.executeUpdate() == 1?"Atualizado":"Não Atualizado";
            conexao.close();
        }catch(Exception e){
            result= "Mensagem: ".concat(e.getMessage()).concat(" - Origem: ".concat(e.getLocalizedMessage()));
            
        }
        
        return result;
    }
    
    public String excluir(Produto produto){
        try{
            
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/comercio", "root", "");
            PreparedStatement query = conexao.prepareStatement("DELETE FROM produto WHERE Id = ?");
            query.setInt(1,produto.getId());
            
            result = query.executeUpdate() == 1?"Excluido":"Não Excluido";
            conexao.close();
        }catch(Exception e){
            result= "Mensagem: ".concat(e.getMessage()).concat(" - Origem: ".concat(e.getLocalizedMessage()));
            
        }
        
        return result;
    }
    
    public Produto getProduto(int id){
        
        Produto produto = new Produto();
        
        try{
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/comercio", "root", "");
            PreparedStatement query = conexao.prepareStatement("SELECT * FROM produto WHERE Id = ?");
            query.setInt(1, id);
            ResultSet result = query.executeQuery();
            while(result.next()){
                produto.setId(result.getInt("Id"));
                produto.setNome(result.getString("nome"));
                produto.setDescricao(result.getString("descricao"));
                produto.setValor(result.getDouble("preco"));
                
            }
            conexao.close();
        }catch(Exception e){
            produto = null;
        }
        
        return produto;
    }
    
    public ArrayList<Produto> lista(){
        ArrayList<Produto> lista = new ArrayList<Produto>();
        try{
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/comercio", "root", "");
            PreparedStatement query = conexao.prepareStatement("SELECT * FROM produto");
            ResultSet result = query.executeQuery();
            while(result.next()){
                Produto produto = new Produto();
                produto.setId(result.getInt("Id"));
                produto.setNome(result.getString("nome"));
                produto.setDescricao(result.getString("descricao"));
                produto.setValor(result.getDouble("preco"));
                lista.add(produto);
            }
            conexao.close();
        }catch(Exception e){
            lista = null;
        }
        
        return lista;
    }
    
}
