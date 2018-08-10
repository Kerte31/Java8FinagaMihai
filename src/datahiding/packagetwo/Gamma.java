/*
*Class Gamma
 */
package datahiding.packagetwo;

import datahiding.packageone.Alpha;

/**
 *Class Gamma
 * @author Mihai
 */
public class Gamma {
    Alpha alphaObject = new Alpha();
        
    public void testAlphaFromOtherPackage(){
    
        alphaObject.publicAttribute = 33;
        //alphaObject.privateAttribute = 34;
        //alphaObject.protectedAttribute = 35;
        //alphaObject.packageAttribute = 36;
    }
}
