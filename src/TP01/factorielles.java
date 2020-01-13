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
public class factorielles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        int nb, i=2 ;
        long fact=1;

    System.out.print("Saisir nombre :");
            nb = reader.nextInt();

            
    /*
            while ( i<=nb) {
         fact=fact*i;
         i++;
    }
            */
 
    fact=1;
    i=1;
    do 
    {  
        fact=fact*i;
         i++;
        
    } 
    while (i<=nb);
    
          System.out.println("Factorielle de  :" +nb +" est :" +fact);   

    }
  /* for (i=2; i<=nb; i++) {       
        fact=fact * i;
   }*/
          
}

