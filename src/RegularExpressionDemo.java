import java.util.Scanner;
import java.util.logging.Handler;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java Program to show example of how to use regular expression 
 * to check if  String contains any number or  not. Instead of 
 * using matches() method of java.lang.String, we have used Pattern
 * and Matcher class to avoid creating temporary Pattern objects.
 *
 * @author http://java67.blogspot.com
 */

public class RegularExpressionDemo {

    public static void main(String args[]) {

        // Regular expression pattern to test input
        String regex = "(.)*([^A-Za-z0-9])(.)*";    
        
        
        //String regex = "";   
        Pattern pattern = Pattern.compile(regex);

        Scanner reader = new Scanner(System.in);
        String input = "TEST";

       System.out.println("Please enter input, must contain at-least one digit");
       
       while (!input.equalsIgnoreCase("EXIT")) {        

            input = reader.nextLine();
           
           // Pattern pattern = Pattern.compile(regex);  // Don't do this, creating Pattern is expensive
            Matcher matcher = pattern.matcher(input);
           
          
            

            boolean isMatched = matcher.matches();
            	boolean b = matcher.find();
            	System.out.println("find "+ b);
            //String regex1 = matcher.group();
            
            System.out.println("matcher "
            		+ "" + isMatched);
            if (isMatched) {
                System.out.println("PASS");

            } else {
                System.out.println("FAIL, Incorrect input");

            }
        }
    }
}



