import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name =sc.nextLine();
        System.out.println("Enter the age :");
        int age = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the country : ");
        String country = sc1.nextLine();
        System.out.println("welcome "+name+"."+" Your age is "+age+" and you are from "+country);

    }
}
