import java.util.Scanner;

import Emp.emp;

public class tester {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number of Employees in Company");
        emp[] e = new emp[sc.nextInt()];
        int counter =0;
        int sal;
        
        boolean flag = false;
        while (!flag) {
            System.out.println(
                    "1.Hire Manager\n2.Hire Worker\n3.Display Net Salary including Performance Bonus \n4.Display Employees\n5.Exit  \n\n");
            System.out.println("*************Enter you hiring choice*************");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter name,deptid,basicsalary and performance Bonus of Manager");
                    e[counter++] = new manager(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
                    break;
                case 2:
                    System.out.println(
                            "Enter name,deptid,basicSalary, how many hours worker Worked and HourlyRate of Worker ");
                    e[counter++] = new worker(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
                    break;
                case 3:
                        System.out.println("Enter Employee number");
                        int index = sc.nextInt();
                        emp ep = e[index];
                        if (ep instanceof manager) {
                            System.out.println("**************Basic Salary of Mangers is"+((manager)ep).getBasicSalary()+" **************");
                        } 
                    break;
                case 4:
                    break;
                case 5:
                    flag = true;
                    break;
                default:
                    System.out.println("*******************Choosen Wrong Option*******************");
                    break;
            }
        }
        sc.close();
    }
}
