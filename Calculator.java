import java.util.*;
import java.util.regex.*;

public class Calculator {
    private static Calculator singleton;

    public static Calculator getInstance() {
        if (singleton == null) {
            singleton = new Calculator();
        }
    return singleton;
    }
   
    private Calculator() {  
    }
    
    public void checkInt(Scanner scanner) {
         for (;scanner.useDelimiter("[/\r\n]").hasNextInt() != true;) {
                   System.err.println("Nu ati introdus un numar!");
                   System.out.println("Incercati din nou!");
                   scanner.next();
         } 
    }
    
    public String checkSign(Scanner scanner) {  
        String line;
        scanner.nextLine();
        for (;!"+-*/".contains(line = scanner.nextLine());) {
                   System.err.println("You have not typed an operand! (ex: + , - , * , /)!");
                   System.out.println("Try again!");
                   scanner.next();
        } 
        return line;
    }
 
    public int sum(int x, int y) { 
        return x+y;
    }
 
    public int diff(int x, int y) {
        return x-y;
    }
    
    public int mult(int x, int y) {
        return x*y;
    }
    
    public Integer div(int x, int y) { 
        if (y == 0) {          
          return null;
        }
        
        return x/y; 
    }
    
}


