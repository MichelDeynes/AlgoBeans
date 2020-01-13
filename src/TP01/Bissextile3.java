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
public class Bissextile3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          int  annee ;
          do {
            Scanner reader = new Scanner (System.in);
            System.out.print("Entrez l'année comprise période 1900-2100 : ");
            annee = reader.nextInt();
            } while (annee < 1900 || annee > 2100);
          
    System.out.println("Sortie du do " +annee);

 /* if (annee % 400 == 0){
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
     } */
if (annee % 400 == 0 || annee % 100 != 0 && annee % 4 == 0)
{
    System.out.println("Année bissextile");
}
else {
    System.out.println("Année Non bissextile");
}
    }
    
}
