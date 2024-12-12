public class Try {
    public static void main(String[] args) {
         try{
            int a =100;
            int b=0;
            System.out.println("\nresult"+(a/ b));
         }catch(ArithmeticException e){
            System.out.println("\nException occured " + e);
         }
         System.out.println("\nCode continues");
    }
}
