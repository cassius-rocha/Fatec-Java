import models.Paciente;
import models.Medico;
import models.Recepcionista;

public class App {
    public static void main(String[] args) throws Exception{

        //instância de paciente com construtor completo
        Paciente teste = new Paciente("Giovana", "36811658827",
                                      "123456", "Feminino", 10, 1);

        //instância de paciente com método cadastrarPaciente
        Paciente teste2 = Paciente.cadastrarPaciente("Carlos", "123123",
                                                    "123", "Masculino", 25, 2);
        teste2.consultarPaciente("10/10/24");
        
        //Instância de paciente sem parâmetros
        Paciente teste3 = new Paciente();

        teste.mostrar();
        teste2.mostrar();
        teste3.mostrar();
    }
}
