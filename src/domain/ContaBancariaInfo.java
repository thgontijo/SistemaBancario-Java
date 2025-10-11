package domain;

public class ContaBancariaInfo {
    public int setCodigoConta;
    private String nomeTitular;
    private double saldo;
    private double dividas;
    private int codigoConta;

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo(double s) {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDividas() {
        return dividas;
    }

    public void setDividas(double dividas) {
        this.dividas = dividas;
    }

    public int getCodigoConta() {
        return codigoConta;
    }

    public void setCodigoConta(int codigoConta) {
        this.codigoConta = codigoConta;
    }
}
