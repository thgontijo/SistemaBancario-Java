package domain;

public class ContaBancariaInfo {
    private String nomeTitular;
    private double saldo;
    private double diminuirSaldo;
    private double dividas;
    private double dividaAtualizada;
    private String codigoConta;
    private String respUserSouN;
    private int respUserMenu;
    private int respUserMenuSecundario;
    private boolean argumentoValido = true;

    public double getDiminuirSaldo() {
        return diminuirSaldo;
    }

    public void setDiminuirSaldo(double diminuirSaldo) {
        this.diminuirSaldo = diminuirSaldo;
    }

    public int getRespUserMenuSecundario() {
        return respUserMenuSecundario;
    }

    public void setRespUserMenuSecundario(int respUserMenuSecundario) {
        this.respUserMenuSecundario = respUserMenuSecundario;
    }

    public boolean isArgumentoValido() {
        return argumentoValido;
    }

    public void setArgumentoValido(boolean argumentoValido) {
        this.argumentoValido = argumentoValido;
    }

    public int getRespUserMenu() {
        return respUserMenu;
    }

    public void setRespUserMenu(int respUserMenu) {
        this.respUserMenu = respUserMenu;
    }

    public double getDividaAtualizada() {
        return dividaAtualizada;
    }

    public void setDividaAtualizada(double dividaAtualizada) {
        this.dividaAtualizada = dividaAtualizada;
    }

    public String getRespUserSouN() {
        return respUserSouN;
    }

    public void setRespUserSouN(String respUserSouN) {
        this.respUserSouN = respUserSouN;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
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

    public String getCodigoConta() {
        return codigoConta;
    }

    public void setCodigoConta(String codigoConta) {
        this.codigoConta = codigoConta;
    }
}
