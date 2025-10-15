package domain;

import java.util.Scanner;

public class FuncoesMenus {
    ContaBancariaInfo informacoes = new ContaBancariaInfo();
    FuncoesBancarias funcoes = new FuncoesBancarias();
    Scanner entrada = new Scanner(System.in);

    public void respUserContinuar() {
        System.out.println("-----------------");
        System.out.println("Digite qualquer coisa para prosseguir: ");
        entrada.nextLine();
        limpaTela();
        menuPrimario();
    }

    public void limpaTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println(" ");
        }
    }

    public void menuPrimario() {
        System.out.println("-----------MENU-DE-OPÇÕES------------------");
        System.out.println("1. Opções relacionadas as informações.");
        System.out.println("2. Opções relacionadas ao saldo.");
        System.out.println("3. Opções relacionadas as dívidas.");
        System.out.println("4. Sair.");
        System.out.println("Digite sua opção: ");
    }

    public void menuSecundario(ContaBancariaInfo informacoes) {
        switch (informacoes.getRespUserMenu()) {
            case 1:
                System.out.println("-----------MENU-DE-INFORMAÇÕES------------------");
                System.out.println("1. Exibir informações.");
                System.out.println("2. Alterar informações.");
                System.out.println("3. Voltar.");
                System.out.println("Digite sua opção: ");
                break;

            case 2:
                System.out.println("-----------MENU-DE-OPÇÕES-SALDO-------------");
                System.out.println("1. Verificar saldo com dívidas.");
                System.out.println("2. Verificar saldo sem dívidas.");
                System.out.println("3. Aumentar saldo.");
                System.out.println("4. Diminuir saldo.");
                System.out.println("5. Voltar.");
                System.out.println("Digite sua opção: ");
                break;

            case 3:
                System.out.println("-----------MENU-DE-OPÇÕES-DIVÍDAS----------------");
                System.out.println("1. Verificar dívidas.");
                System.out.println("2. Aumentar dívidas.");
                System.out.println("3. Diminuir dívidas.");
                System.out.println("4. Voltar.");
                System.out.println("Digite sua opção: ");
                break;

            case 4:
                System.out.println("Saindo...");
                informacoes.setArgumentoValido(false);
                break;

            default:
                System.out.println("Digite um valor válido!");
                break;
        }
    }

    public void menuTerciario(ContaBancariaInfo informacoes) {
        if (informacoes.getRespUserMenu() == 1) {
            switch (informacoes.getRespUserMenuSecundario()) {
                case 1:
                    funcoes.informacoesUsuario();
                    respUserContinuar();
                    break;

                case 2:
                    CadastroUser.cadastrarUser(informacoes);
                    respUserContinuar();
                    break;

                case 3:
                    System.out.println("Voltando...");
                    limpaTela();
                    menuPrimario();
                    break;

                default:
                    System.out.println("Digite um valor válido!");
                    break;
            }
        } else if (informacoes.getRespUserMenu() == 2) {
            switch (informacoes.getRespUserMenuSecundario()) {
                case 1:
                    funcoes.verificarSaldo();
                    respUserContinuar();
                    break;

                case 2:
                    funcoes.verificarSaldoSemDivida();
                    respUserContinuar();
                    break;

                case 3:
                    funcoes.aumentarSaldo();
                    respUserContinuar();
                    break;

                case 4:
                    funcoes.diminuirSaldo();
                    respUserContinuar();
                    break;

                case 5:
                    System.out.println("Voltando...");
                    limpaTela();
                    menuPrimario();
                    break;

                default:
                    System.out.println("Digite um valor válido!");
                    break;
            }
        } else if (informacoes.getRespUserMenu() == 3) {
            switch (informacoes.getRespUserMenuSecundario()) {
                case 1:
                    funcoes.verificarDividas();
                    respUserContinuar();
                    break;

                case 2:
                    funcoes.aumentarDividas();
                    respUserContinuar();
                    break;

                case 3:
                    funcoes.diminuirDividas();
                    respUserContinuar();
                    break;

                case 4:
                    System.out.println("Voltando...");
                    limpaTela();
                    menuPrimario();
                    break;

                default:
                    System.out.println("Digite um valor válido!");
                    break;
            }
        }
    }
}
