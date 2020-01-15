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
public class RemplirTableau2dimPas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int l=10, c=2;
    int[] [] tab = new int[l] [c];
    int pas, val;
    Scanner reader = new Scanner (System.in);

    System.out.print("saisir la valeur de départ ");
                val= reader.nextInt();
    System.out.print("saisir le pas ");
                pas = reader.nextInt();
    // J'utilise une valeur intermédiaire car départ de la boucle sans valeur
    
   /* for ( int i=0; i<tab.length;i++) {
        for (int j=0; j < tab[0].length; j++){
            tab[i] [j] = val;
            val=val + pas;
            System.out.print(tab[i] [j]);
            System.out.print("\t");
            }
        System.out.println();
        }*/
   // Autre façon mieux.... nb de colonnes X i+ j * pas +val de départ
   // valeur de départ prémuni du départ à 0
     for ( int i=0; i<tab.length;i++) {
         for (int j=0; j < tab[0].length; j++){
             tab[i][j]=(tab[0].length *i + j )* pas + val;
                }
         }

         
     }
   */

   
    } 
}
