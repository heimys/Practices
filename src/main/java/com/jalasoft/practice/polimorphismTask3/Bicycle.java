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

/*******Main class***/
/***
 * package com.jalasoft.practice;
 *
 * import com.jalasoft.practice.polimorphismTask3.Bicycle;
 * import com.jalasoft.practice.polimorphismTask3.Car;
 * import com.jalasoft.practice.polimorphismTask3.ListLandTransport;
 *
 * public class Main {
 *     public static void main(String[] args){
 *
 *         ListLandTransport trans = new ListLandTransport();
 *         trans.addLand(new Bicycle("Cross", 1500, false, false));
 *         trans.addLand(new Car("Audi", 20000, true, false));
 *         trans.display();
 *     }
 * }
 ***/