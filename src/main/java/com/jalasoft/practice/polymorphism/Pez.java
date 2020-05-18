package com.jalasoft.practice.polymorphism;

public class Pez extends Animal {
    public Pez(String name, String color){
        super(name, color);
    }

    @Override
    public void desplazar() {
        System.out.println("nadando");
    }
}
