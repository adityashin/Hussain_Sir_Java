
public class faculty extends Person{
    
    private int year_Of_experience;
    private String sme;

    public faculty(String firstname,String lastname,int year_Of_experience,String sme){
        super(firstname,lastname);
        System.out.println("Faculty's ctor");
        this.year_Of_experience = year_Of_experience;
        this.sme = sme;
    } 
}
