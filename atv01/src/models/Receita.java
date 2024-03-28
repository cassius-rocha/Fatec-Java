package models;

import java.time.LocalDate;

public class Receita {
    private String consulta;
    private LocalDate data;
    private String descritivo;

    public Receita(String consulta, LocalDate data, String descritivo) throws Exception{
        this.setConsulta(consulta);
        this.setData(data);
        this.setDescritivo(descritivo);
    }

    public Receita()
    {
        
    }

    public String getConsulta() {
        return this.consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) throws Exception {
        if (data.isBefore(LocalDate.now())) {
            throw new Exception("A data da receita deve ser maior q hoje!!");
        } else {
            this.data = data;
        }
    }

    public String getDescritivo() {
        return this.descritivo;
    }

    public void setDescritivo(String descritivo) throws Exception {
        if (descritivo.isEmpty()) {
            throw new Exception("O descritivo da receita precisa ser informado!");
        } else {
            this.descritivo = descritivo;
        }
    }

    public void mostrar() {
        System.out.println("RECEITA============>>>");
        System.out.println("consulta:" + this.getConsulta());
        System.out.println("Data:" + String.valueOf(this.getData()));
        System.out.println("Descritivo:" + this.getDescritivo());
    }
}
