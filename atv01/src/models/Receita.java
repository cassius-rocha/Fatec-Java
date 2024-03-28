package models;

import java.time.LocalDate;

public class Receita extends Procedimento{
    private String consulta;

    public Receita(String consulta, LocalDate data, String descritivo) throws Exception{
        super(data, descritivo);
        this.setConsulta(consulta);
    }

    public String getConsulta() {
        return this.consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public void mostrar() {
        System.out.println("RECEITA============>>>");
        System.out.println("consulta:" + this.getConsulta());
        System.out.println("Data:" + String.valueOf(this.getData()));
        System.out.println("Descritivo:" + this.getDescritivo());
    }
}
