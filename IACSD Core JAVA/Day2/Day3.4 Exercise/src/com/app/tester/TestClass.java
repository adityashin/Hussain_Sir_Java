package com.app.tester;
import com.app.core.Assignment;

public class TestClass {
    
    public static void main(String[] args) {
        
        Assignment p1 = new Assignment(10, 20);
        Assignment p2 = new Assignment(20,10);
        boolean b = p1.isEqual(p2);
        if (b){
            System.out.println("Both are equal");
        }else{
            System.out.println("Not equal");
        }

    }
}
