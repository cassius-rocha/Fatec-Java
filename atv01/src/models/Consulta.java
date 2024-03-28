package models;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Consulta {
    private LocalDate data;
    private String hora;
    private Medico medico;
    private Paciente paciente;
    private Agenda agenda;
    private List<Exame> exames = new ArrayList();
    private List<Receita> receitas = new ArrayList();
    private String historico;
    private String motivo;

    public Agenda getAgenda() {
        return this.agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public List<Exame> getExames() {
        return this.exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    public List<Receita> getReceitas() {
        return this.receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }

    public Consulta(LocalDate data, String hora, Medico medico, Paciente paciente, String historico, String motivo) throws Exception {
        this.setData(data);
        this.setHora(hora);
        this.setMedico(medico);
        this.setPaciente(paciente);
        this.setHistorico(historico);
        this.setMotivo(motivo);
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) throws Exception {
        if (data.isBefore(LocalDate.now())) {
            throw new Exception("A data da consulta deve ser maior q hoje!!");
        } else {
            this.data = data;
        }
    }

    public String getHora() {
        return this.hora;
    }

    public void setHora(String hora) throws Exception {
        if (hora.isEmpty()) {
            throw new Exception("A hora precisa ser informada !");
        } else {
            this.hora = hora;
        }
    }

    public Medico getMedico() {
        return this.medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getHistorico() {
        return this.historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getMotivo() {
        return this.motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void marcar() {
    }

    public void mostrar() {
        System.out.println("==========>Consulta");
        System.out.println("Data:" + String.valueOf(this.getData()));
        System.out.println("Hora:" + this.getHora());
        this.medico.mostrar();
        this.paciente.mostrar();
        this.agenda.mostrar();
        System.out.println("Motivo:" + this.getMotivo());
        System.out.println("Historico:" + this.getHistorico());
        Iterator var1 = this.exames.iterator();

        while(var1.hasNext()) {
            Exame ex = (Exame)var1.next();
            ex.mostrar();
        }

        var1 = this.receitas.iterator();

        while(var1.hasNext()) {
            Receita re = (Receita)var1.next();
            re.mostrar();
        }

    }
}
