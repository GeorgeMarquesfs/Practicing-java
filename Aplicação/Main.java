package Aplicação;

import Entidades.*;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Cliente George = new Cliente("George","39837836", sdf.parse("29/07/1999"),"programador","george@hotmail.com");
        Atendente Lucas = new Atendente("Lucas","389746746",  sdf.parse("28/08/1998"),"Atendente","lucas@hotmail.com", NivelSuporte.ESPECIALIZADO);



        Chamado c1 = new Chamado(1,George,Lucas);

       c1.AberturaChamado(StatusSuporte.ABERTO);
        System.out.println(c1.getStatus());

        System.out.println(c1.AlterarStatusChamado(StatusSuporte.RESOLVIDO));

        System.out.println(c1.getStatus());
        System.out.println(c1.getStatus());

        System.out.println(sdf.format(George.getDataNascimento()));
    }
}
