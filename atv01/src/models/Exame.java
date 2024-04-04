package models;

import java.time.LocalDate;

public class Exame extends Procedimento{

    public Exame(String consulta, LocalDate data, String descritivo) throws Exception {
        setConsulta(consulta);
        setData(data);
        setDescritivo(descritivo);
    }

    public void mostrar() {
        System.out.println("EXAME============>>>");
        System.out.println("consulta:" + getConsulta());
        System.out.println("Data:" + getData());
        System.out.println("Descritivo:" + getDescritivo());
    }
}
