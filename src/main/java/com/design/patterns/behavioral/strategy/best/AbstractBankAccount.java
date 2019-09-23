package com.design.patterns.behavioral.strategy.best;

public abstract class AbstractBankAccount     implements BankAccount {
    protected int acctnum;
    protected int balance = 0;
    private OwnerStrategy owner = new Domestic();

    protected AbstractBankAccount(int acctnum) {
        this.acctnum = acctnum;
    }

    public boolean isForeign() {
        return owner.isForeign();
    }

    public int fee() {
        return owner.fee();
    }

    public void setForeign(boolean b) {
        owner = b ? new Foreign() : new Domestic();
    }

    public String toString() {
        String accttype = accountType();
        return accttype + " account " + acctnum
                + ": balance=" + balance + ", is "
                + owner.toString() + ", fee=" + fee();
    }

    String accountType(){
        return "Saving";
    }
}