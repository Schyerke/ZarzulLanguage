package com.zarzul.tokenfinder;

public abstract class TokenFinder {
    private final TokenFinder next;

    protected TokenFinder(TokenFinder next) {
        this.next = next;
    }

    public String match(String subString) {
        if(next == null) {
            return null;
        }
        return next.match(subString);
    }
}
