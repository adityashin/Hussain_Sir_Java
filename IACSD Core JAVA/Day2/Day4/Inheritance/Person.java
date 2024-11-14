package Inheritance;

public class Person {
    private String firstname,lastname;

    public Person(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("Person's ctor");
    }

    public Person(){};

}
