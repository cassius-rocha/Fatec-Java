package models;

import java.time.LocalDate;

public class Exame {
    private String consulta;
    private LocalDate data;
    private String descritivo;

    public Exame(String consulta, LocalDate data, String descritivo) throws Exception {
        setConsulta(consulta);
        setData(data);
        setDescritivo(descritivo);
    }

    public Exame()
    {
        
    }

    public void solicitar()
    {

    }
    
    public void consultarExame(String data)
    {
        MetodosComuns.consultar(data);
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) throws Exception {
        if (data.isBefore(LocalDate.now())) {
            throw new Exception("A data do exame deve ser posterior a hoje.");
        } else {
            this.data = data;
        }
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) throws Exception {
        if(descritivo.isEmpty()) {
            throw new Exception("O descritivo do exame precisa ser informado.");
        } else {
            this.descritivo = descritivo;
        }
    }
}