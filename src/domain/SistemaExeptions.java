package domain;

public class SistemaExeptions extends Exception {

    public static boolean opcaoInvalidaResp(ContaBancariaInfo informacoes) {
        try {
            if (!informacoes.getRespUserSouN().equalsIgnoreCase("s") && !informacoes.getRespUserSouN().equalsIgnoreCase("n")) {
                throw new IllegalArgumentException("Resposta inválida! Digite S ou N.");
            }
            return true;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean valorInvalido(double valorAtual, double novoValor) throws IllegalArgumentException {
        try {
            if (valorAtual < novoValor) {
                throw new IllegalArgumentException("O novo valor a diminuir deve ser menor ou igual ao valor anterior.");
            }
            return true;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }
}

