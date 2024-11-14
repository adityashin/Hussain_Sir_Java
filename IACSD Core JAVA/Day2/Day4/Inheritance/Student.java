package Inheritance;

public class Student extends Person {
    private String grade_year,course;
    private float fees,marks; 

    public Student(String firstname,String lastname,String grade_year,String course,int fees,int marks){
        super(firstname,lastname);
        System.out.println("Student ctor");
        this.grade_year = grade_year;
        this.course = course;
        this.fees = fees;
        this.marks = marks;
    }

    public String toString(){
        return "Student "+super.toString()+"\nYear grade is "+grade_year+"and Course details are "+course+" and fees of the course is "+fees+" and marks he got for that course is "+marks;
    }
}
