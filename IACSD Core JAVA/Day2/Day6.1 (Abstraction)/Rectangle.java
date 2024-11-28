
public class Rectangle extends BoundedShape{
    
    //additional state
    int w,h;

    public Rectangle(int x,int y,int w,int h){
        super(x,y);
        this.w = w;
        this.h = h;
    }

    @Override
    public double area(){
        return w*h;   
    }

    @Override 
    public String toString()
    {
        return super.toString()+"Width = "+w+"height is "+h+"Area of Rectangle is "+area();
    }
}
