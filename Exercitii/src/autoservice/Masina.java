/*
 * 
 * Clasa Masinilor
 * and open the template in the editor.
 */
package autoservice;

/**
 *
 * @author Mihai
 */
public class Masina implements Vandabila, Inchiriabila{
    public enum Culoare {
        RED, GREEN, BLUE, MAGENTA
    }
    //comentariu pe o linie
    private String marca;
    private int vitezaMaxima;
    private Culoare culoare;
    
    public Masina (String nouaMarca, int nouaViteza, Culoare nouaCuloare) {
        marca = nouaMarca;
        vitezaMaxima = nouaViteza;
        culoare = nouaCuloare;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVitezaMaxima() {
        return vitezaMaxima;
    }

    public void setVitezaMaxima(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    public Culoare getCuloare() {
        return culoare;
    }

    public void setCuloare(Culoare culoare) {
        this.culoare = culoare;
    }

    @Override
    public int getPretVanzare() {
        return(12000);
    }

    @Override
    public int getPretInchirierePeZi() {
        return(25);
    }
}
