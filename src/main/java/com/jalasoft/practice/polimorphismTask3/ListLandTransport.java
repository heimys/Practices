package com.jalasoft.practice.polimorphismTask3;

import java.util.ArrayList;
import java.util.List;

public class ListLandTransport {
    private List<Land> landList = new ArrayList<>();

    public void addLand(Land land){
        landList.add(land);
    }
    public void display(){
        landList.forEach(land -> System.out.println(land.displayData()));
    }

}
