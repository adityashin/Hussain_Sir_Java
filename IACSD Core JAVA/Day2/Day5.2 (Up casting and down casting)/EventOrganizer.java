
import java.util.Scanner;

public class EventOrganizer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter max no of participants");
        Person[] participants = new Person[sc.nextInt()];
        boolean exit = false;
        int counter = 0;

        // 🧐🧐🧐Basically here we want to display all the participants came to party so
        // if we use our normal "IS A" realtionship inheritance we would only get
        // particular student or faculty details but we wanna display both .That's why
        // here we are using "Up-Casting" to display number of participants in the
        // event. (In-Direct Referencing) (Runtime Polymorphism)
        while (!exit) {
            System.out.println(
                    "Options are \n 1 . Register Student \n 2 . Register Faculty \n 3 . Display Details of all Participants \n 4 . Display specific Participant details \n 5 . Invoke Sub class specific functionality  \n  100 . EXIT");
            System.out.println("\nChoose Options");
            switch (sc.nextInt()) {
                case 1:
                    // Here we are using boundry condition so that array does'nt go out of bound
                    if (counter < participants.length) {
                        System.out.println("Enter firstname,lastname,gradeyear,course,fees,mns");
                        // upcasting
                        participants[counter++] = new Student(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(),
                                sc.nextInt());
                    } else {
                        System.out.println("    ***********************Event is full!!*****************************");
                    }
                    break;
                case 2:
                    // Here we are using boundry condition so that array does'nt go out of bound
                    if (counter < participants.length) {
                        System.out.println("Enter firstname,lastname,Years of Experience and SME");
                        // upcasting
                        participants[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());
                    } else {
                        System.out.println("***********************Event is full!!*****************************");
                    }
                case 3:
                    // Here we are using foreach to display all details in participants;
                    for (Person p : participants)// p = participants[0].......participants[participants.length]
                        if (p != null) // null checking
                            System.out.println(p);// type of ref is Person,type of object :student or faculty
                    break;

                case 4:
                    System.out.println("Enter the seat number\n");
                    int index = sc.nextInt() - 1;
                    if (index >= 0 && index < counter) {
                        System.out.println(participants[index]);
                    } else {
                        System.out.println(
                                "*********************************!!Invalid Number!!************************************");
                    }
                    break;
                case 5:
                    // In these cases we have a major problem that suppose in array first array index is of student and second index is of faculty then if we ask for student in index 1 it won't give any error but if we do same for index 2 it will give a major error called ⚡⚡⚡ClassCastException⚡⚡⚡ because the method which is present in student scope it will try to find the same method in faculty class 

                    System.out.println("Enter seat no");
                        index = sc.nextInt();
                        if (index >=0 && index < counter) {
                            Person p = participants[index];
                            // p.study();  <--- This will not work beacause there is not method defined in person

                            // Need : Executing sub class specific functionality.
                            //downcasting : Climbing down inheritance hierarchy (not done implicityly by the javac)👇
                            ((Student)p).study();
                        }else{
                            System.out.println("Invalid seat no!!!");
                        }
                break;
                default:
                case 100:
                    exit = true;
                    break;
            }
        }

        sc.close();
    }
}
