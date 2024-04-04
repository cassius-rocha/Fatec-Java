package models;

import java.time.LocalDate;

public class Exame extends Procedimento{

    public Exame(String consulta, LocalDate data, String descritivo) throws Exception {
        setConsulta(consulta);
        setData(data);
        setDescritivo(descritivo);
    }

    @Override
    public void mostrar() {
        System.out.println("EXAME>>>>>>>>>>>>>>>>");
        super.mostrar();
    }
}
