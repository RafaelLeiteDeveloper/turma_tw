package com.LSP.LSP;

public class BasicAccount {

    protected double balance = 0;

    public void yield() {
        this.balance += (this.balance * 0.15);
    }
    
}
