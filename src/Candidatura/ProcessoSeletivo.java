package Candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        String[] candidatos = {"MARIELE","MARIA","ENZO","JAMES","MARCOS"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }

    }

    static void imprimirSelecionados(){
        String[] candidatos = {"MARIELE","MARIA","ENZO","JAMES","MARCOS"};
        System.out.println("imprimendo lista de candidatos");
        for(int indece=0; indece<candidatos.length;indece++){
            System.out.println("o candidado de n " + (indece+1) + " é " +candidatos[indece]);
        };
    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizada=1;
        boolean continuaTentando= true;
        boolean atendeu = false;
        do {
            atendeu=atender();
            continuaTentando= !atendeu;

            if (continuaTentando){
                tentativasRealizada++;
            }else{
                System.out.println("Contato realizado com sucesso.");
            }
        }while (continuaTentando && tentativasRealizada<3);

        if (atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " +candidato+ " NA " +tentativasRealizada+ " TENTATIVA");
        }else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM "+candidato+ " NUMERO MAXIMO DE TENTATIVAS "+ tentativasRealizada+" REALIZADA");
        }

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