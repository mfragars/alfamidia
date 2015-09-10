/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pai;

/**
 *
 * @author noite
 */
public class Pessoa {
    private String id;
    private String nome;
    private String endereco;
    private String dataInicio;
    private String documento;

    public Pessoa() {
    }

    public Pessoa(String id, String nome, String endereco, String dataInicio, String documento) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.dataInicio = dataInicio;
        this.documento = documento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    
    
}
