package models;

public class MetodosComuns 
{
    public static boolean acessar(String senha)
    {
        if(senha.equals(senha)) {
            System.out.println("\nAcesso realizado com sucesso.\n");
            return true;
        } else {
            System.out.println("\nSenha incorreta, acesso negado.\n");
            return false;
        }
    }
    
    public static void consultar(String data)
    {
        System.out.printf("\nConsulta agendada para %s.\n", data );
    }
}