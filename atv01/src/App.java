import models.*;

import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            Recepcionista r1 = new Recepcionista("Maria", "234", "234234", "2234");
            Paciente p1 = r1.gravarNovoPaciente("marian", 20, 3, "Feminino", "234234");
            Medico m1 = new Medico("joana", "234", "234234", "orto", "234");
            Consulta c1 = r1.marcarNovaConsulta(LocalDate.now(), "22:00", m1, p1);
            m1.preescrever(c1);
            c1.mostrar();
        } catch (Exception var5) {
            PrintStream var10000 = System.out;
            String var10001 = String.valueOf(var5.getStackTrace());
            var10000.println(var10001 + "=>" + var5.getMessage());
        }

    }
}