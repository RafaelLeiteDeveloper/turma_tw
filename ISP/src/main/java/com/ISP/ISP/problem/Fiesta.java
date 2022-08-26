package com.ISP.ISP.problem;

public class Fiesta implements Car {
    @Override
    public void charge() {
        throw new UnsupportedOperationException("I'm not an electric car");
    }

    @Override
    public void openDoor() {
        //abrir a porta
    }
}