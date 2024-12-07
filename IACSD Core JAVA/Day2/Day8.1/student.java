public class student{
    private int rollno;
    private String subject,firstname,lastname;
    private double gpa;
    
    public student(int rollno,String subject,String firstname,String lastname,double gpa){
        this.rollno = rollno;
        this.subject = subject;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return "Student [ rollno="+rollno+", subject = "+subject+",firstname ="+firstname+", lastname = "+lastname+"gpa = "+gpa+"]";
    }

    //replace ref equality by content(rollno and subject) equality
    @Override
    public boolean equals(Object o){
        //here we have to do instanceof checking to make sure that passed object is of student
        if (o instanceof student) {
            //becuase we are comparing multiple values so we have to do the downcasting here
            student s = (student)o;
            return this.rollno == s.rollno && this.subject == s.subject;
              
        }
        return false;
    }
}