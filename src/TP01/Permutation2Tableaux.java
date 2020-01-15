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
public class Permutation2Tableaux {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
    final int n=10;
    int[] tabA = new int[n];
    int[] tabB = new int[n];

    for ( int i=0; i<tabA.length;i++) {
           // System.out.printf("Saisir la valeur %d :", i);

            System.out.print("Saisir la valeur du poste ");
            System.out.print(i);
            System.out.print(" du tableau: ");
            tabA[i]= reader.nextInt();
        }
        //int j=(tabB.length);

    for ( int i=0; i<(tabA.length);i++) {
            // j--;
            //tabB[j]=tabA[i];
            tabB[i]=tabA[n-i-1];
        }
    // VERIFICATION 
   for ( int i=0; i<tabA.length;i++) {
        System.out.print( tabA[i] +"\t");
        }
    System.out.println("");

   for ( int i=0; i<tabB.length;i++) {
        System.out.print( tabB[i] +"\t");
        }
    System.out.println("");
    }
    
}
