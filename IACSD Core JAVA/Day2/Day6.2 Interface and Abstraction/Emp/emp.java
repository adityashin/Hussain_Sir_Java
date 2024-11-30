package Emp;

 public abstract class emp {
    
    private int deptid,basicSalary,empid=0;
    private String name;

    // public static idGenerator(){
    //     return empid++;
    // }

    public emp(String name,int deptid,int basicSalary){
        this.name = name;
        this.deptid = deptid;
        this.basicSalary = basicSalary;
    }

    public int getBasicSalary(){
        return basicSalary;
    }

    @Override
    public String toString(){
        return "Name of the employee is "+name+"\n Id = "+empid+"\n deptid = "+deptid+"\n Basic Salary is "+basicSalary;
    }

    public abstract int computerNetsalary();
}

