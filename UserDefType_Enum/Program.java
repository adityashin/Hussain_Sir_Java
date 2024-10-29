class Program{
    
    private static void advice(Investment inv){
        inv.AllowRisk(inv.totalPayment()<500000);
    }

    private static Investment tryGoldPlus(int years){
        if(years >=3){
            Investment result = new Investment(100000,years);
            if(years<5)
                result.AllowRisk(RiskLevel.HIGH);
            else if(years < 10)
                result.AllowRisk(RiskLevel.LOW);
            return result;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Welcome Investor");
        if(args.length>1){
            double p = Double.parseDouble(args[0]);
            int n = Integer.parseInt(args[1]);
            Investment myinv = new Investment(p,n);
            System.out.printf("Future value in risk-free investment: %.2f%n",myinv.futureValue());

            myinv.AllowRisk(true);
            System.out.printf("Future value in low-risk investment :%.2f%n",myinv.futureValue());;
        }else{
            let n = Integer.parseInt(args[0]);
            Investment myinv = tryGoldPlus(n);
            if(myinv != null)
            System.out.print("Future value in gold plus investment %.2f%n",myinv.futureValue());
        }
    }
}