package cssegundaaula;

/**
 *
 * @author andre
 */
public final class Exercicio01 {

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Exercicio01() {
    }

    /**
     *
     * @param n um inteiro para se calcular as soma dos numeros naturais
     * @return Resultado da soma dos n numeros naturais
     */
    public static int somaInteirosNaturais(final int n) {
        int s = 1, i = 2;
        if (n < 1) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        } else {

            while (i <= n) {
                s = s + i;
                i = i + 1;
            }
            return s;
        }
    }
}
