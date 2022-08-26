package com.LSP.LSP;

public class SalaryAccount  extends BasicAccount{
    @Override
    public void yield() {
        throw new UnsupportedOperationException("Salary account can't yield");
    }
}