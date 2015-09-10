/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terceiroprojeto;
import Modelo.*;
import Controle.Turma;

/**
 *
 * @author noite
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nome = new String[3];
        nome[0] = "Mutto";
        nome[1] = "Mauricio";
        nome[2] = "Vanderlei";
        
        for(int i = 0; i < nome.length; i++){
            System.out.println(nome[i]);
        }
        
        Aluno alunos = new Aluno();
        alunos.setId(10);
        alunos.setNome("Mauricio");
        alunos.setDataNascimento("15/05/1973");
        
        Professor profs = new Professor();
        profs.setId(10);
        profs.setNome("Luis");
        profs.setDisciplina("Java");
        
        Turma turma = new Turma();
        turma.setId(1);
        turma.setSala("301");
        turma.setAluno(alunos);
        turma.setProf(profs);
        
        System.out.println("Professor " + turma.getProf().getNome());
        System.out.println("Data nascimento aluno " + turma.getAluno().getDataNascimento());
        
    }
    
}
