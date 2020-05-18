package com.jalasoft.practice.polimorphismTask3;

public class Car extends Land {
    private boolean userGas;

    public Car(String name, int price, boolean hasMotor, boolean useGas) {
        super(name, price, hasMotor);
    }

    public String displayData(){
        return super.displayData() + "; useGas = " + userGas;
    }
}
