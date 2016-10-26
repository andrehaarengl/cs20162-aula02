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
public class Exercicio05Test {

    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorValido() {
        Exercicio05.propriedade153(-5);
    }

    @Test
    public void numeroValido() {
        assertEquals(false, Exercicio05.propriedade153(25));

    }

}
