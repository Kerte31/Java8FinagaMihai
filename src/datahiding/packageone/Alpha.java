/*
 * To change this license header, choose License Headers in Project Properties.
 * Class Alpha
 * and open the template in the editor.
 */
package datahiding.packageone;

/**
 *Class Alpha
 * @author Mihai
 */
public class Alpha {
    private int privateAttribute = 10;
    protected int protectedAttribute = 20;
    public int publicAttribute = 30;
    int packageAttribute = 40;
    
    public void testIntern(){
        this.publicAttribute = 1;
        this.protectedAttribute = 2;
        this.privateAttribute = 3;
        this.packageAttribute = 4;
    }
    
}
