package models;

import java.time.LocalDate;

public class Receita {
    private String consulta;
    private LocalDate data;
    private String descritivo;

    public Receita(String consulta, LocalDate data, String descritivo) throws Exception{
        setConsulta(consulta);
        setData(data);
        setDescritivo(descritivo);
    }

    public Receita()
    {
        
    }
    
    public void preescrever()
    {

    }

    public void consultarReceita(String data)
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
            throw new Exception("A data deve ser posterior a hoje.");
        } else
            this.data = data;
        }
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) throws Exception{
        if(descritivo.isEmpty()) {
            throw new Exception("O descritivo da receira precisa ser informado");
        } else {
            this.descritivo = descritivo;
        }
}