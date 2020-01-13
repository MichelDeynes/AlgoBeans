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
public class PermutationTableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
    final int l=10;
    int val;
    int[] tab = new int[l];
    int j=(tab.length);
    for ( int i=0; i<tab.length;i++) {
           // System.out.printf("Saisir la valeur %d :", i);

            System.out.print("Saisir la valeur ");
            System.out.print(i);
            System.out.print(": ");
            tab[i]= reader.nextInt();
        }
    // La moitie de la dimension !
    for ( int i=0; i<(tab.length/2);i++) {
            j--;
            val=tab[i];
            tab[i]=tab[j];
            tab[j]=val;
        }
   for ( int i=0; i<tab.length;i++) {
        System.out.print( tab[i] +" ");
      //System.out.printf( tab[i] +" ");
        }
    }
}
    
    

