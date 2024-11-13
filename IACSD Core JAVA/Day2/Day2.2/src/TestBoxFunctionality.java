import java.util.Scanner;

class TestBoxFunctionality {
    public static void main(String[] args) {

        System.err.println("Enter side of cube");
        Scanner sc = new Scanner(System.in);

        Box b2,b3;

        // b1=new Box(sc.nextInt());
        // System.out.println("Dimensions of Cube are \n"+b1.getCubeDimensions());

        // System.err.println("Cube Calculations are "+b1.getBoxVolume());\
        System.err.println("Enter the First Values");
        b2 = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        
        System.err.println("Enter the Second Value");
        b3=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        sc.close();

        if (b2 == b3) {
            System.err.println("Both Instances are equal");
        }else{
            System.err.println("not Equal");
        }

    }
}
;