package cssegundaaula;

/**
 *
 * @author andre
 */
public final class Exercicio04 {

    /**
     * valor fixo da formula.
     */
    public static final int CEM = 100;

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Exercicio04() {
    }

    /**
     *
     * @param n inteiro para realizarmos a verificação se o numero possua a
     * propriedade 3025.
     * @return true or false retorna se sim ou não se ele tem essa propriedade.
     */
    public static boolean propriedade3025(final int n) {
        final int noves = 9999;
        int i, j, nn = 0;
        if (n < 0 || n > noves) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        } else {
            i = n / CEM;
            j = n % CEM;
            nn = (i + j) * (i + j);
            if (n != nn) {
                return false;
            }
        }
        return true;
    }
}
