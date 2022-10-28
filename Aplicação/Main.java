package Aplicação;

import Entidades.*;

public class Main {
    public static void main(String[] args) {


        Cliente George = new Cliente("George","39837836","1999-07-29","programador","george@hotmail.com");
        Atendente Lucas = new Atendente("Lucas","389746746","1978-03-12","Atendente","lucas@hotmail.com", NivelSuporte.ESPECIALIZADO);


        Chamado c1 = new Chamado(1,George,Lucas);

       c1.AberturaChamado(StatusSuporte.ABERTO);
        System.out.println(c1.getStatus());

        System.out.println(c1.AlterarStatusChamado(StatusSuporte.RESOLVIDO));

        System.out.println(c1.getStatus());
        System.out.println(c1.getStatus());
    }
}
