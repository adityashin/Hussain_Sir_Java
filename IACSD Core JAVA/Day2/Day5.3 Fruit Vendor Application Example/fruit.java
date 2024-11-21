class fruit{
    private String name;
    private String color;
    private double weight;

    public fruit(String name,String color,double weight){
        super();
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    //common functionality added in the common super class: all fruits have taste
    public String taste(){
        return "no specific taste";
    }

    //overloading the object's toString method:method overloading
    @Override
    public String toString(){
        return "\nName is " + name + "\n Color is "+ color+ "\n Weight is "+weight;
    }
    
}