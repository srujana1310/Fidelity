public class PermanantEmployee extends Employee {
    int pf;
    public PermanantEmployee(int id,String name,float salary,int pf) {
        super(id,name,salary);
        this.pf = pf;
    }
    @Override
    public void calculateBonus() {
        if(pf>1000){
            Bonus = 0.10f*basicSalary;
        } else if(pf>=1500 && pf<1500) {
            Bonus = 0.115f*basicSalary;
        }else if(pf>=1500 && pf<1800){
            Bonus = 0.12f*basicSalary;
        }else{
            Bonus = 0.15f*basicSalary;
        }
    }
    @Override
    public void calculateSalary() {
        NetSalary=basicSalary-pf;
        calculateBonus();
        NetSalary+=Bonus;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("PF"+pf);
    }


}
