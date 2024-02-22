package models;

public class Paciente 
{
    private String nome;
    private String cpf;
    private String telefone;
    private char genero;
    private int idade;

    public Paciente(String nome, String cpf, String telefone, char genero, int idade)
    {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        this.genero = genero;
    }

    public Paciente()
    {

    }

    public static Paciente cadastrarPaciente(String nome, String cpf, String telefone, char genero, int idade)
    {
        Paciente novoPaciente = new Paciente();
        novoPaciente.setNome(nome);
        novoPaciente.setCpf(cpf);
        novoPaciente.setTelefone(telefone);
        novoPaciente.setGenero(genero);
        novoPaciente.setIdade(idade);
        return novoPaciente;
    }

    public void consultarPaciente(String data)
    {
        MetodosComuns.consultar(data);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
