package com.jalasoft.practice.polymorphism;

public class Ave extends Animal {
    public Ave(String name, String color){
        super(name, color);
    }

    @Override
    public void desplazar() {
        System.out.println("volando");
    }
}
