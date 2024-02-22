import models.Paciente;
import models.Medico;
import models.Recepcionista;

public class App {
    public static void main(String[] args) {
        Paciente teste = new Paciente("Giovana", "36811658827", "123456", 'M', 10);    
        teste.setIdade(5);
        Paciente teste2 = Paciente.cadastrarPaciente("Carlos", "123123", "123", 'M', 25);
        teste2.consultarPaciente("10/10/24");
        
        System.out.printf("%s %s %s %d", teste.getNome(), 
                            teste.getCpf(), teste.getTelefone(), teste.getIdade());

        Medico medico = new Medico("Durval", "1241234", "43453", "ortotrouxa", "123123");
        medico.acessar("123123");
    }
}
