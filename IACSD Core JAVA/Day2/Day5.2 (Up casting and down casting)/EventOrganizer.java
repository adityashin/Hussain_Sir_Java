import java.util.Scanner;

public class EventOrganizer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter max no of participants");
        Person[] participants = new Person[sc.nextInt()];
        boolean exit = false;
        int counter =0;
        while (!exit) {
            System.out.println("Options are \n 1 . Register Student \n 2 . Register Faculty \n 3 . Display Details of all Participants \n 100 . EXIT");
            
        }
       
        sc.close();
    }
}