package application;

import domain.ContaBancariaInfo;

import java.util.Scanner;

public class AplicacaoSistema {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaBancariaInfo informacoes = new ContaBancariaInfo();

        do {
            System.out.println("Digite seu nome: ");
            informacoes.setNomeTitular(entrada.nextLine());
            System.out.println("Digite o codigo da conta: ");
            informacoes.setCodigoConta(entrada.nextInt());
            entrada.nextLine();
            System.out.println("Digite o saldo da conta: ");
            informacoes.getSaldo(entrada.nextDouble());
            entrada.nextLine();
            try {
                System.out.println("Você tem alguma dívida? (S/N)");
                String respUsuarioDivida = entrada.nextLine();

                if (!respUsuarioDivida.equalsIgnoreCase("s") && !respUsuarioDivida.equalsIgnoreCase("n")) {
                    throw new IllegalArgumentException("Resposta inválida! Digite S ou N.");
                }
                System.out.println("Resposta aceita: " + respUsuarioDivida);

            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                System.out.println("Argumento inválido.");
            }
            System.out.println("Todas as informações estão corretas?");
        }
    }
}
