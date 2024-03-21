package models;

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

    public void acessar(String senha)
    {
        MetodosComuns.acessar(senha);
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
            throw new Exception(("CPF é obrigatório."));
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