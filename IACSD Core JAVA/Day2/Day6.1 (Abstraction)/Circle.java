import static java.lang.Math.PI;
public class Circle extends BoundedShape {
    
    //additional state
    
    private double radius;

    public Circle(int x , int y,double r){
        super(x, y);
        radius = r;
    }

    @Override
    public double area(){
        return PI*radius*radius; 
    }

    @Override
    public String toString(){
        return "cicle "+super.toString()+" radius = "+radius+"Area of Circle is "+area();
    }
    
}
