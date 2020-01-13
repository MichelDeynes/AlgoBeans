

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class moyenne4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int i=1;
   int  nb1, nb2, nb3, nb4;
   double nb0;
           //
    Scanner reader = new Scanner (System.in);
    System.out.print (" nombre :   "+ i);
        nb1  = reader.nextInt();
        i++;
        
    System.out.print (" nombre :   "+ i);
        nb2  = reader.nextInt();
        i++;
        
    System.out.print (" nombre :   "+ i);
        nb3  = reader.nextInt();
        i++;
        
    System.out.print (" nombre :   "+ i);
        nb4  = reader.nextInt();
        i++;
        
nb0= nb1 + nb2 + nb3 +nb4 ;
System.out.println("moyenne =   " + nb0/4.0);
    
    }
    
}
