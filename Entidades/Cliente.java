package Entidades;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Cliente extends Pessoa{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Cliente(String nome, String CPF, Date dataNascimento, String profissao, String email) {
        super(nome, CPF, dataNascimento, profissao, email);
    }
}
