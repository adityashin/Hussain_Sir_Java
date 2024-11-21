public class Orange extends fruit {
    
    public Orange(String color,double weight){
        super("Orange",color,weight);
    }

    @Override
    public String taste(){
        return "Sour";
    }

    public void juice(){
        System.out.println(getName()+ "Can be pulped!");
    }
}
