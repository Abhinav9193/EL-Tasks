package Calculator;
import java.util.Scanner;

public class calculator
{
        public static double add(double a, double b)
        {
            return a + b;
        }

        public static double subtract(double a, double b)
        {
            return a - b;
        }

        public static double multiply(double a, double b)
        {
            return a * b;
        }

        public static double divide(double a, double b)
        {
            if (b == 0) {
                System.out.println("Error: Division by zero!");
                return 0;
            }
            else {
                return a / b;
            }
        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            boolean keepRunning = true;

            while (keepRunning) {
                System.out.println("\n--- Basic Calculator ---");
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter an operator (+, -, *, /): ");
                char operator = sc.next().charAt(0);

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();


                double result = 0;

                switch (operator) {
                    case '+':
                        result = add(num1, num2);
                        break;
                    case '-':
                        result = subtract(num1, num2);
                        break;
                    case '*':
                        result = multiply(num1, num2);
                        break;
                    case '/':
                        result = divide(num1, num2);
                        break;
                    default:
                        System.out.println("Invalid operator!");
                        continue;
                }

                System.out.println("Result: " + result);
            }

            System.out.println("Calculator closed.");
            sc.close();
        }
    }
