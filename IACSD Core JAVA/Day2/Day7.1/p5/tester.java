package p5;

public class tester extends Implement {
    public static void main(String[] args) {
        Implement im = new Implement();
        im.show();
        System.out.println(im.convert(24.24));

        boolean result = im.isEven(10);
        System.out.println("Number divisible by 2 result is "+result);

        im.print("Hello this is print method");
    }
}
