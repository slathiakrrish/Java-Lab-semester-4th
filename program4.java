import java.util.*;

public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            String a = sc.nextLine();
            System.out.print("Enter second number: ");
            String b = sc.nextLine();
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            int result = num1 / num2;
            System.out.println("Result = " + result);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numbers only.");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        System.out.println("Program ended.");
    }
}