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
public class RechercheTousPairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner reader = new Scanner (System.in);
        final int l=10;
        int[] tab = new int[l];
        boolean parite=true;
        int i;
        for ( i=0; i<tab.length;i++) {
            System.out.print("Saisir Valeur ");
            tab[i] = reader.nextInt();
            System.out.print("\n");
        }
        i=0;
        while ( i<tab.length && parite ){
         if (tab[i]%2 == 1){
             parite=false;
            }
         i++;
        }
        System.out.println("Parité   \n" + parite);
    }
}
