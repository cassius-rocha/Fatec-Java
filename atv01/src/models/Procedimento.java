package models;

import java.time.LocalDate;

public class Procedimento {
    private LocalDate data;
    private String descritivo;

    public Procedimento(LocalDate data, String descritivo) throws Exception {
        this.setData(data);
        this.setDescritivo(descritivo);
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) throws Exception{
        if (data.isBefore(LocalDate.now())) {
            throw new Exception("A data da receita deve ser maior q hoje!!");
        } else {
            this.data = data;
        }
    }

    public String getDescritivo() {
        return this.descritivo;
    }

    public void setDescritivo(String descritivo) throws Exception{
        if (descritivo.isEmpty()) {
            throw new Exception("O descritivo da receita precisa ser informado!");
        } else {
            this.descritivo = descritivo;
        }
    }
}
