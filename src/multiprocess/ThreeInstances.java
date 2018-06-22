/*
 * Launches three instances of Notepad
 */
package multiprocess;

import java.io.IOException;

/**
 * Launches three instances of Notepad
 *
 * @author Mihai
 */
public class ThreeInstances {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();

        try {
            Process p1 = rt.exec("notepad C:\\Users\\Mihai\\Desktop\\Java\\Multiprocess\\File1.txt");
            Process p2 = rt.exec("notepad C:\\Users\\Mihai\\Desktop\\Java\\Multiprocess\\File2.txt");
            Process p3 = rt.exec("notepad C:\\Users\\Mihai\\Desktop\\Java\\Multiprocess\\File3.txt");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
