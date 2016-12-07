/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula11.ordem;

import com.github.kyriosdata.parser.Expressao;

import com.github.kyriosdata.parser.Lexer;

import com.github.kyriosdata.parser.Parser;

import com.github.kyriosdata.parser.Token;

import java.util.List;

/**
 * Classe para utilizar métodos a fim de descobrir o resultado
 * de uma expressão (matemática).
 * @version 1.0
 */
public class Exercicio {

    /**
    * Método para recer uma expressão do main e
    * analisá-la.
    * @link https://github.com/kyriosdata/parser
    * @param expressao final String - Expressão matemática recebida
    * @return parser - Expressão
    */
    private static Expressao exprPara(final String expressao) {
        List<Token> tokens = new Lexer(expressao).tokenize();
        Parser parser = new Parser(tokens);
        return parser.expressao();
    }

    /**
     * Método para verificar se a expressão recebida é aceitável.
     * @param frase final String - Expressão matemática recebida
     * @throws IllegalArgumentException - Caso a expressão recebida
     * seja inválida.
     * @return int - Valor lógico (0 ou 1)
     */
    public static final int avaliaExpressao(final String frase) {

        try {
            exprPara(frase).valor();
            return 0;
        } catch (IllegalArgumentException ex) {
            return 1;
        }
    }

    /**
     * Método para relacionar com o usuário recebendo receber
     * uma expressão e escrevendo na tela o resultado da mesma.
     * @param args final String[] - Expressão matemática dada pelo usuário
     * @throws IllegalArgumentException - Caso a expressão recebida
     * seja inválida.
     */
    public static final void main(final String[] args) {

        try {
            System.out.println(exprPara(args[0]).valor());
            System.exit(avaliaExpressao(args[0]));
        } catch (IllegalArgumentException ex) {
            System.exit(avaliaExpressao(args[0]));
        }
    }
}
