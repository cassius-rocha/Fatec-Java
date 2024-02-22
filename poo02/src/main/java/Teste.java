/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author professor
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Paciente maria = new Paciente();
        maria.cpf = "12345";
        maria.genero = 'F';
        maria.idade = 25;
        maria.nome = "Maria da silva";
        maria.telefone = "7898-7852";
        maria.mostrar();
    }    
}
