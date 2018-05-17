/*
 * Object Oriented Desk Calculator
 */
package oodeskcomputer;

import java.util.Scanner;

/**
 * Object Oriented Desk Calculator
 *
 * @author Mihai
 */
public class OODeskCalculator {

    /**
     * @param args the command line arguments
     */
    static class Ecran {

        public void introducePrimulParametru() {
            System.out.print("Introduceti primul numar: ");
        }

        public void introduceOperator() {
            System.out.print("Introduceti operatorul: ");
        }

        public void introduceAlDoileaParametru() {
            System.out.print("Introduceti al doilea numar: ");
        }

        public void introduceEgal() {
            System.out.print("Introduceti \"=\": ");
        }

        public void afiseazaRezultat() {
            System.out.print("Rezultatul este: ");
        }
    }

    static class Parametri {

        float a, b;
        Scanner sc = new Scanner(System.in);

        public void citestePrimulParametru() {

            try {
                a = sc.nextFloat();
            } catch (java.util.InputMismatchException e1) {
                System.out.println("Ati introdus datele gresit!");
                System.exit(0);
            }
        }

        public void citesteAlDoileaParametru() {

            try {
                b = sc.nextFloat();
            } catch (java.util.InputMismatchException e2) {
                System.out.println("Ati introdus datele gresit!");
                System.exit(0);
            }
        }
    }

    static class Operatori {

        String op, egal;
        Scanner sc = new Scanner(System.in);

        public void citesteOperator() {
            op = sc.nextLine();
            if (!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {
                System.out.println("Ati introdus datele gresit!");
                System.exit(0);
            }
        }

        public void citesteEgal() {
            egal = sc.nextLine();
            if (!egal.equals("=")) {
                System.out.println("Ati introdus datele gresit!");
                System.exit(0);
            }
        }
    }

    static class Procesor {

        float rez = 0;
        //instantiaza clasele Parametri si Operatori
        Parametri p = new Parametri();
        Operatori o = new Operatori();

        //returneaza suma a doua numere
        public float aduna(float a, float b) {
            rez = a + b;
            return rez;
        }

        //returneaza diferenta a doua numere
        public float scade(float a, float b) {
            rez = a - b;
            return rez;
        }

        //returneaza produsul a doua numere
        public float inmulteste(float a, float b) {
            rez = a * b;
            return rez;
        }

        //returneaza câtul a doua numere
        public float imparte(float a, float b) {
            rez = a / b;
            return rez;
        }

        public void calculeazaRezultat() {
            switch (o.op) {
                case "+":
                    System.out.print(aduna(p.a, p.b));
                    break;
                case "-":
                    System.out.print(scade(p.a, p.b));
                    break;
                case "*":
                    System.out.print(inmulteste(p.a, p.b));
                    break;
                case "/":
                    System.out.print(imparte(p.a, p.b));
                    break;
                default:
                    System.out.println("Ati introdus datele gresit!");
                    System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        //instantiaza clasele Ecran, Parametri, Operatori si Procesor 
        Ecran e = new Ecran();
        Parametri p1 = new Parametri();
        Operatori o1 = new Operatori();
        Procesor rezultat = new Procesor();

        //apeleaza metodele introducePrimulParametru si citestePrimulParametru
        e.introducePrimulParametru();        //output: "Introduceti primul numar: "
        p1.citestePrimulParametru();         //citeste primul numar din consola

        //apeleaza metodele introduceOperator si citesteOperator
        e.introduceOperator();               //output: "Introduceti operatorul: "                      
        o1.citesteOperator();                //citeste operatorul din consola

        //apeleaza metodele introduceAlDoileaParametru si citesteAlDoileaParametru
        e.introduceAlDoileaParametru();      //output: "Introduceti al doilea numar: "           
        p1.citesteAlDoileaParametru();       //citeste al doilea numar din consola

        //apeleaza metodele introduceEgal si citesteEgal
        e.introduceEgal();                  //output: "Introduceti \"=\": "
        o1.citesteEgal();                   //citeste egal
        System.out.print("\n");

        //apeleaza metoda afiseazaRezultat
        e.afiseazaRezultat();               //output: "Rezultatul este: "
        rezultat.calculeazaRezultat();      //afiseaza rezultatul
    }
}
