package models;

import java.time.LocalDate;

public class Exame {
    private String consulta;
    private LocalDate data;
    private String descritivo;

    public Exame(String consulta, LocalDate data, String descritivo) throws Exception {
        this.setConsulta(consulta);
        this.setData(data);
        this.setDescritivo(descritivo);
    }

    public Exame()
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
            throw new Exception("A data do exame deve ser maior q hoje!!");
        } else {
            this.data = data;
        }
    }

    public String getDescritivo() {
        return this.descritivo;
    }

    public void setDescritivo(String descritivo) throws Exception {
        if (descritivo.isEmpty()) {
            throw new Exception("O descritivo do exame precisa ser informado!");
        } else {
            this.descritivo = descritivo;
        }
    }

    public void mostrar() {
        System.out.println("EXAME============>>>");
        System.out.println("consulta:" + this.getConsulta());
        System.out.println("Data:" + String.valueOf(this.getData()));
        System.out.println("Descritivo:" + this.getDescritivo());
    }
}
