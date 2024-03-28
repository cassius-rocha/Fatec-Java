package models;

import java.time.LocalDate;

public class Medico extends Funcionario
{
    private String crm;
    private String especialidade;

    public Medico(String nome, String crm, String telefone, String especialidade, String senha) throws Exception{
        super(nome, telefone, senha);
        this.setCrm(crm);
        this.setEspecialidade(especialidade);
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


    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void mostrar() {
        System.out.println("Medico=========>");
        System.out.println("Nome:" + this.getNome());
        System.out.println("crm:" + this.getCrm());
        System.out.println("Telefone:" + this.getTelefone());
        System.out.println("Especialidade:" + this.getEspecialidade());
        System.out.println("Senha:" + this.getSenha());
    }

    //associação com Receita e Exame
    public void preescrever(Consulta consulta) throws Exception {
        Exame ex1 = new Exame("", LocalDate.now(), "raio x");
        Exame ex2 = new Exame("", LocalDate.now(), "exame de sangue");
        Receita rc1 = new Receita("", LocalDate.now(), "dipirona");
        consulta.getExames().add(ex1);
        consulta.getExames().add(ex2);
        consulta.getReceitas().add(rc1);
    }
}
