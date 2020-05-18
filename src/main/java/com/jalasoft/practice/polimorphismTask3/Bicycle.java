package com.jalasoft.practice.polimorphismTask3;

public class Bicycle extends Land{
    private boolean exerciseBike;

    public Bicycle(String name, int price, boolean hasMotor, boolean exerciseBike) {
        super(name, price, hasMotor);
        this.exerciseBike = exerciseBike;
    }
    public String displayData(){
        return super.displayData() + "; exerciseBike = " + exerciseBike;
    }
}
