package models;

import java.time.LocalDate;

public class Medico extends Funcionario
{
    private String crm;
    private String especialidade;

    public Medico(String nome, String crm, String telefone, String especialidade, String senha) throws Exception{
        setNome(nome);
        setCrm(crm);
        setTelefone(telefone);
        setEspecialidade(especialidade);
        setSenha(senha);
    }

    public String getCrm() {
        return crm;
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
        System.out.println("Nome:" + getNome());
        System.out.println("crm:" + getCrm());
        System.out.println("Telefone:" + getTelefone());
        System.out.println("Especialidade:" + getEspecialidade());
        System.out.println("Senha:" + getSenha());
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
