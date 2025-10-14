package application;

import domain.ContaBancariaInfo;
import domain.FuncoesBancarias;
import domain.SistemaExeptions;

import java.util.Scanner;

public class AplicacaoSistema {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaBancariaInfo informacoes = new ContaBancariaInfo();
        SistemaExeptions exeptionsSystem = new SistemaExeptions();
        FuncoesBancarias funcoes = new FuncoesBancarias();
        Boolean continuacaoSistem;

        do {
            System.out.println("Digite seu nome: ");
            informacoes.setNomeTitular(entrada.nextLine());
            System.out.println("Digite o codigo da conta: ");
            informacoes.setCodigoConta(entrada.nextInt());
            entrada.nextLine();
            System.out.println("Digite o saldo da conta: ");
            informacoes.setSaldo(entrada.nextDouble());
            entrada.nextLine();
            System.out.println("Você tem alguma dívida? (S/N)");
            informacoes.setRespUserSouN(entrada.nextLine());
            exeptionsSystem.opcaoInvalidaResp();
            if (informacoes.getRespUserSouN().equalsIgnoreCase("s")) {
                System.out.println("Digite o valor da divida: ");
                informacoes.setDividas(entrada.nextDouble());
                System.out.println("Divida atualizada!");
            }
            System.out.println("Todas as informações estão corretas? (S/N)");
            informacoes.setRespUserSouN(entrada.nextLine());
            exeptionsSystem.opcaoInvalidaResp();
            if (informacoes.getRespUserSouN().equalsIgnoreCase("n")) {
                System.out.println("Reiniciando sistema...");
                funcoes.limpaTela();
                continuacaoSistem = false;
            }
            continuacaoSistem = true;
        } while (continuacaoSistem == false);

        funcoes.limpaTela();

        System.out.println("-----------MENU-DE-OPÇÕES------------------ ");
        System.out.println("1. Opções relacionadas as informações.");
        System.out.println("2. Opções relacionadas ao saldo.");
        System.out.println("3. Opções relacionadas as divídas.");
        System.out.println("4. Sair.");
    }
}
