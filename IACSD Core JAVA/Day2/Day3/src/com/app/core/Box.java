package com.app.core;

//Giving Access Specifier "public" because some file is going to access this file from outside to this folder 
public class Box {
    
    private int width,height,depth;
    private int side;

    public Box(int w,int h,int d){
        width = w;
        height = h;
        depth = d;
    }

    public Box(int side){
        this.width=this.height=this.depth = side;
    }

    public String getBoxDimensions(){
        return "BOX dimensions are "+width+" * "+ height+" * "+depth;
    }

    public Integer getBoxVolume(){
        return width*height*depth;
    }
    
    public String getCubeDimensions(){
        return "Cube dimensions are "+side+" * "+side+" * "+side+"";
    }

}
