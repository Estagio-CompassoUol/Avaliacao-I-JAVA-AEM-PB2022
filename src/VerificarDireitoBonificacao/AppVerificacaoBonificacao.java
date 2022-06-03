package VerificarDireitoBonificacao;

import java.io.*;

import java.util.*;

public class AppVerificacaoBonificacao {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Scanner leituraDoub = new Scanner(System.in);
        CalcularBonificacao calcularBonificacao = new CalcularBonificacao();
        String sair = "";


        do{

            try {

                PrintWriter gravaArq = new PrintWriter("dadosFuncionarios.txt", "UTF-8");

                System.out.println("Informação de Bonificação dos usuários\n");
                System.out.println("Para realizar o calculo favor informar para quantos funcionários sera calculado: \n");

                int qtnFuncionarios = leituraDoub.nextInt();
                int ordem = 0;


                for (int i = 0; i < qtnFuncionarios; i++) {


                    ordem += 1;
                    System.out.printf("____________________________________________\n");
                    System.out.printf("Digite o nome do %dº funcionario ", ordem);
                    String nome = leitura.next();
                    System.out.printf("Digite o salário do funcionario ");
                    double salario = leituraDoub.nextDouble();

                    String bonificacao = calcularBonificacao.getValorBonificacao(salario);


                    gravaArq.printf("%s %s %s", nome, salario, bonificacao);
                    gravaArq.write(System.lineSeparator());

                }
                gravaArq.close();

                Scanner leituraArq = new Scanner(new File("dadosFuncionarios.txt"), "UTF-8");

                for (int i = 0; i < qtnFuncionarios; i++) {
                    String linha = leituraArq.nextLine();
                    String[] dado = linha.split(" ");
                    double salarioFunc = Double.parseDouble(dado[1]);
                    System.out.println(" ---------------------------------------------------");
                    if (salarioFunc > 2000) {
                        System.out.println("Usuário: " + dado[0]);
                        System.out.println("Salario: " + dado[1]);
                        System.out.println("Desconto: " + dado[2]);

                        double salarioLiquido = salarioFunc - Double.parseDouble(dado[2]);
                        System.out.println("Salario Líquido: " + salarioLiquido);

                    } else {
                        System.out.println("Usuário: " + dado[0]);
                        System.out.println("Salario: " + dado[1]);
                        System.out.println("Bônus: " + dado[2]);

                        double salarioLiquido = salarioFunc + Double.parseDouble(dado[2]);
                        System.out.println("Salario Líquido: " + salarioLiquido);
                    }


                }
                sair = "sair";
            } catch (IOException ie) {
                System.out.println("Erro ao criar arquivo\n");
                leituraDoub.nextLine();
            } catch (InputMismatchException ime) {
                System.out.println("Isso não um número válido \nDigite um numero válido");
                leituraDoub.nextLine();
            }

        }while(!sair.equals("sair"));
    }
}
