import java.util.Scanner;
public class GroupWork   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
       
        // Calling methods from Calculator.java
        System.out.println("Sum: " + Calculator.add(num1, num2));
        System.out.println("Difference: " + Calculator.sub(num1, num2));
        System.out.println("Product: " + Calculator.mul(num1, num2));
        System.out.println("Quotient: " + Calculator.div(num1, num2));
        System.out.println("Modulus: " + Calculator.mod(num1, num2));
        System.out.println("Square: " + Calculator.square(num1, num2));
        System.out.println("Cube: " + Calculator.cube(num1, num2));
        System.out.println("Max: " + Calculator.max(num1, num2));
        System.out.println("Min: " + Calculator.min(num1, num2));
        System.out.println("IsEqual: " + Calculator.equal(num1, num2));
    }
}
