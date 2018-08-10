/*
 * Generic class Cutie
 */
package generics;

/**
 *Generic class Cutie
 * @author bogdan
 * @param <T> generic type
 */
public class Cutie <T extends Incaltaminte> {
   private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
   
}
