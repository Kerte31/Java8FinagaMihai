/*
 * Autoservice
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;

/**
 *
 * @author Mihai
 */
public class Autoservice {

    /**
     * Autoservice class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create 3 cars
        Masina mercedes = new Masina("MERCEDES",260,Masina.Culoare.BLUE);
        Masina dacia = new Masina("DACIA", 180, Masina.Culoare.GREEN);
        Masina logan = new Masina("LOGAN", 200, Masina.Culoare.MAGENTA);
        
        mercedes.setMarca("MERCEDES");
        mercedes.setVitezaMaxima(260);
        mercedes.setCuloare(Masina.Culoare.RED);    
    }
}
