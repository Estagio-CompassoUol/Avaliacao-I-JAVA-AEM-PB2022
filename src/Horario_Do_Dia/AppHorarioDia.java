package Horario_Do_Dia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppHorarioDia {
    public static void main(String[] args) {
        LoginUsuário login = new LoginUsuário();
        Scanner scan = new Scanner(System.in);
        boolean validacao=false;

        System.out.println("\n\nPara executar o app é necessário digitar o login e senha para logar\n");

        do {

            try {
                System.out.print("Digite o login: ");
                String nome = scan.next();
                System.out.print("Digite a senha: ");
                String senha = scan.next();
                validacao=login.validarUsuario(nome, senha);
                if (validacao== false) {
                    System.out.println("\nUsuário e/ou senha incorretos.\n");
                }

            } catch (InputMismatchException ex) {
                System.out.println("\nErro encontrado - Digite uma opção valida");
                scan.nextLine();
            }
        }while (validacao == false);
    }
}
