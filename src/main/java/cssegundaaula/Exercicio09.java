package cssegundaaula;

/**
 *
 * @author andre
 */
public class Exercicio09 {

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Exercicio09() {
    }

    /**
     *
     * @param a inteiro para realizar o calculo do crivo
     * @param b inteiro para realizar o calculo do crivo
     * @return a retorna o resultado das
     */
    public static int crivoDois(int a, int b) {
        if (a < b && b < 0) {
            throw new IllegalArgumentException("NUMERO DIGITADO INVALIDO");
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
        }
        return a;
    }
}
