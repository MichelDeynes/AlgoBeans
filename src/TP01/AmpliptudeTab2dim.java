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
public class AmpliptudeTab2dim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner reader = new Scanner (System.in);
        final int l=5;
        final int c=2;
        int min;
        int max;
        int[][] tab = new int[l] [c];
      
     for ( int i=0; i<tab.length;i++) {
        for (int j=0; j<tab[0].length;j++){
            System.out.print("Saisir nombre ");
            tab[i][j]= reader.nextInt();
            System.out.println();
        }
     }
     min=tab[0][0];
     max=tab[0][0];

    for ( int i=0; i<tab.length;i++) {
        for (int j=0; j<tab[0].length;j++){
            if (tab[i][j]< min){
                min= tab[i][j];
            }
            else if (tab[i][j]> max){
                max=tab[i][j];  
                 }
            }
        }
        System.out.println("Le minimun et maximum de la série sont nombres : " +min +"\t" +max);
        System.out.println("L'amplitude est de  : " +(max-min));

    }
}
