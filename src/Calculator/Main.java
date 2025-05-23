package Calculator;

import java.util.Scanner;

import static Calculator.Caculator.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Exiting program...");
                break;
            }

            System.out.println("Enter first number: ");
            double aDouble = input.nextDouble();
            System.out.println("Enter second number: ");
            double bDouble = input.nextDouble();

            int a = (int) aDouble;
            int b = (int) bDouble;

            switch (choice) {
                case 1:
                    System.out.println("1.Add");
                    System.out.println("Result = " + add(a,b));
                    break;
                case 2:
                    System.out.println("2. Subtract");
                    System.out.println("Result = " + subtract(a,b));
                    break;
                case 3:
                    System.out.println("3.Multiply");
                    System.out.println("Result = " + multiply(a,b));
                    break;
                case 4:
                    System.out.println("4. Divide");
                    System.out.println("Result = " + divide(a,b));
                    break;
                default:
                    System.out.println("Invalid choice!");

            }
        } while (true);
    }
}
