package p6;

public abstract class BoundedShape implements AreaComputation,PerimeterComputation {
    
    private int x,y;

    public BoundedShape(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString(){
        return "Value of X is "+x+"\nValue of Y is "+y;
    }
}
