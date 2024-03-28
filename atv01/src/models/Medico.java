package models;

import java.time.LocalDate;

public class Medico
{
    private String nome;
    private String crm;
    private String telefone;
    private String especialidade;
    private String senha;   

    public Medico(String nome, String crm, String telefone, String especialidade, String senha) throws Exception{
        this.setNome(nome);
        this.setCrm(crm);
        this.setTelefone(telefone);
        this.setEspecialidade(especialidade);
        this.setSenha(senha);
    }

    public Medico()
    {
        
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.isEmpty()) {
            throw new Exception("Infome o nome do medico!");
        } else {
            this.nome = nome;
        }
    }

    public String getCrm() {
        return this.crm;
    }

    public void setCrm(String crm) throws Exception {
        if (crm.isEmpty()) {
            throw new Exception("Infome o crm !");
        } else {
            this.crm = crm;
        }
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSenha() {
        return "************";
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void mostrar() {
        System.out.println("Medico=========>");
        System.out.println("Nome:" + this.getNome());
        System.out.println("crm:" + this.getCrm());
        System.out.println("Telefone:" + this.getTelefone());
        System.out.println("Especialidade:" + this.getEspecialidade());
        System.out.println("Senha:" + this.getSenha());
    }

    public void preescrever(Consulta consulta) throws Exception {
        Exame ex1 = new Exame("", LocalDate.now(), "raio x");
        Exame ex2 = new Exame("", LocalDate.now(), "exame de sangue");
        Receita rc1 = new Receita("", LocalDate.now(), "dipirona");
        consulta.getExames().add(ex1);
        consulta.getExames().add(ex2);
        consulta.getReceitas().add(rc1);
    }
}
