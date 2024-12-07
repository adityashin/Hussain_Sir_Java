public class tester {
    public static void main(String[] args) {
        student s = new student(99, "React", "aditya", "shinde", 9.9);
        student s2 = new student(   24, "Nodejs", "shailesh", "havinal", 9.9);
        System.out.println("Are S and S2 are equal = "+s.equals(s2));
    }
}
