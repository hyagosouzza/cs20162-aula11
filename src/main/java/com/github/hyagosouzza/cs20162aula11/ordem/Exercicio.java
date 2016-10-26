package com.github.hyagosouzza.cs20162aula11.ordem;

import com.github.kyriosdata.parser.Expressao;
import com.github.kyriosdata.parser.IParser;
import com.github.kyriosdata.parser.Lexer;
import com.github.kyriosdata.parser.Parser;
import com.github.kyriosdata.parser.Token;
import java.util.List;

public class Exercicio {
    
    public static void main(String[] args) {
        System.out.println(exprPara("1 + 1").valor());
        System.out.println(exprPara(args[0]).valor());
    }

    private static Expressao exprPara(String expressao) {
        List<Token> tokens = new Lexer(expressao).tokenize();
        Parser parser = new Parser(tokens);
        return parser.expressao();
    }
}
