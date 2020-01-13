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
public class MinTableau2dim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner reader = new Scanner (System.in);
    final int l=5, c=2;
    int min ;
    int[][] tab = new int[l] [c];

    // int[] tab; déclaration du tableau
    // tab = new int [n]; creation du tableau
    //tab.length : propriete de tab : tab[0].length 2eme dimension de tab
     
     
     for ( int i=0; i<tab.length;i++) {
        for (int j=0; j<tab[0].length;j++){
            System.out.print("Saisir nombre ");
            tab[i][j]= reader.nextInt();
            System.out.println();
        }
     }
     min=tab[0][0];
    for ( int i=0; i<tab.length;i++) {
        for (int j=0; j<tab[0].length;j++){
            if (tab[i][j]< min){
                min= tab[i][j];
            }
        }
    }  
    System.out.println("Le minimun des nombres saisis vaut  : " + min);
}
}
    
