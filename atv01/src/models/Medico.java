package models;

public class Medico 
{
    private String nome;
    private String crm;
    private String telefone;
    private String especialidade;
    private String senha;   

    public Medico(String nome, String crm, String telefone, String especialidade, String senha) throws Exception{
        setNome(nome);
        setCrm(crm);
        setTelefone(telefone);
        setEspecialidade(especialidade);
        setSenha(senha);
    }

    public Medico()
    {
        
    }

    public static Medico medicoValoresPadrao() {
        Medico novoMedico = new Medico();
        novoMedico.setNome("Indefinido");
        novoMedico.setCrm("Indefinido");
        novoMedico.setTelefone("123123");
        novoMedico.setEspecialidade("Clínico-geral");
        novoMedico.setSenha("123456");
        return novoMedico;
    }

    public void acessar(String senha)
    {
        MetodosComuns.acessar(senha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSenha() {
        return "**********";
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}