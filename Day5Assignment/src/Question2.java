import java.util.Scanner;

public class Question2 {
    static double FindSquare(double num) {
        return num*num;
    }
    static double FindCube(double num) {
        return num*num*num;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        double square=FindSquare(num);
        double cube=FindCube(num);
        System.out.println("Square of "+num+" is " +square);
        System.out.println("Cube of "+num+" is " +cube);
    }
}
