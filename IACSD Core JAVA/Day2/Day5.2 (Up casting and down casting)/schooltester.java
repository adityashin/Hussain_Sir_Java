public class schooltester {
    public static void main(String[] args) {
        
        //creating student class instance
        //👇sub class reference pointing towards sub class object
        // and its called direct referencing:sub class ref ---> sub class object
        Student s1 = new Student("Aditya","Shinde","PG","DAC",100000,360);
        System.out.println("Implicitly = "+s1.toString());//In this scenario whenever you are using println we don't need to call toString method Explicitly compiler will implicityly add it.     
        //So the output of above query and query below will be the same.
        System.out.println(s1);//student.toString -- student's toString is invoked

        Person p1; //super class ref
        p1 = s1;//up-casting : implicit cast added by javac.(Student extends Person)

        System.out.println(p1);//p1.toString --javac resolves method binding by type of the ref(Person);  

 
        //5.2
        //Runtime Polymorphism
        //In java every object extends from Main Object Class
        Object o = new Student("Aditya","Anand Shinde", "abc","abc",12,12);
        System.out.println(o);

        
    }
} 
 