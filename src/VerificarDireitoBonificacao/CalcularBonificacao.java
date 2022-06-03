package VerificarDireitoBonificacao;

import java.util.ArrayList;
import java.util.List;

public class CalcularBonificacao implements Bonificacao{
    @Override
    public String getValorBonificacao(double salario) {

            if (salario <= 1000) {
                String salarioCalc = String.valueOf(salario * 0.2);
                return salarioCalc ;
            } else {
                String salarioCalc = String.valueOf(salario * 0.10);
                return salarioCalc;
            }
    }


}
