import java.util.Scanner;
public class Patternsnum{
    public static void main(String[] args) {
        int numbers;
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        numbers=sc.nextInt();

        for(int i=1;i<=numbers;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
