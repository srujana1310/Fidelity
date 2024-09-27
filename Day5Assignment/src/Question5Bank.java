import java.util.Scanner;

public class Question5Bank {
    private String id;
    private String accountType;
    private double balance;
    public Question5Bank() {
        this.id="0000";
        this.accountType="default";
        this.balance=0.0;
    }
    public Question5Bank(String id, String accountType, double balance) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }
    public String getAccountType() {
        return accountType;
    }
    public double getBalance() {
        return balance;
    }
    public boolean Withdraw (double amount) {
        if(amount<=0){
            return false; //Invalid amount
        }
        if(amount>balance){
            return false; //Insufficient
        }
        balance -=amount; //successful
        return true;
    }
    public String getDetails(){
        return "Account id:"+id+"\n"+"Account type:"+accountType+"\n"+"Balance:"+balance;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Question5Bank q = new Question5Bank("1234","Savings",40000);
        System.out.println(q.getDetails());

        System.out.println("Enter the amount to withdraw ");
        double amount = sc.nextDouble();

        if(q.Withdraw(amount)){
            System.out.println("Withdraw successful");
            System.out.println("New Balance:"+q.getBalance());
        }else{
            System.out.println("Withdraw failed");
        }
        sc.close();


    }

}