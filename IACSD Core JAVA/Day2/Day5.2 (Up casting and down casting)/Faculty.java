public class Faculty extends Person{
    
    private int year_Of_experience;
    private String sme;

    public Faculty(String firstname,String lastname,int year_Of_experience,String sme){
        super(firstname,lastname);
        this.year_Of_experience = year_Of_experience;
        this.sme = sme;
    } 

    public String toString(){
        return "\nFaculty "+super.toString()+" has "+year_Of_experience+" of experience in the industry and has a SME of "+sme;
    }

      //down casting
    //climbing down inheritance herarchy
    // (not done implicity by javac)
    public void teach(){
        System.out.println("\n\n Mr."+getFirstName() + getLastName() + " has "+ year_Of_experience +" Year of Experience in Industry and has SME of " +sme);
    }
}
