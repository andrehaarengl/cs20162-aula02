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
public class Exercicio04Test {

    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorValido() {
        Exercicio04.propriedade3025(-5);
    }

    @Test
    public void numeroValido() {
        assertEquals(false, Exercicio04.propriedade3025(10));
    }

}
