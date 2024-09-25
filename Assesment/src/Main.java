//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PermanantEmployee pme = new PermanantEmployee(121,"Latha",25000,1500);
        pme.calculateSalary();
        pme.displayDetails();

        System.out.println();

        TemporaryEmployee te = new TemporaryEmployee(111,"srujana",1500,20);
        te.calculateSalary();
        te.displayDetails();
        }
    }
