package models;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//agregação com Agenda, Exame, Receita, Medico(mãe), Paciente(mãe)
public class Consulta extends Agenda{
    private List<Exame> exames = new ArrayList();
    private List<Receita> receitas = new ArrayList();
    private String historico;
    private String motivo;

    public Consulta(LocalDate data, String hora, Medico medico, Paciente paciente, String historico, String motivo) throws Exception {
        super(data, hora, medico, paciente);
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
        setHistorico(historico);
        setMotivo(motivo);
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    public List<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
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

    public void marcar() {
    }

    public void mostrar() {
        System.out.println("==========>Consulta");
        System.out.println("Data:" + String.valueOf(this.getData()));
        System.out.println("Hora:" + this.getHora());
        getMedico().mostrar();
        getPaciente().mostrar();
        super.mostrar();
        System.out.println("Motivo:" + this.getMotivo());
        System.out.println("Historico:" + this.getHistorico());
        for(Exame ex :exames){
            ex.mostrar();
        }
        for(Receita re :receitas){
            re.mostrar();
        }
    }
}
