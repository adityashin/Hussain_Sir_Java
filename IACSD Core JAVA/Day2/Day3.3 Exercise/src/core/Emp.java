package src.core;

public class Emp {
    private int id;
    private String name;
    private double sal;
    
    public Emp(int i,String n,double s){
        id = i;
        name = n;
        sal = s;
    }

    public void setSal(double s){
        this.sal = s;
    }
    public Double getSal(){
        return sal;
    }
}
