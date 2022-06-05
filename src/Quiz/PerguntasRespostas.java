package Quiz;

import java.util.List;

public class PerguntasRespostas {
    private String Perguntas;
    private String resposta;

    private String respostasUsuário;

    public String getPerguntas() {
        return Perguntas;
    }

    public void setPerguntas(String perguntas) {
        Perguntas = perguntas;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }


    public String getRespostasUsuário() {
        return respostasUsuário;
    }

    public void setRespostasUsuário(String respostasUsuário) {
        this.respostasUsuário = respostasUsuário;
    }

    public void ImprimirResultado(int contCertas, int conterradas, String nome, List<String> respostas){

       System.out.println("=================================================================================");
       System.out.println("RESULTADO");
       System.out.println("____________________________\n");

        if(contCertas>conterradas && conterradas>0) {
           System.out.println("Parabéns "+nome +", Voce acertou " + contCertas + " resposta\n");
           System.out.println("Errou " + conterradas + " respostas\n");
            System.out.printf("Suas respostas foram: ");
           for (String resposta: respostas) {
               System.out.print (" "+resposta+ " ");
            }

       } else if (contCertas==conterradas) {
           System.out.println("Voce acertou " + contCertas + " resposta " );
           System.out.println("Errou " + conterradas + " respostas " +nome+"\n");
            System.out.printf("Suas respostas foram: ");
            for (String resposta: respostas) {
                System.out.print(" "+resposta+ " ");
            }

       } else if (contCertas==0) {
            System.out.println("Sorry "+nome +", Voce não acertou nenhuma resposta\n");
            System.out.println("Errou " + conterradas + " respostas\n");
            System.out.printf("Suas respostas foram: ");
            for (String resposta: respostas) {
                System.out.print(" "+resposta+ " ");
            }

       } else if (conterradas==0) {
            System.out.println("Parabens  "+nome +", Voce acertou " + contCertas + " resposta\n");
            System.out.println("E não errou nenhuma respostas\n");
            System.out.printf("Suas respostas foram: ");
            for (String resposta: respostas) {
                System.out.print(" "+resposta+" ");
            }

       }else {
           System.out.println("\nSorry "+nome +", Voce acertou somente " + contCertas + " resposta\n");
           System.out.println("E errou " + conterradas + " respostas\n");
            System.out.printf("Suas respostas foram: ");
            for (String resposta: respostas) {
                System.out.print(" "+resposta+" ");
            }

       }
   }
}
