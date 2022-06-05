package Quiz;

import java.util.*;

public class AppQuiz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        PerguntasRespostas pergundasRespostas = new PerguntasRespostas();
        List<String> respostasUsuario = new ArrayList<>();

        int opt = 0;

        Scanner leituraResp = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String usuario =  leituraResp.nextLine();


        do {

            int contCertas=0;
            int conterradas=0;

            System.out.println("=================================================================================");
           System.out.println("\nEsse Quiz são divididos em 3 categorias que possuem 4 pergundas cada:\n");            
           System.out.println("\nQual o tema que você quer tentar? digite \n1 - Futebool \n2 - Filmes \n3 - Curiosidades \n4 - Para sair\n");
                       
            try {
                opt = scan.nextInt();


                 if (opt == 1) {
                    PerguntasQuizFutebool perguntasQuiz = new PerguntasQuizFutebool();
                     System.out.println("Vamos começar\n");

                     for (int i=0; i< 4; i++) {
                         System.out.println("-------------------------------------------\n");
                         System.out.println(perguntasQuiz.getPerguntasFutebool().get(i).getPerguntas());

                         String resposta = leituraResp.nextLine();
                         if (perguntasQuiz.getPerguntasFutebool().get(i).getResposta().equalsIgnoreCase(resposta)) {
                             contCertas++;
                             System.out.println("Voce acertou\n");
                         } else {
                             conterradas++;
                             System.out.println("Voce errou\n");
                         }
                         respostasUsuario.add(resposta);
                    }
                     pergundasRespostas.ImprimirResultado(contCertas, conterradas, usuario,respostasUsuario);
                     respostasUsuario.clear();
                     System.out.printf("\nRespostas Corretas: ");
                     for (PerguntasRespostas respostaCorreta: perguntasQuiz.getPerguntasFutebool()) {
                         System.out.printf(" "+respostaCorreta.getResposta()+" ");
                     }
                     System.out.println("\n");

                } else if (opt == 2) {
                     PerguntasQuizFilmes perguntasQuiz = new PerguntasQuizFilmes();

                     for (int i=0; i< 4; i++) {
                            System.out.println("-------------------------------------------\n");
                             System.out.println(perguntasQuiz.getPerguntasFilmes().get(i).getPerguntas());

                                 String resposta = leituraResp.nextLine();
                                 if (perguntasQuiz.getPerguntasFilmes().get(i).getResposta().equalsIgnoreCase(resposta)) {
                                     contCertas++;
                                     System.out.println("Voce acertou");
                                 } else {
                                     conterradas++;
                                     System.out.println("Voce errou");
                                 }
                                 respostasUsuario.add(resposta);

                     }
                     pergundasRespostas.ImprimirResultado(contCertas, conterradas, usuario,respostasUsuario);
                     respostasUsuario.clear();
                     System.out.printf("\nRespostas Corretas: ");
                     for (PerguntasRespostas respostaCorreta: perguntasQuiz.getPerguntasFilmes()) {
                         System.out.printf(" "+respostaCorreta.getResposta()+" ");
                     }
                     System.out.println("\n");
                 } else if (opt == 3) {

                     PerguntasQuizCuriosidades perguntasQuiz = new PerguntasQuizCuriosidades();

                     for (int i=0; i< 4; i++) {
                         System.out.println("-------------------------------------------\n");
                         System.out.println(perguntasQuiz.getPerguntasCurios().get(i).getPerguntas());

                             String resposta = leituraResp.nextLine();
                             if (perguntasQuiz.getPerguntasCurios().get(i).getResposta().equalsIgnoreCase(resposta)) {
                                 contCertas++;
                                 System.out.println("Voce acertou");
                             } else {
                                 conterradas++;
                                  System.out.println("Voce errou");
                             }
                             respostasUsuario.add(resposta);

                     }

                     pergundasRespostas.ImprimirResultado(contCertas, conterradas,usuario, respostasUsuario);
                     respostasUsuario.clear();
                     System.out.printf("\nRespostas Corretas: ");
                     for (PerguntasRespostas respostaCorreta: perguntasQuiz.getPerguntasCurios()) {
                         System.out.print(" "+respostaCorreta.getResposta()+" ");
                     }
                     System.out.println("\n");
                 } else if (opt != 4) {
                    System.out.println("opção inválida!! Digite a opção correta.\n");
                }
            }catch (InputMismatchException ex){
                scan.nextLine();
                System.out.println("Digite um valor válido\n");

            }
        }while (opt != 4);

    }


}
