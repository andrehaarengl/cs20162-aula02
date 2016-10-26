package cssegundaaula;

/**
 *
 * @author andre
 */
public final class Exercicio06 {

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Exercicio06() {
    }

    /**
     *
     * @param n inteiro para ser verificado se é um numero primo ou não
     * @return true or false se é um numero primo ou não
     */
    public static boolean primo(final int n) {
        int i = 2;
        if (n < 1) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        }
        while (i <= (n - 1)) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
