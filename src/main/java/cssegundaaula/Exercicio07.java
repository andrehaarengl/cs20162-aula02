package cssegundaaula;

/**
 *
 * @author andre
 */
public final class Exercicio07 {

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Exercicio07() {
    }

    /**
     *
     * @param a um vetor
     * @param n um inteiro
     */
    public static void crivo(final int a[], final int n) {
        int i = 2, cont, c;
        if (n < 1 && a[i] != 0 && n <= i && i <= 2) {
            //throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        } else {
            while (i <= (n / 2)) {
                if (a[i] == 0) {
                    c = i + i;
                    while (c <= n) {
                        a[c] = 1;
                        c = c + i;
                    }
                } else {
                }
                i = i + 1;
            }
        }
    }
}
