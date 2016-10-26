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
public class Exercicio03Test {

    /* @Test(expected = IllegalArgumentException.class)
    public void numMenorQueValido() {
        Exercicio03.potenciaUsandoSomas(-4,-4);
    }
    @Test
    public void umNumeroCorreto(){
        assertEquals(15, Exercicio03.potenciaUsandoSomas(10,2));
    }
     */
    @Test(expected = IllegalArgumentException.class)
    public void numMenorValido() {
        Exercicio03.potenciaUsandoSomas(-1, -2);
    }

    @Test
    public void numeroCorreto() {
        assertEquals(16, Exercicio03.potenciaUsandoSomas(2, 4));
    }

}
