import Emp.emp;

public class worker extends emp {
    private int hoursWorked,hourlyRate;

    public worker(String name,int deptid,int basicSalary,int hoursWorked,int hourlyRate){
        super(name,deptid,basicSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public int computerNetsalary(){
        return super.getBasicSalary+(this.hourlyRate*this.hoursWorked);
    }

    @Override
    public String toString(){
        return super.toString+"Hourly Rate of the worker is "+hourlyRate+"\n and Worker Worked for "+hoursWorked;
    }
}
