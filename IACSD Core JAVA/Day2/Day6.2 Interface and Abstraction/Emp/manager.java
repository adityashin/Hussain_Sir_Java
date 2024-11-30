import Emp.emp;

public class manager extends emp {
    private int performanceBonus;

    public manager(String name, int deptid, int basic, int performanceBonus) {
        super(name, deptid, basic);
        this.performanceBonus = performanceBonus;
    }

    public int computerNetsalary() {
        return super.getBasic() + performanceBonus;
    }

    @Override
    public String toString() {
        return super.toString() + "Perfromance Bonus of Manager is " + this.computerNetsalary();
    }
}
