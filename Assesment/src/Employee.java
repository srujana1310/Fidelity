public class Employee {
    int Id;
    String Name;
    Float basicSalary;
    Float Bonus;
    Float NetSalary;
    public Employee(int Id, String Name, Float BasicSalary) {
        this.Id = Id;
        this.Name = Name;
        this.basicSalary = BasicSalary;
    }public void calculateBonus() {

    }
    public void calculateSalary() {

    }
    public void displayDetails() {
        System.out.println("Employee ID: " + this.Id);
        System.out.println("Employee Name: " + this.Name);
        System.out.println("Employee Basic Salary: " + this.basicSalary);
        System.out.println("Employee Bonus: " + this.Bonus);
        System.out.println("Employee Net Salary: " + this.NetSalary);
    }
}
