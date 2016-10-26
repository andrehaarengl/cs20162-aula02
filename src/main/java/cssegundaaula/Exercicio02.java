package cssegundaaula;

/**
 *
 * @author andre
 */
public final class Exercicio02 {

    /**
     * Classe contendo apenas operações "static". Evita que instância seja
     * criada desnecessariamente.
     */
    private Exercicio02() {
    }

    /**
     *
     * @param a um inteiro para se realizar o produto dos numeros inteiros
     * psoitivos
     * @param b um inteiro para se realizar o produto dos numeros inteiros
     * psoitivos
     * @return s Resultado do produto dos numeros inteiros positovos
     */
    public static int produtoNumerosInterosPositvos(final int a, final int b) {
        int i, s, totalParcelas = a, parcela = b;
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("NUMERO INSERIDO INVALIDO");
        } else {
            if (b < a) {
                totalParcelas = b;
                parcela = a;
            }
            i = 1;
            s = 0;
            while (i <= totalParcelas) {
                s = s + parcela;
                i = i + 1;
            }
        }
        return s;
    }
}
