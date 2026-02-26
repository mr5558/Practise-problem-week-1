import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        float number1, number2;
        float add, sub, mul, div;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        number1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        number2 = sc.nextFloat();

        add = number1 + number2;
        sub = number1 - number2;
        mul = number1 * number2;

        if (number2 != 0) {
            div = number1 / number2;
            System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                    + number1 + " and " + number2 + " is "
                    + add + ", " + sub + ", " + mul + ", and " + div);
        } else {
            System.out.println("Division not possible (cannot divide by zero).");
            System.out.println("The addition, subtraction, and multiplication value of 2 numbers "
                    + number1 + " and " + number2 + " is "
                    + add + ", " + sub + ", and " + mul);
        }

        sc.close();
    }
}