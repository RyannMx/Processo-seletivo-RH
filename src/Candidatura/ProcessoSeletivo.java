package Candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        String[] candidatos = {"BRUNO","JAMES","MARCOS","TULIO", "JULIA","AGUSTO","JAMESON","WELLS"};

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }

    static void analisarCandidados(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase> salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDADO CONTRA PROPOSTA");

        }else {
            System.out.println("AGUARDADNDO DEMAIS CANDIDADOS");
        }
    }
}
