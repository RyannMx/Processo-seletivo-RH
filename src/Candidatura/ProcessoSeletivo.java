package Candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
    imprimirSelecionados();

    }

    static void imprimirSelecionados(){
        String[] candidatos = {"MARIELE","MARIA","ENZO","JAMES","MARCOS"};
        System.out.println("imprimendo lista de candidados");
        for(int indece=0; indece<candidatos.length;indece++){
            System.out.println("o candidado de n " + (indece+1) + " é " +candidatos[indece]);
        };

    }

    static void selecaoCandidatos(){
        String[] candidatos = {"BRUNO","MARIELE","MARIA","ENZO","JAMES","MARCOS","TULIO", "JULIA","AGUSTO","JAMESON","WELLS"};
        double salarioBase=2200.0;
        int candidatosSelecionados= 0;
        int candidatosAtual= 0;
        while (candidatosSelecionados< 5 && candidatosAtual <candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("o candidato " +candidato+ " solicitou este valor pretendido "+salarioPretendido);
            if (salarioBase>= salarioPretendido){
                System.out.println("o candidato " + candidato + " foi selecionado para a vaga ");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }

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