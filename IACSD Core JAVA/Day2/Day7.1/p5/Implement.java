package p5;

public class Implement implements C {
    
    @Override 
    public void show(){
        System.out.println("Method of Interface A");
    }

    @Override
    public double convert(double no){
        return no;
    }

    @Override 
    public boolean isEven(int no){
        if(no%2==0)
            return true;
        return false;
    }

    @Override
    public void print(String msg){
        System.out.println(msg);
    }

}
