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
public class ComparaisonNombres {
    public static void main(String[] args) {
    Scanner reader = new Scanner (System.in);
    int nb, nb1, nb2; 
    System.out.print("Saisir premier nombre entier :" );
         nb1 = reader.nextInt();
    System.out.print("Saisir second nombre entier :" );
         nb2 = reader.nextInt();
         
         if (nb1 < nb2) {
                System.out.println("Bravo, nombres ordonnés");
                nb = nb1 + 1;
                if  (nb == nb2){
                   System.out.println("Bravo, nombres consecutifs");
                 }
             else 
              { 
                       System.out.println("Snif , nombres non consecutifs");
                 }
                         
            }
         else 
              { 
                       System.out.println("Snif, nombres non ordonnes");
                 }
    }
}
