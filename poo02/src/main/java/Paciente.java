/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author professor
 */
public class Paciente {
    public String nome;
    public String cpf;
    public String telefone;
    public char genero;
    public int idade;
    
    public void consultar(){
        //todo
    }    
    public boolean cadastrar(){
        //todo
        return false;
    }
    public void mostrar(){
        System.out.println("nome:"+nome);
        System.out.println("cpf:"+cpf);
        System.out.println("tel:"+telefone);
        System.out.println("Genero:"+genero);
        System.out.println("idade:"+idade);
    }
}
