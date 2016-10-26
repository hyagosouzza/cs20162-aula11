package com.github.hyagosouzza.cs20162aula11.ordem;

import com.github.kyriosdata.parser.Expressao;
import com.github.kyriosdata.parser.Lexer;
import com.github.kyriosdata.parser.Parser;
import com.github.kyriosdata.parser.Token;
import java.util.Scanner;
import java.util.List;

public class Exercicio {
    
    public static void main (String[] args) {
        System.out.print("Digite uma expressão: ");
        Scanner ler = new Scanner(System.in);
        String frase = new.nextLine();
        throw new Exception("Erro!");
        try{
        System.out.println(exprPara(frase).valor());
        } catch (Exception ex) {
            System.out.println(ex.message());
        }
    }

    private static Expressao exprPara (String expressao) {
        List<Token> tokens = new Lexer(expressao).tokenize();
        Parser parser = new Parser(tokens);
        return parser.expressao();
    }
}
