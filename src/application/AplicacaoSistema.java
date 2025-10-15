package application;

import domain.*;

import java.util.Scanner;

public class AplicacaoSistema {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaBancariaInfo informacoes = new ContaBancariaInfo();
        SistemaExeptions exeptionsSystem = new SistemaExeptions();
        FuncoesBancarias funcoes = new FuncoesBancarias();
        FuncoesMenus funcoesMenu = new FuncoesMenus();
        Boolean continuacaoSistem;


        CadastroUser.cadastrarUser(informacoes);

        funcoesMenu.limpaTela();

        funcoesMenu.menuPrimario();
        informacoes.setRespUserMenu(entrada.nextInt());
        entrada.nextLine();

        funcoesMenu.limpaTela();

        funcoesMenu.menuSecundario(informacoes);
        informacoes.setRespUserMenuSecundario(entrada.nextInt());
        entrada.nextLine();

        funcoesMenu.menuTerciario(informacoes);
    }
}
