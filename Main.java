import java.util.*;

public class Main {
     public static void main (String[] args) {
         Scanner scanner = new Scanner(System.in);
         String sign;
         int x, y;
         Calculator calculator = Calculator.getInstance();
     
         while (true) {
             System.out.println("\nIntroduceti primul nr: ");
             calculator.checkInt(scanner);
             x = scanner.nextInt();
             
             System.out.println("Introduceti operatia: ");
             sign =calculator.checkSign(scanner);
             
             System.out.println("Introduceti al doilea nr: ");
             calculator.checkInt(scanner);
             y = scanner.nextInt(); 
             
             switch (sign) {
                     case "+" :
                        int rez1 = calculator.sum(x, y);
                        System.out.println("Rezultatul este: " + rez1);
                        break;
                     case "-" : 
                        int rez2 = calculator.diff(x, y);
                        System.out.println("Rezultatul este: " + rez2);
                        break;
                     case "*" : 
                        int rez3 = calculator.mult(x, y);
                        System.out.println("Rezultatul este: " + rez3);
                        break;
                     case "/" : 
                        Integer rez4 = calculator.div(x, y); 
                        if(rez4 != null){
                            System.out.println("Rezultatul este: " + rez4);
                        } else {
                            System.out.println("can't divide by 0");
                        }                     
                        break;
             } 

             System.out.println("Doriti sa efectuati alta operatie? ( y / n )");
             for (;!scanner.hasNext("[yn]");) {
                 System.out.println("y for yes and n for no!");
                 scanner.next();
             }
             if (scanner.hasNext("n")) {
                    System.out.println("Thanks for playing! Goodbye!");
                    System.exit(0);
                    break;
             }
             scanner.next();
         } 
    }
}