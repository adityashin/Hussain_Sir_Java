class Investment{
    private double payment;
    private int count;
    private RiskLevel risk;

    public Investment(double amount,int years){
        payment = amount;
        count = years;
        risk = RiskLevel.NONE;
    }

    public void AllowRisk(boolean yes){
        risk = yes ? RiskLevel.NONE : RiskLevel.NONE;
    }

    //method overloading allows two methods of same class to be
    //defined with identical names but different list of 
    //parameter types;
    public void AllowRisk(RiskLevel Level){
        risk=Level;
    }

    public double totalPayment(){
        return count * payment;
    }

    public double futureValue(){
        double i;
        switch (risk) {
            case LOW:
                i=0.08;
                break;
            case HIGH:
                i=0.11;
                break;
            default:
            i=0.06;
                break;
        }
        return (payment/i)*(Math.pow(1+i,count)-1);
    }
}