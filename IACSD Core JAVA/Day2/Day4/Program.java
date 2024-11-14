

import Inheritance.Faculty;
import Inheritance.Student;

class Program {
    public static void main(String[] args) {
        
    //created student class instance
        Student s = new Student("aditya", "shinde", "9", "PGDAC", 100000, 0242424);
        System.out.println(s.toString());
    //created Faculty class instance

    Faculty f = new Faculty("Lilesh", "Aavhad", 10, "100000");
    f.toString();

    


        
    }
}
