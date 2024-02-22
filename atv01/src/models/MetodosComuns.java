package models;

public class MetodosComuns 
{
    public static void acessar(String senha) 
    {
        if(senha.equals(senha))
        System.out.println("\nAcesso realizado com sucesso.\n");

        else System.out.println("\nSenha incorreta, acesso negado.\n");
    }
    
    public static void consultar(String data)
    {
        System.out.printf("\nConsulta agendada para %s.\n", data );
    }
}