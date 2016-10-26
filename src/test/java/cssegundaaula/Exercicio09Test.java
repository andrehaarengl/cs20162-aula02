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
public class Exercicio09Test {

    @Test(expected = IllegalArgumentException.class)
    public void numeroInvalido() {
        Exercicio09.crivoDois(-5, -1);
    }

    @Test
    public void numeroValido() {
        assertEquals(5, Exercicio09.crivoDois(5, 10));
    }

}
