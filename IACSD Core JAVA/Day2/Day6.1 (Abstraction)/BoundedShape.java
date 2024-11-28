// The class has to be declared abstract if you wanna use abstract methods in your prg
public abstract class BoundedShape{

    //state
    private int x,y;
    public BoundedShape(int xx,int yy){
        x = xx;
        y = yy;
    }

    @Override
    public String toString(){
        return "Value of X="+x+" and Value of Y is "+y;
    }

    //add abstract method : supply method declaration
    public abstract double area();
}