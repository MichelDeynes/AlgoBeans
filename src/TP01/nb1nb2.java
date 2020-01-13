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
public class nb1nb2 {
    
    public static void main(String[] args) {
    Scanner reader = new Scanner (System.in);
    int nb1, nb2; 
    System.out.print("Saisir premier nombre entier :" );
         nb1 = reader.nextInt(    System.out.print("Saisir premier nombre entier :" );
);
    System.out.print("Saisir second nombre entier :" );
         nb2 = reader.nextInt();
         
         if (nb1 < nb2)
                 { 
                       System.out.println(" nb1 inférieur à nb2");
                 }
         else 
              { 
                  if (nb1 == nb2)
                  {
                      System.out.println("nb1 égal nb2");
                  }
                  else
                  {
                      System.out.println("nb1 supérieur à nb2");

                  }
                 }
}
}