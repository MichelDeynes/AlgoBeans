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
public class Addition2Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         final int n=2;
    int[] [] tabA = new int[n] [n];
    int[] [] tabB = new int[n] [n];
    int[] [] tabC = new int[n] [n];
    Scanner reader = new Scanner (System.in);

    for ( int i=0; i<tabA.length;i++) {
         for ( int j=0; j<tabA[0].length;j++) {
            System.out.printf("Premier tableau Saisir la valeur ligne %d colonne %d ", i+1, j+1);
            tabA[i][j]= reader.nextInt();
        }
    }
    
System.out.println("");

    for ( int i=0; i<tabB.length;i++) {
         for ( int j=0; j<tabB[0].length;j++) {
            System.out.printf("Second tableau Saisir la valeur ligne %d colonne %d ", i+1, j+1);
            tabB[i][j]= reader.nextInt();
        }
    }

    
    System.out.println("");
     for ( int i=0; i<tabA.length;i++) {
         for ( int j=0; j<tabA[0].length;j++) {
             tabC[i] [j]= tabA[i][j]+tabB[i][j];
        }
    }
         // VERIFICATION 
 System.out.println("");

 for ( int i=0; i<tabC.length;i++) {
         for ( int j=0; j<tabC[0].length;j++) {
             System.out.print( tabC[i] [j] +"\t");
        }
    System.out.println("");
    }
    }
}
   