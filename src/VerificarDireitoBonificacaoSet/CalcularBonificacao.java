package VerificarDireitoBonificacaoSet;

public class CalcularBonificacao implements Bonificacao{


    public void ImprimirDados(){

    }
      @Override
    public double getValorBonificacao(double salario) {

            if (salario <= 1000) {
                return salario * 0.2;
            } else {
                return salario * 0.10;
            }
    }


}
