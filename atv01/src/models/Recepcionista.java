package models;

import java.time.LocalDate;

public class Recepcionista extends Funcionario{
    private String cpf;

    public Recepcionista() {
    }
    public Recepcionista(String nome, String cpf, String telefone, String senha) throws Exception {
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setSenha(senha);
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

    @Override
    public void calcularSalario(float salarioBruto) {
        float salario = (float) ((salarioBruto + 100.0f) * 0.9f);
        System.out.println("Salário líquido: " + salario);
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
