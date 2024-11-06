class Box {
    
    //state of the Box:tight encapsulation

    private double width,height,depth; //instance variables;

    //parametrized constructor to init complete state of box
                //local variables👇
    public Box(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }

    //behaviour : methods
    public String getBoxDimensions(){
        return "Box Dimensions are \n width:"+width+"\n height:"+height+"\n depth:"+depth;
    }

    public double getBoxVolume(){
        return width*height*depth;
    }
}
