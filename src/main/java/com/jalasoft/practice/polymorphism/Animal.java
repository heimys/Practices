package com.jalasoft.practice.polymorphism;

public class Animal {
    String name;
    String color;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Animal(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void desplazar(){
        System.out.println("caminando");
    }
}


/*** main.java
 * package com.jalasoft.practice;
 *
 * import com.jalasoft.practice.loop.CountryFilter;
 * import com.jalasoft.practice.polymorphism.Animal;
 * import com.jalasoft.practice.polymorphism.Ave;
 * import com.jalasoft.practice.polymorphism.Pez;
 *
 * import java.util.ArrayList;
 * import java.util.List;
 *
 * public class Main {
 *     public static void main(String[] args){
 *        // CountryFilter countryFilter = new CountryFilter();
 *        // countryFilter.filterTask();
 *
 *         Animal animal = new Animal("perro", "blanco");
 *         Animal animal1 = new Ave("paloma", "plomo");
 *         Animal animal2 = new Pez("pejerrey", "negro");
 *         List<Animal> animales = new ArrayList<>();
 *         animales.add(animal);
 *         animales.add(animal1);
 *         animales.add(animal2);
 *
 *         animales.stream().forEach(value -> value.desplazar());
 *
 *     }
 * }
 ***/