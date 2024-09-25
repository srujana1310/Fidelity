public class TemporaryEmployee extends Employee {
    float dailyWages;
    int noofDays;
    public TemporaryEmployee(int id,String name,float dailyWages,int noofDays) {
        super(id,name,dailyWages*noofDays);
        this.dailyWages=dailyWages;
        this.noofDays=noofDays;
    }
    @Override
    public void calculateBonus(){
        if(dailyWages<1000){
            Bonus=0.15f*NetSalary;
        } else if (dailyWages>=1000 && dailyWages<1500) {
            Bonus=0.12f*NetSalary;

        } else if (dailyWages>=1500 && dailyWages<1750) {
            Bonus=0.11f*NetSalary;
        }else{
            Bonus=0.08f*NetSalary;
        }
    }
    @Override
    public void calculateSalary() {
        NetSalary=dailyWages*noofDays;
        calculateBonus();
        NetSalary+=Bonus;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("dailyWages: "+dailyWages);
        System.out.println("noofDays: "+noofDays);
    }
}
