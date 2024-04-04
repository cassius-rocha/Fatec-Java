package models;

import java.time.LocalDate;

public abstract class Procedimento {
    private String consulta;
    private LocalDate data;
    private String descritivo;

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) throws Exception{
        if (data.isBefore(LocalDate.now())) {
            throw new Exception("A data do procedimento deve ser maior q hoje!!");
        } else {
            this.data = data;
        }
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) throws Exception{
        if (descritivo.isEmpty()) {
            throw new Exception("O descritivo da receita precisa ser informado!");
        } else {
            this.descritivo = descritivo;
        }
    }

    public void mostrar() {
        System.out.println("consulta:"+ getConsulta());
        System.out.println("Data:"+getData());
        System.out.println("Descritivo:"+getDescritivo());
    }
}
