package p6;

public class Circle extends BoundedShape{

    private double radius;

    public Circle(int x,int y,double radius){
        super(x, y);
        this.radius = radius;
    }
    @Override
    public double calArea(){
        return PI*radius*radius ;
    }

    @Override
    public double calcPerimeter(){
        return 2*PI*radius*radius;
    }

    @Override
    public String toString(){
        return "Value of x and y is "+super.toString()+" Value of radius is "+radius;
    }
    
}
