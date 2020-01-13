/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP01;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class Departement {
        public static void main(String[] args) {

    Scanner reader = new Scanner (System.in);
    int dept; 
    System.out.print("Saisir departement:" );
         dept = reader.nextInt();
         
         switch (dept) {
         case 13 :
         System.out.print("Bouches du Rhone" );
         break;
         
         case 84 :
         System.out.print("Vaucluse " );
         break;
         
         case 83 :
         System.out.print("Var " );
         break;
         
         default: 
                  System.out.print("Non connu " );

} 
    
}
}

