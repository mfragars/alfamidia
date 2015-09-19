/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Modelo.Produto;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author noite
 */
public class HibernateManager {

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
    
    public String insert(Produto p){
        try{
            Session session = HibernateManager.getSessionFactory().openSession();
            session.save(p);
            session.beginTransaction().commit();
            session.close();            
            return "Inserido";
        }catch(HibernateException e){
            
            return e.getMessage();
        }
    }
    
    public Produto produto(int id){
        try{
            Session session = HibernateManager.getSessionFactory().openSession();
            Produto produto = (Produto) session.get(Produto.class, id);
            session.close();
            return produto;
        }catch(HibernateException e){
            return null;
            
        }
    }
    
    public static void main(String[] args){
        HibernateManager manager = new HibernateManager();
        Produto p = new Produto();
        p.setId(100);
        p.setNome("Curso Pentho");
        p.setDescricao("Curso ETL com Pentaho Data Integration");
        p.setPreco(1600.00);
        System.out.println(manager.insert(p));
        Produto produto = manager.produto(100);
        System.out.println(p.getDescricao());
    }
}
