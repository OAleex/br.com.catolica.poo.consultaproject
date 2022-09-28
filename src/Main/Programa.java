package Main;

import Model.*;
import Model.Psicologo.Psicologo;

import java.util.Calendar;


public class Programa {

    public static void main(String[] args) {
        // Endereco

        Endereco endereco1 = new Endereco("Brasil", "Avenida Paulista", "Casa",
                67, "Guarulhos", "Sao Paulo");

        Endereco endereco2 = new Endereco("Brasil", "Vila Dois Irmãos", "Apartamento",
                46, "Natal", "Rio Grande do Norte");

//         Usuario padrao + permissoes de Psicologo
        Psicologo psicologo1 = new Psicologo("Julio de Almeida Lima", endereco2, "Masculino", 33,
                "04/04/1989", "661.456.414-41", "(84) 9 9385-45579",
                "julioconsulta@br.com", "Adulto", "Comportamento Humano",
                "Remoto", "Superior",
                "Psicoterapia", "USP ", "Decimo", "O maior ouvinte do mundo.",
                "Ele faz aniversario no dia: 04/04");

        // Usuario padrão + permissoes de paciente

        Paciente paciente1 = new Paciente("Amanda Almeida", endereco1,
                "Feminino", 23, "04/05/1999",
                "444.555.444-94", "(83) 9 9245-5566",
                "amandaal@br.com", "Depressao", true, "a", 10,
                1500.0);
        System.out.println(paciente1);
        System.out.println(paciente1.getEndereco());

        System.out.println(psicologo1);
        System.out.println(psicologo1.getEndereco());
//        System.out.println("Este paciente esta com consulta com o doutor: " + psicologo1.getNomeCompleto() + "\n\n");
    }
}
