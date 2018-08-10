/*
 * To change this license header, choose License Headers in Project Properties.
 * Class Beta
 * and open the template in the editor.
 */
package datahiding.packageone;

/**
 *Class Beta
 * @author Mihai
 */
public class Beta {
    
    public void testAlpha(){
        
        Alpha alphaObject = new Alpha();
        
        alphaObject.publicAttribute = 2;
        alphaObject.protectedAttribute = 3;
        // alphaObject.privateAttribute = 4;
        alphaObject.packageAttribute = 5;
                
    }
}
