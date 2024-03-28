package models;

public class Funcionario {
    private String nome;
    private String telefone;
    private String senha;

    public Funcionario() {

    }

    public Funcionario(String nome, String telefone, String senha) throws Exception {
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setSenha(senha);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.isEmpty()) {
            throw new Exception("Informe o nome.");
        } else {
            this.nome = nome;
        }
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return "********";
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
