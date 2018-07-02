/* Class launches 3 processes of Notepad.exe
 */
package multiprocess;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class launches 3 processes of Notepad.exe
 *
 * @author Mihai
 */
public class LaunchNotepads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            ProcessBuilder pb;
            // Use process builder to start 3 processes multithreading
            pb = new ProcessBuilder("notepad");
            pb.directory(new File("C:\\Users\\Mihai\\Desktop"));
            Process p1 = pb.start();
            Process p2 = pb.start();
            Process p3 = pb.start();
        } catch (IOException ex) {
            Logger.getLogger(LaunchNotepads.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
        }
    }
}
