package VerificarDireitoBonificacaoSet;

import java.util.*;

public class AppVerificacaoBonificacao {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Scanner leituraDoub = new Scanner(System.in);
        CalcularBonificacao calcularBonificacao = new CalcularBonificacao();
        Salario salarioFunc;
        Set<Salario> infSalario = new HashSet<>();

        String sair = "";

        do{
            try {
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
                    double salarioBase = leituraDoub.nextDouble();

                    double bonificacao =calcularBonificacao.getValorBonificacao(salarioBase);

                    infSalario.add(new Salario(nome, salarioBase, bonificacao));
                }
                System.out.printf("____________________________________________\n");
                System.out.println("---------Resultado-----------\n");
                for (Salario salario: infSalario) {
                    if (salario.getSalario() > 2000) {
                        System.out.println("Usuário: " + salario.getNomeFunc());
                        System.out.println("Salario: " + salario.getSalario());
                        System.out.println("Desconto: " + salario.getBonificacao());

                        double salarioLiquido = salario.getSalario() - salario.getBonificacao();
                        System.out.println("Salario Líquido: " + salarioLiquido+ "\n");

                    } else {
                        System.out.println("Usuário: " + salario.getNomeFunc());
                        System.out.println("Salario: " + salario.getSalario());
                        System.out.println("Bônus: " + salario.getBonificacao());

                        double salarioLiquido = salario.getSalario() +
                                salario.getBonificacao();
                        System.out.println("Salario Líquido: " + salarioLiquido+ "\n");
                    }
                }
                sair = "sair";

            } catch (InputMismatchException ime) {
                System.out.println("Isso não um número válido \nDigite um numero válido");
                leituraDoub.nextLine();
            }

        }while(!sair.equals("sair"));
    }
}
