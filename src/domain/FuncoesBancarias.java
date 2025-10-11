package domain;

import java.util.Scanner;

public class FuncoesBancarias extends ContaBancariaInfo {
    private void informacoesUsuario() {
        System.out.println("Nome titular: " + this.getNomeTitular());
        System.out.println("Código da conta: " + this.getCodigoConta());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("Divida da conta: " + this.getDividas());
    }

}
