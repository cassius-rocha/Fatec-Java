package models;

public class Paciente 
{
    private String nome;
    private String cpf;
    private String telefone;
    private String genero;
    private int idade;
    private int codigo;

    public Paciente() throws Exception{
        setNome("");
        setCpf("");
        setTelefone("");
        setGenero("");
        setIdade(0);
        setCodigo(0);
    }

    public static Paciente cadastrarPaciente(String nome, String cpf, String telefone, String genero, int idade) throws Exception {
        Paciente novoPaciente = new Paciente();
        novoPaciente.setNome(nome);
        novoPaciente.setCpf(cpf);
        novoPaciente.setTelefone(telefone);
        novoPaciente.setGenero(String.valueOf(genero));
        novoPaciente.setIdade(idade);
        return novoPaciente;
    }

    public Paciente(String nome, String cpf, String telefone, String genero, int idade, int codigo)
            throws Exception
    {
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setGenero(genero);
        setIdade(idade);
        setCodigo(codigo);
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws Exception {
        if(idade < 10 || idade > 80){
            throw new Exception(("Idade inválida, deve ser entre 10 e 80."));
        } else {
            this.idade = idade;
        }
    }

    public int getCodigo() { return codigo; }

    public void setCodigo(int codigo) {
        try {
            this.codigo = codigo;
        }
        catch (Exception err){
            System.out.println("Informe o código do paciente.");
            this.codigo = 0;
        }
    }
}
