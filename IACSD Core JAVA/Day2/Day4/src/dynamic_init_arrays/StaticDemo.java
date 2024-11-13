public class StaticDemo {

    //if value is not initialized by default the value become to 0;for static datatypes only
    public static int no = 56789;

    public static void DemoPrint(){
        System.out.println("One static method accessing other static method without object instancation \n");
    }
    public static void main(String[] args) {
        int no = 1234;
        //local variable printing
        System.out.println("Local variable declared within the Main = "+no+"\n");

        //static variable printing
        System.out.println("Static variable declared outside Main and called with classname ="+StaticDemo.no+"\n");

        //Calling static method within Main Static method
        DemoPrint();
        
    }
}
