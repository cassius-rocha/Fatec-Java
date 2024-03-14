package models;

import java.time.LocalDate;

public class Exame {
    private String consulta;
    private LocalDate data;
    private String descritivo;

    public Exame(String consulta, LocalDate data, String descritivo)
    {
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

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }
}