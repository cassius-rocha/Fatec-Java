package models;

import java.time.LocalDate;
import java.util.Scanner;

public class Recepcionista {
    private String nome;
    private String cpf;
    private String telefone;
    private String senha;

    public Recepcionista() {
    }

    public Recepcionista(String nome, String cpf, String telefone, String senha) throws Exception {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);
        this.setSenha(senha);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.isEmpty()) {
            throw new Exception("Infome o nome da recepcionista!");
        } else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if (cpf.isEmpty()) {
            throw new Exception("Cpf é obrigatório !");
        } else {
            this.cpf = cpf;
        }
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return "*********";
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //associação com Paciente
    public Paciente gravarNovoPaciente(String nome, int idade, int codigo, String genero, String telefone) throws Exception {
        Paciente obj = new Paciente(nome, telefone, genero, idade, codigo);
        obj.cadastrar();
        obj.mostrar();
        return obj;
    }

    //associação com Consulta
    public Consulta marcarNovaConsulta(LocalDate data, String hora, Medico medico, Paciente paciente) throws Exception {
        Consulta obj = new Consulta(data, hora, medico, paciente, "", "");
        obj.marcar();
        obj.mostrar();
        return obj;
    }
}
