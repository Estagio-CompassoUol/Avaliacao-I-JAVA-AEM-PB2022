package VerificarDireitoBonificacaoSet;

public class Salario {

    private String nomeFunc;
    private double salario;
    private double Bonificacao;

    public Salario(String nomeFunc, double salario, double bonificacao) {
        this.nomeFunc = nomeFunc;
        this.salario = salario;
        Bonificacao = bonificacao;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacao() {
        return Bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        Bonificacao = bonificacao;
    }
}
