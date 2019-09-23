package com.design.patterns.behavioral.strategy.best;

public class IntProcessor {
    private Operation op;

    public IntProcessor(Operation op) {
        this.op = op;
    }

    public void operateOn(int x) {
        int y = f(x);
        System.out.println(x + " becomes " + y);
    }

    private int f(int x) {
        return op.f(x);
    }
}
