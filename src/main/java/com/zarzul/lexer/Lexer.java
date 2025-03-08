package com.zarzul.lexer;

import com.zarzul.token.Token;
import com.zarzul.tokenfinder.TokenFinder;

import java.util.ArrayList;
import java.util.List;

public class Lexer {
    private final String program;
    private int position;
    private TokenFinder tokenFinder;

    public Lexer(String program, TokenFinder tokenFinder) {
        this.program = program;
        this.tokenFinder = tokenFinder;
    }

    public List<Token> lexAll() {
        List<Token> tokens = new ArrayList<>();

        while(current() != '\0') {

        }


        return List.of();
    }

    private char current() {
        if(position >= program.length()) {
            return '\0';
        }
        return program.charAt(position++);
    }

    public String getProgram() {
        return program;
    }
}
