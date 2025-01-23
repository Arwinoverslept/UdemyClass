import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter two integers
            System.out.print("Enter the first integer: ");
            String input1 = scanner.nextLine();
            String input2 = scanner.nextLine();

            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            // Perform the division
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        } 
        catch (NullPointerException e) {
            System.out.println("Error: Input cannot be null.");
        } 
    }
}
