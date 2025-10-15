package domain;

import java.util.Scanner;

public class FuncoesBancarias extends ContaBancariaInfo {
    Scanner entrada = new Scanner(System.in);
    double novoValor;

    public void informacoesUsuario() {
        System.out.println("EXIBINDO-INFORMAÇÕES: ");
        System.out.println("Nome titular: " + this.getNomeTitular());
        System.out.println("Código da conta: " + this.getCodigoConta());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("Divida da conta: " + this.getDividas());
    }

    public double verificarSaldo() {
        double saldo = getSaldo() - getDividas();
        return saldo;
    }

    public void verificarSaldoSemDivida() {
        System.out.println("Saldo: " + getSaldo());
    }

    public void aumentarSaldo() {
        System.out.println("AUMENTANDO-SALDO: ");
        System.out.println("Digite o valor que deseja aumentar: ");
        novoValor = entrada.nextDouble();
        entrada.nextLine();
        setSaldo(getSaldo() + novoValor);
        System.out.println("Saldo alterado! Novo valor: " + getSaldo());
    }

    public void diminuirSaldo() throws IllegalArgumentException {
        System.out.println("DIMINUINDO-SALDO: ");
        System.out.println("Digite o valor que deseja diminuir: ");
        novoValor = entrada.nextDouble();
        entrada.nextLine();
        setDiminuirSaldo(novoValor);
        boolean isSaldoValido = SistemaExeptions.valorInvalido(this.getSaldo(), this.getDiminuirSaldo());
        if (isSaldoValido) {
            setSaldo(getSaldo() - getDiminuirSaldo());
            System.out.println("Saldo alterado! Novo valor: " + getSaldo());
        }
    }

    public void verificarDividas(){
        System.out.println("EXIBINDO-DÍVIDAS: ");
        System.out.println("Dívidas: " + getDividas());
    }

    public void aumentarDividas(){
        System.out.println("AUMENTANDO-DÍVIDAS: ");
        System.out.println("Digite o valor que deseja aumentar: ");
        novoValor = entrada.nextDouble();
        entrada.nextLine();
        setDividas(getDividas() + novoValor);
        System.out.println("Dívida alterada! Novo valor: " + getDividas());
    }

    public void diminuirDividas(){
        System.out.println("DIMINUINDO-DÍVIDAS: ");
        System.out.println("Digite o valor que deseja diminuir: ");
        novoValor = entrada.nextDouble();
        entrada.nextLine();
        setDividaAtualizada(novoValor);
        boolean isValorValido = SistemaExeptions.valorInvalido(this.getDividas(), this.getDividaAtualizada());
        if (isValorValido) {
            setDividas(getDividas() - getDividaAtualizada());
            System.out.println("Dívida alterada! Novo valor: " + getDividas());
        }
    }
}


