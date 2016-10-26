package cssegundaaula;

/**
 *
 * @author andre
 */
public final class Exercicio03 {

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Exercicio03() {
    }

    /**
     *
     * @param x interio para realizar a potencia usando somas
     * @param y interio para realizar a potencia usando somas
     * @return potencia resultado da potencia usando somas
     */
    public static int potenciaUsandoSomas(final int x, final int y) {
        int potencia = 1;
        int i = 1;
        if (x < 0 && y < 0) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        } else {
            while (i <= y) {
                potencia = (potencia * x);
                i = i + 1;
            }
            return potencia;
        }
    }
}
