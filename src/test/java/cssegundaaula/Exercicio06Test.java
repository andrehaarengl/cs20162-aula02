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
public class Exercicio06Test {
    
   @Test (expected = IllegalArgumentException.class)
   public void numeroInvalido(){
       Exercicio06.primo(-1);
   }
    
   @Test
   public void numeroValido(){
       assertEquals(false, Exercicio06.primo(10));
   }
}
