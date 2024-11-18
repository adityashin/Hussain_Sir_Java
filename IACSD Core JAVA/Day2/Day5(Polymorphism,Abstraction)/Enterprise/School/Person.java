
public class Person {
    private String firstname,lastname;

    public Person(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("Person's ctor");
    }

    // public Person(){};

    //can person class modify(override),inherited form of toString method? Yes
    // public String toString(String name){
    //     return firstname + lastname;
    // }

    @Override
    public String toString(){
        return "Person[firstname="+firstname+" lastname = "+lastname+" ]";
    }

    

}
  
