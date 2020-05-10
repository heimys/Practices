package com.jalasoft.practice.loop;

import java.util.ArrayList;
import java.util.List;

public class Task {

    public void exercise(){
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(15);
        test.add(6);
        test.add(11);
        test.add(4);

        for(int index = 0; index < test.size(); index ++){
            System.out.println(test.get(index));
        }
        System.out.println("-------------------");
        test.stream().forEach(value -> System.out.println(value));
        System.out.println("-------------------");

        for(int index = 0; index < test.size(); index ++){
            if (test.get(index) < 10){
                System.out.println(test.get(index));

            }
        }

        System.out.println("--filter-----------------");
        test.stream()
                .filter(value -> value < 10)
                .filter(value -> value % 2 == 0)
                .forEach(value -> System.out.println(value));
        System.out.println("------------map-------");

    }
}
