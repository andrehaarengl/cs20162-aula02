package cssegundaaula;

/**
 *
 * @author andre
 */
public final class Exercicio05 {

    /**
     * valor fixo da formula.
     */
    public static final int CEM = 100;

    /**
     * valor fixo da formula.
     */
    public static final int DEZ = 10;

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Exercicio05() {
    }

    /**
     *
     * @param n inteiro para realizarmos a verificação se o numero possua a
     * propriedade 153
     * @return tru oo false retorna se sim ou não se ele tem essa propriedade.
     */
    public static boolean propriedade153(final int n) {
        final int noves = 9999;
        int nn = 0, i, j, k, xz = 0, f = 0;
        if (n < 0 || n > noves) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        } else {
            i = n / CEM;
            j = (n - CEM * i) / DEZ;
            k = n % DEZ;

            return nn == (n + j + k) * (n + j + k) * (n + j + k);
        }
    }

}
