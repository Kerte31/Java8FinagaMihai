/*
 * Class Button
 */
package deskcalculator;

/**
 * Class Button
 * @author Mihai
 */
public class Button {

    private Character markup;
    /** Returns markup from Button*/
    public Character pushButton() {
        return markup;
    }
    /** Mark button with a symbol*/
    public void drawOnButton(Character markup) {
        this.markup = markup;
    }   
}