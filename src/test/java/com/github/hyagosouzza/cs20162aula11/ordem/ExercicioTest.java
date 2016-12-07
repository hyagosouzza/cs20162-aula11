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
    
    @Test
    public void testAvaliaExpressao3() {
        String frase = "1 + @";
        int expResult = 1;
        int result = Exercicio.avaliaExpressao(frase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAvaliaExpressao4() {
        String frase = "1 + 1";
        int expResult = 0;
        int result = Exercicio.avaliaExpressao(frase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAvaliaExpressao5() {
        String frase = "1";
        int expResult = 0;
        int result = Exercicio.avaliaExpressao(frase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAvaliaExpressao6() {
        String frase = "1+*";
        int expResult = 1;
        int result = Exercicio.avaliaExpressao(frase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAvaliaExpressao7() {
        String frase = "3/3";
        int expResult = 0;
        int result = Exercicio.avaliaExpressao(frase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAvaliaExpressao8() {
        String frase = "2*8";
        int expResult = 0;
        int result = Exercicio.avaliaExpressao(frase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAvaliaExpressao9() {
        String frase = "1-1";
        int expResult = 0;
        int result = Exercicio.avaliaExpressao(frase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAvaliaExpressao10() {
        String frase = "&";
        int expResult = 1;
        int result = Exercicio.avaliaExpressao(frase);
        assertEquals(expResult, result);
    }
}
