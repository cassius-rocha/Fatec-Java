package org.fatec;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Paciente p1 = new Paciente();
            p1.setGenero("Feminino");
            p1.setTelefone("2345-2344");
            p1.setNome("maria da silva");
            p1.setCodigo(1);
            p1.setIdade(20);
            p1.mostrar();
        } catch(Exception err){
            System.out.println(err.getMessage());
        }
        try {
            Paciente jose = new Paciente("Jose da silva",
                    "3455-34555", "masculino", 50, 4);
            jose.mostrar();
        } catch (Exception err){
            System.out.println(err.getMessage());
        }
        

    }
}