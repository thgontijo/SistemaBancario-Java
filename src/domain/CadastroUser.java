package domain;

import java.util.Scanner;

public class CadastroUser {
    static Scanner entrada = new Scanner(System.in);
    static Boolean continuacaoSistem;
    static SistemaExeptions exeptionsSystem = new SistemaExeptions();
    static FuncoesMenus funcoesMenu = new FuncoesMenus();

    public static void cadastrarUser(ContaBancariaInfo informacoes) {
        do {
            System.out.println("Digite seu nome: ");
            informacoes.setNomeTitular(entrada.nextLine());

            System.out.println("Digite o código da conta (mínimo 4 dígitos):");
            String codigoDigitado = entrada.nextLine();

            if (codigoDigitado.length() >= 4) {
                String primeiros4 = codigoDigitado.substring(0, 4);
                int codigoInt = Integer.parseInt(primeiros4);
                informacoes.setCodigoConta(codigoInt);
                System.out.println("Os 4 primeiros dígitos são: " + informacoes.getCodigoConta());
            } else {
                System.out.println("Código muito curto!");
            }


            System.out.println("Digite o saldo da conta: ");
            informacoes.setSaldo(entrada.nextDouble());
            entrada.nextLine();

            System.out.println("Você tem alguma dívida? (S/N)");
            informacoes.setRespUserSouN(entrada.nextLine());
            exeptionsSystem.opcaoInvalidaResp(informacoes);

            if (informacoes.getRespUserSouN().equalsIgnoreCase("s")) {
                System.out.println("Digite o valor da divida: ");
                informacoes.setDividas(entrada.nextDouble());
                entrada.nextLine();
                System.out.println("Divida atualizada!");
            }

            System.out.println("Todas as informações estão corretas? (S/N)");
            informacoes.setRespUserSouN(entrada.nextLine());
            exeptionsSystem.opcaoInvalidaResp(informacoes);

            if (informacoes.getRespUserSouN().equalsIgnoreCase("n") || !informacoes.getRespUserSouN().equalsIgnoreCase("s")) {
                System.out.println("Reiniciando sistema...");
                funcoesMenu.limpaTela();
                continuacaoSistem = false;
            } else {
                continuacaoSistem = true;
            }
        } while (!continuacaoSistem);
    }
}
