package com.zarzul.token;

public abstract class Token {
    private String literal;
    private int row;
    private int column;


    protected Token() {

    }

    public String getLiteral() {
        return literal;
    }
}

