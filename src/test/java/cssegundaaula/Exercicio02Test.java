/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssegundaaula;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andre
 */
public class Exercicio02Test {

    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorValido() {
        Exercicio02.produtoNumerosInterosPositvos(-5, -4);
    }

    @Test
    public void umNumeroValido() {
        assertEquals(50, Exercicio02.produtoNumerosInterosPositvos(10, 5));
    }

}
