/*
 * Read a pattern of regular expression string and search a specific CNP string.
 */
package cnpregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Read a pattern of regular expression string and search a specific CNP string.
 * @author Mihai
 */
public class cnpReGex {

    /**
     * Read a pattern of regular expression string and search a specific CNP string.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String regex = "[1-2]{1}([0]{1}[0-9]{1}|[1]{1}[0-2]{1})([0-2]{1}[0-9]{1}|[3]{1}[0-1]{1})[0-9]{4}[0-9]{3}";
        // create a pattern using introduced regular expresion
        try {
            Pattern pattern = Pattern.compile(regex);
            // read the source string using a new Scanner object
            Scanner scannerSourceString = new Scanner(System.in);
            System.out.println("Insert CNP: ");
            String source = scannerSourceString.next();
            // create the matcher as result of applying regex on source string
            Matcher matcher = pattern.matcher(source);
            boolean found = false;
            // if the regular expression or pattern was found
            while (matcher.find()) {
                String result;
                result = String.format("I found CNP \"%s\" starting at "
                        + "index %d until index %d.",
                        matcher.group(),
                        matcher.start(),
                        matcher.end());
                System.out.println(result);
                found = true;
            }
            // if regular expression or pattern was not found in source string
            if (!found) {
                System.out.println("No match found :(");
            }
        }//try
        catch (PatternSyntaxException specialException) {
            System.out.println("Exceptie: " + specialException.getDescription());
        }
    }  
}
