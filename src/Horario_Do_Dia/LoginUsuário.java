package Horario_Do_Dia;

import java.sql.Time;
import java.time.LocalTime;

public class LoginUsuário {
    private String loginUsuario = "Admin";
    private String senha = "bolsaCompassUol";


    public boolean validarUsuario(String nome, String senha){
        if (this.loginUsuario.equals(nome) ){
            if (this.senha.equals(senha)){
                imprimirHoraDia();
                return true;
            }
        }
        return false;
    }
    public void imprimirHoraDia(){
        LocalTime horaAtual = LocalTime.now();
        System.out.println("\n"+horaAtual);
         int hora = horaAtual.getHour();
         int min = horaAtual.getMinute();

        if (hora>=6 && hora<12 && min<=59){
            System.out.println("Bom dia, você se logou ao nosso sistema.");
        } else if (hora>=12 && hora<18 && min<=59) {
            System.out.println("Boa tarde, você se logou ao nosso sistema.");
        } else if (hora>=18 && hora<24 && min<=59) {
            System.out.println("Boa noite, você se logou ao nosso sistema.");
        } else if (hora>=0 && hora<6 && min<=59) {
            System.out.println("Boa madrugada, você se logou ao nosso sistema.");
        }
        /*
        Se for das 6h as 11h59 da manhã, receberá “Bom dia, você se logou ao nosso sistema.”
         Se for das 12h as 17h59 da tarde, receberá “Boa tarde, você se logou ao nosso sistema.”
         Se for das 18h as 23h59 da noite, receberá “Boa noite, você se logou ao nosso sistema.”
         Se for das 00h as 05h59 da madrugada, receberá “Boa madrugada, você se logou ao nosso sistema.”
         */
    }
}
