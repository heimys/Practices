package com.jalasoft.practice.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountryFilter {
    public void filterTask(){
        List<String> countries = new ArrayList<>();
        countries.add("Bolivia");
        countries.add("Argentina");
        countries.add("Argelia");
        countries.add("Portugal");
        countries.add("Italia");
        countries.add("Australia");

        System.out.println("----------------------------------------------------------\t");
        System.out.println("FOR:  List countries tht start with \"A\"");
        for(int index = 0; index < countries.size(); index ++){

            if(countries.get(index).startsWith("A")) {
                System.out.println(countries.get(index));
            }
        }

        System.out.println("FOR:  Countries that have more than 5 characters");
        for(int index = 0; index < countries.size(); index ++){

            if(countries.get(index).length() > 5){
                System.out.println(countries.get(index));
            }
        }

        System.out.println("FOR:  List Countries that sum of characters are pair");
        for(int index = 0; index < countries.size(); index ++){

            if(countries.get(index).length() % 2 == 0){
                System.out.println(countries.get(index) + " has " + countries.get(index).length());
            }
        }

        System.out.println("----------------------------------------------------------\t");
        System.out.println("FOREACH:  List countries tht start with \"A\"");
        countries.forEach(country -> {
            if(country.startsWith("A")) {
                System.out.println(country);
            }
        });

        System.out.println("FOREACH:  Countries that have more than 5 characters");
        countries.forEach(country -> {
            if(country.length() > 5) {
                System.out.println(country);
            }
        });

        System.out.println("FOREACH: List Countries that sum of characters are pair");
        countries.forEach(country -> {
            if(country.length() % 2 == 0) {
                System.out.println(country + " has " + country.length());
            }
        });

        System.out.println("----------------------------------------------------------\t");
        System.out.println("FOREACH + STREAM + FILTER:  List countries tht start with \"A\"");
        System.out.println(countries
                .stream()
                .filter(country -> country.startsWith("A"))
                .collect(Collectors.toList()));

        System.out.println("FOREACH + STREAM + FILTER:  Countries that have more than 5 characters");
        System.out.println(countries
                .stream()
                .filter(country -> country.length() > 5)
                .collect(Collectors.toList()));

        System.out.println("FOREACH + STREAM + FILTER:   List Countries that sum of characters are pair");
        System.out.println(countries
                .stream()
                .filter(country -> country.length() % 2 == 0)
                .collect(Collectors.toList()));

        System.out.println("FOREACH + STREAM + FILTER:  All in One");
        System.out.println(countries
                .stream()
                .filter(country -> country.startsWith("A"))
                .filter(country -> country.length() > 5)
                .filter(country -> country.length() % 2 == 0)
                .collect(Collectors.toList()));
    }
}
