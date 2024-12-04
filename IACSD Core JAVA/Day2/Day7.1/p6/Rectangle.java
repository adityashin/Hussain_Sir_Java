package p6;

public class Rectangle extends BoundedShape {
    
    private double width,height;

    public Rectangle(int x,int y,double width,double height){
        super(x,y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calArea(){
        return width*height;
    }

    @Override
    public double calcPerimeter(){
        return 2*(width+height);
    }

    @Override
    public String toString(){
        return "Rectangle "+super.toString()+" width = "+this.width+" height is "+height;
    }

}
