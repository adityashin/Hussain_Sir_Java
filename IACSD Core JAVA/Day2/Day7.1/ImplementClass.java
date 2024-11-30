public class ImplementClass implements Computeable,Printable{
    
    @Override
    public void print(String msg){
        System.out.println(msg);
    }

    @Override
    public double compute(double a ,double b){
        return a+b;
    }
}