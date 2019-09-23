package com.design.patterns.behavioral.strategy.best;

public class Foreign implements OwnerStrategy {
    public boolean isForeign() {
        return true;
    }

    public int fee() {
        return 500; // $5 is 500 cents
    }

    public String toString() {
        return "foreign";
    }
}