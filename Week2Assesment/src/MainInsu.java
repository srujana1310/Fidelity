import java.util.Scanner;

public class MainInsu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Insurance Number: ");
        String insuranceNo = sc.nextLine();
        System.out.println("Enter Insurance Name: ");
        String insuranceName = sc.nextLine();
        System.out.println("Enter Amount covered:");
        double amountCovered = sc.nextDouble();

        System.out.println("Select");
        System.out.println("1. Life Insurance ");
        System.out.println("2. Motor Insurance ");
        int option = sc.nextInt();

        if (option == 1) {
            System.out.println("Policy Term:");
            int policyTerm = sc.nextInt();
            System.out.println("Benefit percent: ");
            float benefitPercent = sc.nextFloat();

            LifeInsurance LI =new LifeInsurance(insuranceNo, insuranceName, amountCovered, policyTerm, benefitPercent);
            double premium = addPolicy(LI,option);
            System.out.println(" Calculated Premium: " + premium);

        }else if(option == 2) {
            System.out.println("Depreciated Percent: ");
            float depreciatedPercent = sc.nextFloat();
            MotorInsurance mi = new MotorInsurance(insuranceNo, insuranceName, amountCovered, depreciatedPercent);
            double premium = addPolicy(mi,option);
            System.out.println(" Calculated Premium: " + premium);
        }else{
            System.out.println("Invalid Option");
        }
        sc.close();

    }
    public static double addPolicy(Insurance ins,int option){
        if(option == 1){
            return ((LifeInsurance)ins).calculatePremium();
        }else if(option == 2){
            return ((MotorInsurance)ins).calculatePremium();
        }
        return 0;
    }
}
