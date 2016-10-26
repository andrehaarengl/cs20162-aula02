package cssegundaaula;

/**
 *
 * @author andre
 */
public final class Exercicio08 {

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Exercicio08() {
    }

    /**
     *
     * @param a inteiro para poder descobrir o mairo diviso comum
     * @param b inteiro para poder descobrir o mairo diviso comum
     * @return a retorna qual o maior divisor comum
     */
    public static int maiorDivisorComum(int a, int b) {
        int m;
        if (a < b && b < 0) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        }
        while (b != 0) {
            m = a % b;
            a = b;
            b = m;
        }
        return a;
    }
}
