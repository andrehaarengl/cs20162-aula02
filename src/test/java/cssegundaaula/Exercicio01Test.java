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
public class Exercicio01Test {

    @Test(expected = IllegalArgumentException.class)
    public void numMenorQueValido() {
        Exercicio01.somaInteirosNaturais(-4);
    }

    @Test
    public void umNumeroCorreto() {
        assertEquals(55, Exercicio01.somaInteirosNaturais(10));
    }

}
