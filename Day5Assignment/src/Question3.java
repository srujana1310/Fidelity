import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        int x;
        int y;
        System.out.println("Enter the value of x\n");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        System.out.println("Enter the value of y\n");
        y=sc.nextInt();
        boolean result = x<y;
        System.out.println("The result of whether x is less than y is "+result);
    }
}
