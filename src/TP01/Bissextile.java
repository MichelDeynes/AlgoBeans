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
public class Bissextile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int  annee ;
Scanner reader = new Scanner (System.in);
System.out.print("Entrez l'année : ");
annee = reader.nextInt();
  if (annee % 400 == 0){
    System.out.println("Année bissextile");
    }
  else if  (annee % 100 == 0){
            System.out.println("Année non bissextile");
  }
  else if  (annee % 100 == 4){
                System.out.println("Année bissextile");
            }
else {
     System.out.println("Année non bissextile");
     }
 /* If if (annee % 400 == 0 !! (annee % 100 <> 0 annee && annee % 4)){
    System.out.println("Année bissextile");
}*/
  }
}
