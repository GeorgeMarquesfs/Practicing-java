package Entidades;

import java.util.Date;

public class Chamado {



    int id;
    String dataAbertura;
    StatusSuporte status;
    Cliente cliente;
    Atendente atendente;

    public Chamado(int id, Cliente cliente, Atendente atendente) {
        this.id = id;
        this.cliente = cliente;
        this.atendente = atendente;
    }

    public void AberturaChamado(StatusSuporte status){
        Date date = new Date();
        StatusSuporte statusAtual = this.status = status;
        System.out.println("Chamado iniciado, na data de : " + date + " com um status de " + statusAtual);
    }

    public String AlterarStatusChamado(StatusSuporte status){
        StatusSuporte novoStatus = this.status = status;
        return "O seu status foi alterado para " + novoStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public StatusSuporte getStatus() {
        return status;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }
}
