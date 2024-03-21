package models;

import java.time.LocalDate;

public class Agenda {
    private LocalDate data;
    private String hora;
    private Medico medico;
    private Paciente paciente;

    public Agenda(LocalDate data, String hora, Medico medico, Paciente paciente) throws Exception
    {
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
    }

    public void consultarAgenda(String data)
    {
        MetodosComuns.consultar(data);
    }

    public LocalDate getData() { return  data; }

    public void setData(LocalDate data) throws Exception {
        if(data.isBefore(LocalDate.now())){
            throw  new Exception("A data da consulta deve ser maior que hoje.");
        } else {
            this.data = data;
        }
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) throws Exception {
        if(hora.isEmpty()) {
            throw new Exception("A hora precisa ser informada.");
        } else {
            this.hora = hora;
        }
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

    public void mostrar(){
        System.out.println(">>>>>>>>>>Agenda<<<<<<<<<<<");
        System.out.println("data:"+ getData());
        System.out.println("hora:"+ getHora());
        System.out.println("medico:"+ getMedico());
        System.out.println("paciente:"+ getPaciente());
    }
}