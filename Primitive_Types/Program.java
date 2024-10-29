public class Program {
    public static void main(String[] args) {
        System.err.println("welcome Investor!");
        if(args.length>1){
            double p = Double.parseDouble((args[0]));
            int n = Integer.parseInt(args[1]);
            System.out.printf("future value in risk free investment: %.2f%n", Investment.futureValue(p, n, false));
            System.out.printf("future value in low-risk investment: %.2f%n", Investment.futureValue(p, n, true));

        }
    }
}
