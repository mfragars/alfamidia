/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import Modelo.*;


/**
 *
 * @author noite
 */
public class Turma {
    private int id;
    private String sala;
    private Aluno aluno;
    private Professor prof;
    
    public Turma(){
    }

    public Turma(int id, String sala, Aluno aluno, Professor prof) {
        this.id = id;
        this.sala = sala;
        this.aluno = aluno;
        this.prof = prof;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProf() {
        return prof;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

    
    
    
    
}
