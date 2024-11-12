package com.app.core;

public class Assignment {
    
    private int x;
    private int y;
    
    public Assignment(int xx,int yy){
        this.x = xx;
        this.y = yy;
    }

    public String getDetails(){
        return "Value of X and Y is "+this.x+" and "+this.y+"";
    }

    public boolean isEqual(Assignment anotherpoint){
        return this.x == anotherpoint.x && this.y == anotherpoint.y;
    }

    public Double calculateDistance(Assignment anotherpoint2d){
        double x = Math.pow(this.x - anotherpoint2d.x,2);
        double y = Math.pow(this.y - anotherpoint2d.y,2);
        return Math.sqrt(x+y);
    }    
}
