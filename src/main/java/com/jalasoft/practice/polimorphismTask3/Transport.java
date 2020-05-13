package com.jalasoft.practice.polimorphismTask3;

public class Transport {
    private String name;
    public int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Transport(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
