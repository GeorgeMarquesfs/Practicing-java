package Entidades;

public class Atendente extends Pessoa {

    NivelSuporte nivelSuporte;

    public Atendente(String nome, String CPF, String dataNascimento, String profissao, String email, NivelSuporte nivelSuporte) {
        super(nome, CPF, dataNascimento, profissao, email);
        this.nivelSuporte = nivelSuporte;
    }


    public NivelSuporte getNivelSuporte() {
        return nivelSuporte;
    }

    public void setNivelSuporte(NivelSuporte nivelSuporte) {
        this.nivelSuporte = nivelSuporte;
    }

}
