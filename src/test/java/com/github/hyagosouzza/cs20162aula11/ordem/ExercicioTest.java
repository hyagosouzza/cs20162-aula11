package com.github.hyagosouzza.cs20162aula11.ordem;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExercicioTest {

    @Test
    public void testAvaliaExpressao() {
        String frase = "1 + 1";
        int expResult = 0;
        int result = Exercicio.avaliaExpressao(frase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAvaliaExpressao2() {
        String frase = "1 c a";
        int expResult = 1;
        int result = Exercicio.avaliaExpressao(frase);
        assertEquals(expResult, result);
    }
    
}
