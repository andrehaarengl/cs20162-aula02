package cssegundaaula;

/**
 *
 * @author andre
 */
public final class Exercicio10 {

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Exercicio10() {
    }

    /**
     *
     * @param n inteiro para calcular o numeor harmonico
     * @return s o resultado do numero harmonico
     */
    public static int harmonico(final int n) {
        int i, s;
        if (n < 1) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        }
        i = 2;
        s = 1;
        while (i <= n) {
            s = s + (1 / i);
            i = i + 1;
        }
        return s;
    }
}
