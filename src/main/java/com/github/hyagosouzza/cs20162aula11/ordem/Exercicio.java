package com.github.hyagosouzza.cs20162aula11.ordem;

import com.github.kyriosdata.parser.Expressao;
import com.github.kyriosdata.parser.Lexer;
import com.github.kyriosdata.parser.Parser;
import com.github.kyriosdata.parser.Token;
import java.util.Scanner;
import java.util.List;

public class Exercicio {

    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite uma expressão: ");
        String frase = ler.nextLine();

        try {
            System.out.println(exprPara(frase).valor());
            System.exit(avaliaExpressao(frase));
        } catch (IllegalArgumentException ex){
            System.out.println("Expressão inválida!");
            System.exit(avaliaExpressao(frase));        }
    }

    private static Expressao exprPara (String expressao) {
        List<Token> tokens = new Lexer(expressao).tokenize();
        Parser parser = new Parser(tokens);
        return parser.expressao();
    }

    public static int avaliaExpressao(String frase) {

        try {
            exprPara(frase).valor();
            return 0;
        } catch (IllegalArgumentException ex){
            return 1;
        }
    }
}
