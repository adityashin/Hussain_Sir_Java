package Inheritance;

public class Faculty extends Person{
    private int year_Of_experience;
    private String sme;

    public Faculty(String firstname,String lastname,int year_Of_experience,String sme){
        super(firstname,lastname);
        System.out.println("Faculty's ctor");
        this.year_Of_experience = year_Of_experience;
        this.sme = sme;
    }
}
