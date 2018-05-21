/*
 * SimpleCalculator
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

import java.util.Scanner;

/**
 *
 * @author Mihai
 */
public class SimpleCalculator {

    /**
     * SimpleCalculator class
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float a = 0;
        float b = 0;
        String op, egal;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Please introduce your first number:");
            a = sc.nextFloat();
        } catch (Exception e) {
            System.out.println("Sorry, you introduced wrong data. I quit :)");
            System.exit(0);
        }

        System.out.println("Please introduce operator +  -  *  / :");
        op = sc.next();
        if (!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {
            System.out.println("Sorry, you introduced wrong data. I quit :) ");
            System.exit(0);
        }

        try {
            System.out.println("Please introduce your second number:");
            b = sc.nextFloat();
        } catch (Exception e) {
            System.out.println("Sorry, you introduced wrong data. I quit :)");
            System.exit(0);
        }

        System.out.println("Please introduce = :");
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
