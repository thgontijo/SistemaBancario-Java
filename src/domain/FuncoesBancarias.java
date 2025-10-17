package domain;

import java.util.Scanner;

public class FuncoesBancarias extends ContaBancariaInfo {
    Scanner entrada = new Scanner(System.in);
    double novoValor;
    boolean isValorValido;
    boolean isValorPositivo;

    public void informacoesUsuario(ContaBancariaInfo informacoes) {
        System.out.println("EXIBINDO-INFORMAÇÕES: ");
        System.out.println("Nome titular: " + informacoes.getNomeTitular());
        System.out.println("Código da conta: " + informacoes.getCodigoConta());
        System.out.println("Saldo da conta: " + informacoes.getSaldo());
        System.out.println("Divida da conta: " + informacoes.getDividas());
    }

    public void verificarSaldo(ContaBancariaInfo informacoes) {
        double saldo = informacoes.getSaldo() - informacoes.getDividas();
        System.out.println("Saldo: " + saldo);
    }

    public void verificarSaldoSemDivida(ContaBancariaInfo informacoes) {
        System.out.println("Saldo: " + informacoes.getSaldo());
    }

    public void aumentarSaldo(ContaBancariaInfo informacoes) {
        System.out.println("AUMENTANDO-SALDO: ");
        System.out.println("Digite o valor que deseja aumentar: ");
        novoValor = entrada.nextDouble();
        entrada.nextLine();
        isValorValido = SistemaExeptions.valorNegativoInvalido(novoValor);
        if (isValorValido) {
            informacoes.setSaldo(informacoes.getSaldo() + novoValor);
            System.out.println("Saldo alterado! Novo valor: " + informacoes.getSaldo());
        }
    }

    public void diminuirSaldo(ContaBancariaInfo informacoes) throws IllegalArgumentException {
        System.out.println("DIMINUINDO-SALDO: ");
        System.out.println("Digite o valor que deseja diminuir: ");
        novoValor = entrada.nextDouble();
        entrada.nextLine();
        informacoes.setDiminuirSaldo(novoValor);
        isValorValido = SistemaExeptions.valorInvalido(informacoes.getSaldo(), informacoes.getDiminuirSaldo());
        isValorPositivo = SistemaExeptions.valorNegativoInvalido(novoValor);
        if (isValorValido && isValorPositivo) {
            novoValor = informacoes.getSaldo() - informacoes.getDiminuirSaldo();
            informacoes.setSaldo(novoValor);
            System.out.println("Saldo alterado! Novo valor: " + informacoes.getSaldo());
        }
    }

    public void verificarDividas(ContaBancariaInfo informacoes) {
        System.out.println("EXIBINDO-DÍVIDAS: ");
        System.out.println("Dívidas: " + informacoes.getDividas());
    }

    public void aumentarDividas(ContaBancariaInfo informacoes) {
        System.out.println("AUMENTANDO-DÍVIDAS: ");
        System.out.println("Digite o valor que deseja aumentar: ");
        novoValor = entrada.nextDouble();
        entrada.nextLine();
        isValorValido = SistemaExeptions.valorNegativoInvalido(novoValor);
        if (isValorValido) {
            informacoes.setDividas(informacoes.getDividas() + novoValor);
            System.out.println("Dívida alterada! Novo valor: " + informacoes.getDividas());
        }
    }

    public void diminuirDividas(ContaBancariaInfo informacoes) {
        System.out.println("DIMINUINDO-DÍVIDAS: ");
        System.out.println("Digite o valor que deseja diminuir: ");
        novoValor = entrada.nextDouble();
        entrada.nextLine();
        informacoes.setDividaAtualizada(novoValor);
        isValorValido = SistemaExeptions.valorInvalido(informacoes.getDividas(), informacoes.getDividaAtualizada());
        isValorPositivo = SistemaExeptions.valorNegativoInvalido(novoValor);
        if (isValorValido && isValorPositivo) {
            informacoes.setDividas(informacoes.getDividas() - informacoes.getDividaAtualizada());
            System.out.println("Dívida alterada! Novo valor: " + informacoes.getDividas());
        }
    }
}


