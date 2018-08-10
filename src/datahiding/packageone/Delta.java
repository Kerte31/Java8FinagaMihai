/*
 * Delta the extended class of Alpha
 */
package datahiding.packageone;

/**
 *Class Delta
 * @author Mihai
 */
public class Delta extends Alpha {
    
    public void testParrent(){
        
        //super.privateAttribute = 11;
        super.publicAttribute = 12;
        super.protectedAttribute = 13;
        super.packageAttribute = 14;
        
    }
}
