/*
 * class Simple Calculator
 */
package simplecalculator;
import java.util.Scanner;

/**
 * class Simple Calculator
 *
 * @author Mihai
 */
public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a = 0;
        float b = 0;
        String op, egal;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Please introduce your first number: ");
            a = sc.nextFloat();
        } catch (Exception e) {
            System.out.println("Sorry, you introduced wrong data. I quit :)");
            System.exit(0);
        }

        System.out.print("Please introduce operator +  -  *  / : ");
        op = sc.next();
        if (!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {
            System.out.println("Sorry, you introduced wrong data. I quit :) ");
            System.exit(0);
        }

        try {
            System.out.print("Please introduce your second number: ");
            b = sc.nextFloat();
        } catch (Exception e) {
            System.out.println("Sorry, you introduced wrong data. I quit :)");
            System.exit(0);
        }

        System.out.print("Please introduce \"=\" : ");
        egal = sc.next();
        if (egal.equals("=")) {
        } else {
            System.out.println("Sorry, you introduced wrong data. I quit :) ");
            System.exit(0);
        }

        switch (op) {
            case "+":
                System.out.println("Result is: " + (a + b));
                break;
            case "-":
                System.out.println("Result is: " + (a - b));
                break;
            case "*":
                System.out.println("Result is: " + (a * b));
                break;
            case "/":
                System.out.println("Result is: " + (a / b));
                break;
            default:
                System.out.println("Sorry, you introduced wrong data. I quit :) ");
                System.exit(0);
        }
    }
}
