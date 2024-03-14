package org.fatec;

public class Paciente {
    private String nome;
    private String telefone;
    private String genero;
    private int idade;
    private int codigo;

   public Paciente() throws Exception{
       setTelefone("");
       setGenero("");
       setCodigo(0);
       setNome("");
       setIdade(0);
   }

    public Paciente(String nome, String telefone, String genero,
                    int idade, int codigo) throws Exception {
        setNome(nome);
        setTelefone(telefone);
        setGenero(genero);
        setIdade(idade);
        setCodigo(codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public void setIdade(int idade) throws Exception{
       if(idade>=10 && idade<80){
           throw new Exception("Idade invalida, deve ser entre 10 e 80");
       } else {
           this.idade = idade;
       }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
       try {
           this.codigo = codigo;
       }
       catch(Exception err){
           System.out.println("Informe o codigo do paciente!");
           this.codigo = 0;
       }
    }

    public void cadastrar() {
        //todo
    }
    public void consultar(){
        //todo
    }
    public void mostrar(){
        System.out.println(">>>>>>>>>>Paciente<<<<<<<<<<<");
        System.out.println("codigo:"+ getCodigo());
        System.out.println("nome:"+ getNome());
        System.out.println("idade:"+ getIdade());
        System.out.println("genero:"+ getGenero());
        System.out.println("telefone:"+ getTelefone());
    }

}
