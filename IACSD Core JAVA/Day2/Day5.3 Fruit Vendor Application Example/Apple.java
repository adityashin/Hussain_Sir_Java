public class Apple extends fruit {
    
    public Apple(String color,double weight){
        super("Apple", color, weight);
    }

    @Override
    public String taste(){
        return "Sweet";
    }

    public void pulp(){
        System.out.println(getName()+"Can be pulped!");
    }
}
