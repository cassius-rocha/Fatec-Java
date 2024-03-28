package models;

import java.time.LocalDate;

public class Exame extends Procedimento{
    private String consulta;

    public Exame(String consulta, LocalDate data, String descritivo) throws Exception {
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
        System.out.println("EXAME============>>>");
        System.out.println("consulta:" + this.getConsulta());
        System.out.println("Data:" + String.valueOf(this.getData()));
        System.out.println("Descritivo:" + this.getDescritivo());
    }
}
