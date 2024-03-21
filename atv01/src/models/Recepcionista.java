package models;

import java.util.Scanner;

public class Recepcionista
{
    private String nome;
    private String cpf;
    private String telefone;
    private String senha;
    
    public Recepcionista(String nome, String cpf, String telefone, String senha) throws Exception {
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setSenha(senha);
    }

    public Recepcionista()
    {
        
    }

    public void acessar(String senha) {
        if(MetodosComuns.acessar(senha)) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("""
                    Digite
                    1: marcar consulta
                    2: cancelar consulta
                    3: verificar consulta agendada
                    4: realizar consulta
                    5: atualizar consulta
                    """);
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    try {
                        Consulta novaConsulta = Consulta.marcar();
                    }
            }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome.isEmpty()) {
            throw new Exception("Informe o nome.");
        } else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if (cpf.isEmpty()) {
            throw new Exception("CPF é obrigatório.");
        } else
            this.cpf = cpf;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}