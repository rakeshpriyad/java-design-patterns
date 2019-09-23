package com.design.patterns.behavioral.strategy.best;

public class Domestic implements OwnerStrategy{
    @Override
    public boolean isForeign() {
        return false;
    }

    @Override
    public int fee() {
        return 0;
    }
}
