package models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {
    private LocalDate data;
    private String hora;
    private Medico medico;
    private Paciente paciente;
    private String motivo;
    private String historico;

    public Consulta(LocalDate data, String hora, Medico medico,
                    Paciente paciente, String motivo, String historico)
            throws Exception
    {
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
        setMotivo(motivo);
        setHistorico(historico);
    }

    public Consulta()
    {
        
    }

    public void marcar()
    {

    }
    
    public void cancelar()
    {

    }

    public void consultarConsulta(String data)
    {
        MetodosComuns.consultar(data);
    }

    public void realizar()
    {

    }

    public void atualizar()
    {

    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) throws Exception {
        if(medico == null){
            throw new Exception("Médico não pode ser nulo. Médico definido como clínico-geral");
        }
        this.medico = Medico.medicoValoresPadrao();
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
}
