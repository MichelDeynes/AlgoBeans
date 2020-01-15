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
public class RecherchePlusGrand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner reader = new Scanner (System.in);
        final int n=10;
        int[] tab = new int[n];
        int val, j=0;
         System.out.print("Saisir Valeur ");
            tab[j] = reader.nextInt();
            val= tab[j];
            
        for (int i=1; i<tab.length;i++) {
            System.out.print("Saisir Valeur ");
            tab[i] = reader.nextInt();
            System.out.print("\n");
            if (val < tab[i] ){
                val= tab[i];
                j=i;
                }
        }
    System.out.printf("La valeur la plus grande contenue dans la ligne %d  ", j+1);
    }
    
}
