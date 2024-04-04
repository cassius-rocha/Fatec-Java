package models;

import java.time.LocalDate;

public class Agenda {
    private LocalDate data;
    private String hora;
    private Medico medico;
    private Paciente paciente;

    public Agenda() {
    }

    public Agenda(LocalDate data, String hora, Medico medico, Paciente paciente) throws Exception {
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) throws Exception {
        if (data.isBefore(LocalDate.now())) {
            throw new Exception("A data da consulta deve ser maior q hoje!!");
        } else {
            this.data = data;
        }
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) throws Exception {
        if (hora.isEmpty()) {
            throw new Exception("A hora precisa ser informada !");
        } else {
            this.hora = hora;
        }
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

    public void mostrar() {
        System.out.println("Agenda=========>");
        System.out.println("data:" + String.valueOf(this.getData()));
        System.out.println("hora:" + this.getHora());
        medico.mostrar();
        paciente.mostrar();
    }
}
