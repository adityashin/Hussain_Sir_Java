public class Mango extends fruit
 {

    public Mango(String color,double weight){
        super("Mango",color,weight);
    }
    
    @Override
    public String taste(){
        return "sweet";
    }

    public void pulp(){
       System.out.println(getName()+"Can be pupled ! ");
    }

    
}
