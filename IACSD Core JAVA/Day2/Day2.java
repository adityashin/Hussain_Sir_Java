import java.util.Scanner;

class CreateBox {

    public static void main(String[] args) {
        //create scanner instance to wrap std i/p
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width height and dept");
        
        Box box1;//reference type of variable ,No object created so far, Method of local Variable
          
        // box1 = null;
        box1 = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        box1 = null;
        sc.close();
        System.out.println("Dimensions of Box1 is "+box1.getBoxDimensions());

        System.out.println("Volume of Box1 is "+box1.getBoxVolume());

        Box box2 = box1;
        System.out.println("Dimensions of Box2 is "+box2.getBoxDimensions());

        System.out.println("Volume of Box2 is "+box2.getBoxVolume());
    }
}
