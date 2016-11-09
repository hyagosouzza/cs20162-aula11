package com.github.hyagosouzza.cs20162aula11.ordem;

import com.github.kyriosdata.parser.Expressao;
import com.github.kyriosdata.parser.Lexer;
import com.github.kyriosdata.parser.Parser;
import com.github.kyriosdata.parser.Token;
import java.util.Scanner;
import java.util.List;

public class Exercicio {

    public static void main (String[] args) throws RuntimeException {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite uma expressão: ");
        String frase = ler.nextLine();
        StringBuilder sb = new StringBuilder();

        try {
            System.out.println(exprPara(frase).valor());
            int status = avaliaExpressao(args, sb);
            System.out.println(sb.toString());
            System.exit(status);
        } catch (RuntimeException ex){
            System.out.println("Expressão inválida!");
            int status = avaliaExpressao(args, sb);
            System.exit(status);
        }
    }

    private static Expressao exprPara (String expressao) {
        List<Token> tokens = new Lexer(expressao).tokenize();
        Parser parser = new Parser(tokens);
        return parser.expressao();
    }

    public static int avaliaExpressao(String[] args, StringBuilder sb) {

        try {
            sb = (exprPara(args).valor());
            return 0;
        } catch (RuntimeException ex){
            sb = (exprPara(args).valor());
            return 1;
        }
    }
}
