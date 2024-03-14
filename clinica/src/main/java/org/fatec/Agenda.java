package org.fatec;

import java.time.LocalDate;

public class Agenda {
    private LocalDate data;
    private String hora;
    private Medico medico;
    private Paciente paciente;



    public Agenda(){};

    public Agenda(LocalDate data, String hora, Medico medico, Paciente paciente) {
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
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
}
