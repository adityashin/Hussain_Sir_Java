package com.app.Tester;
import java.util.Scanner;

import com.app.core.Box;

public class TestBoxFunctionality {
    public static void main(String[] args) {
        
        System.err.println("ENter the dimensions of BOX");

        Scanner sc = new Scanner(System.in);

        Box b1;
        b1 = new Box(sc.nextInt(),sc.nextInt(),sc.nextInt());

        System.err.println("Box dimensions are \n"+b1.getBoxDimensions());

        System.err.println("Box volume calculations are "+b1.getBoxVolume());
        
        sc.close();
    }
}
