package Entidades;


import java.util.Date;

public class Pessoa {

    String nome;
    String CPF;
    Date dataNascimento;
    String profissao;
    String email;


    public Pessoa(String nome, String CPF, Date dataNascimento, String profissao, String email) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.profissao = profissao;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
