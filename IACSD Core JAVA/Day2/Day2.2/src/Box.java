//keyword for encapsulation is class
public class Box {
    
    //state of the Box:tight encapsulation

    private double width,height,depth; //instance variables;
    @SuppressWarnings("unused")
    private int side;//instance variable


    //parametrized constructor to init complete state of box
     //local variables👇(current object reference)
    Box(double w,double h,double depth){
        width = w;
        height = h;
        this.depth = depth;
        //this keyword is used to unhide instance var from local variable
        //if the argument name and instance name are same then there might be a ambiguty problem occur
    }

    // overloaded constructor to initialize a cube
    Box(int side){
        this.width = side;
        this.depth = side;
        this.height = side;
        
    }


    //behaviour : methods
    String getBoxDimensions(){
        return "Box Dimensions are \n width:"+width+"\n height:"+height+"\n depth:"+depth;
    }

    double getBoxVolume(){
        return width*height*depth;
    }
}
