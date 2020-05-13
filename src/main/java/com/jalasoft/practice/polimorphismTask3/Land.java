package com.jalasoft.practice.polimorphismTask3;

public class Land extends Transport{
    private boolean hasMotor;
    public Land(String name, int price, boolean hasMotor) {
        super(name, price);
        this.hasMotor = hasMotor;
    }

    public String displayData(){
        return "name = " + getName() + "; price = " + getPrice() + "; hasMotor = " + hasMotor;
    }
}
