package models;

public class Receita {
    private String consulta;
    private String data;
    private String descritivo;

    public Receita(String consulta, String data, String descritivo)
    {
        this.consulta = consulta;
        this.data = data;
        this.descritivo = descritivo;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }
}