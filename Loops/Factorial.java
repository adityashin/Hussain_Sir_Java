class Factorial{
    public static void main(String[] args) {
        int no = Integer.parseInt(args[0]);
        int fact = 1; //Initialized to Zero because of Iteration

        System.out.printf("Enter any number");
        for(int i=1;i<=no;++i){
            fact*=i;
        }
        System.out.printf("Factorial of %d is %d",no,fact);
    }
}