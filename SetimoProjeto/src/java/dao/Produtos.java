/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Produto;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author noite
 */
public class Produtos {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public String insere(){
        Produto p = new Produto();
        p.setId(10);
        p.setNome("alfamidia");
        p.setDescricao("Curso Java");
        p.setValor(15.00);
        
        Session s = Produtos.getSessionFactory().openSession();
        s.beginTransaction();
        s.saveOrUpdate(p);
        s.close();
        
        return "OK";
    }
    
    public static void main(String args[]){
        Produtos p = new Produtos();
        try{
            System.out.println(p.insere());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
