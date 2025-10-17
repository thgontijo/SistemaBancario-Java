package application;

import domain.*;

import java.util.Scanner;

public class AplicacaoSistema {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaBancariaInfo informacoes = new ContaBancariaInfo();
        FuncoesMenus funcoesMenu = new FuncoesMenus(informacoes);


        CadastroUser.cadastrarUser(informacoes);

        funcoesMenu.limpaTela();

        funcoesMenu.menuPrimario();

        funcoesMenu.limpaTela();

        funcoesMenu.menuSecundario();

        funcoesMenu.menuTerciario();
    }
}
