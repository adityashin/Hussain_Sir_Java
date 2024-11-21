import java.util.Scanner;

public class testfruit {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number of Fruits");
    
    //Number of fruits in basket and which fruits are in basket
    fruit[] Basket = new fruit[sc.nextInt()];
    boolean exit = false;
    int counter =0;

    while (!exit) {
        System.out.println("\n Choose from the following Options \n 1.Mango \n 2.Apple \n3.Orange \n4.Taste_OF_Fruit \n 100. Close");
        System.out.println("Choose your Option");
        Integer optString = sc.nextInt();
        switch (optString) {
            case 1:
                if (counter < Basket.length) {
                    System.out.println("Enter color and Weight of Mango");
                    //upcasting
                    Basket[counter++] = new Mango(sc.next(),sc.nextDouble());
                }else{
                    System.out.println("******************************  Basket is Full ********************************");
                }
                break;
            case 2:
                if (counter < Basket.length) {
                    System.out.println("Enter color and weight of Apple");
                    //upcasting
                    Basket[counter++] = new Apple(sc.next(), sc.nextDouble());
                }else{
                    System.out.println("******************************  Basket if Full ********************************");
                }
                break;
            case 3:
                if (counter < Basket.length) {
                    System.out.println("Enter color and weight");
                    //upcasting
                    Basket[counter++] = new Orange(sc.next(),sc.nextDouble());
                }else{
                    System.out.println("*****************************  Basket is Full ***********************************");
                }
                break;
            case 4:
                
                System.out.println("Enter Fruit number");
                int index = sc.nextInt();
                if (index >=0 && index < counter) {
                    fruit f = Basket[index];
                    if (f instanceof Mango) {
                        System.out.println("********************* The Taste of the Mango is "+ ((Mango)f).taste()+" ****************************");
                    }else if (f instanceof Apple) {
                        System.out.println("********************* The Taste of the Apple is "+ ((Apple)f).taste()+" ****************************");
                    }else if (f instanceof Orange ) {
                        System.out.println("********************* The Taste of the Orange is "+ ((Orange)f).taste()+" ****************************");
                    }
                }
                break;
            default:
            case 100:
                exit = true;
                System.out.println("*************************** Application Closed Successfully ******************************");
                break;
        }
    }


    sc.close();
        
    }
}
  