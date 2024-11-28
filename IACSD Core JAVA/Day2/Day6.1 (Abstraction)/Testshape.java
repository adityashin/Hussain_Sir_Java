import java.util.Scanner;

public class Testshape {
    public static void main(String[] args) {
        
        //dynamic init of array
        BoundedShape[] shapes = {new Circle(10, 20, 30),new Circle(40, 50, 60),new Circle(70, 80, 90)};

        //display complete details of each shape
        for(BoundedShape s : shapes){//upcasting
            System.out.println("Circles\n"+s.toString());
        }

    } 

}
