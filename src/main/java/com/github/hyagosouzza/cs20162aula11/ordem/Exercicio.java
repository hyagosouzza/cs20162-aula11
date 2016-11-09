/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula11.ordem;

import com.github.kyriosdata.parser.Expressao;

import com.github.kyriosdata.parser.Lexer;

import com.github.kyriosdata.parser.Parser;

import com.github.kyriosdata.parser.Token;

import java.util.Scanner;

import java.util.List;

/**
 * Classe para utilizar métodos a fim de descobrir o resultado
 * de uma expressão matemática.
 * @version 1.0
 */
public class Exercicio {

    /**
     * Método para relacionar com o usuário recebendo receber
     * uma expressão matemática e escrevendo na tela o resultado
     * da mesma.
     * @param []args final String
     * @throw IllegalArgumentException - Caso a expressão recebida
     * seja inválida.
     */
    public static final void main(final String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite uma expressão: ");
        String frase = ler.nextLine();

        try {
            System.out.println(exprPara(frase).valor());
            System.exit(avaliaExpressao(frase));
        } catch (IllegalArgumentException ex) {
            System.out.println("Expressão inválida!");
            System.exit(avaliaExpressao(frase));
        }
    }

    /**
    * Método para recer uma expressão matematica do main e
    * analisá-la.
    * @link https://github.com/kyriosdata/parser
    * @param expressao String - Expressão matematica recebida
    * pelo main
    * @return parser
    */
    private static Expressao exprPara (final String expressao) {
        List<Token> tokens = new Lexer(expressao).tokenize();
        Parser parser = new Parser(tokens);
        return parser.expressao();
    }

    /**
     * Método para verificar se o bissexto recebido é aceitável.
     * @param frase final String
     * @return int - Valor lógico (0 ou 1)
     */
    public static int avaliaExpressao(final String frase) {

        try {
            exprPara(frase).valor();
            return 0;
        } catch (IllegalArgumentException ex) {
            return 1;
        }
    }
}
