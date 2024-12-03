package p3;

public class ImplementClass implements A,B {
    
    //same method name same signature but different return types
    @Override
    public String show(){
        return null;
    }

    @Override 
    public void show(){
        System.out.println("hello");
    }

}
