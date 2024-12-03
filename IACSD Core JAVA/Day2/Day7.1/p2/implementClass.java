package p2;

public class implementClass implements A,B{
    
    //remember the mandling concept of C++ same is performing here to separate both of the 
    @Override 
    public void show(){
        System.out.println("In show"); 
    }

    @Override
    public void show(String msg){
        System.out.println(msg);
    }
}
