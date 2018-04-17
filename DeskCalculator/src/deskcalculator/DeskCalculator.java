/*
 * DeskCalculator
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deskcalculator;

import java.util.Scanner;

/**
 *
 * @author Mihai
 */
public class DeskCalculator {

    /**
     * DeskCalculator class
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int rez;
        String op;
        String egal;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please introduce your first number:");
        int a = sc.nextInt();
        System.out.println("Please introduce operator +  -  *  / :");
        op = sc.next();
        if (op.equals("+")
                || op.equals("-")
                || op.equals("*")
                || op.equals("/")) {
        } else {
            System.out.println("Sorry, you introduced wrong data. I quit :) ");
            System.exit(0);
        }
        System.out.println("Please introduce your second number:");
        int b = sc.nextInt();
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
