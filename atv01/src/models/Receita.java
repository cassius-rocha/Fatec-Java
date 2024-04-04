package models;

import java.time.LocalDate;

public class Receita extends Procedimento{

    public Receita(String consulta, LocalDate data, String descritivo) throws Exception{
        setConsulta(consulta);
        setData(data);
        setDescritivo(descritivo);
    }

    @Override
    public void mostrar() {
        System.out.println("RECEITA============>>>");
        System.out.println("Data:"+getData());
        System.out.println("Descritivo:"+getDescritivo());
    }
}
