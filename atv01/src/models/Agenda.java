package models;

public class Agenda {
    private String data;
    private String hora;
    private String medico;
    private String paciente;

    public Agenda(String data, String hora, String medico, String paciente)
    {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
    }

    public Agenda()
    {
        
    }

    public void consultarAgenda(String data)
    {
        MetodosComuns.consultar(data);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
    
}