package org.fatec;

import java.time.LocalDate;

public class Consulta {
    private LocalDate data;
    private String hora;
    private Medico medico;
    private Paciente paciente;

    private String historico;
    private String motivo;

    public Consulta(LocalDate data, String hora, Medico medico, Paciente paciente, String historico, String motivo) {
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
        setHistorico(historico);
        setMotivo(motivo);
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

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
