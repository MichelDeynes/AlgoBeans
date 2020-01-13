/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP02;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class MoyenneTableau2dim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner reader = new Scanner (System.in);
    final int l=5, c=2;
    int somme = 0;
    double moyenne;
    int[][] tab = new int[l] [c];

    // int[] tab; déclaration du tableau
    // tab = new int [n]; creation du tableau
    //tab.length variable , propriete de l'objet tab
    //tab[0].length 2 dimension de tab
    
    for ( int i=0; i<tab.length;i++) {
        for (int j=0; j<tab[0].length;j++){
            System.out.println("Saisir ");
            tab[i] [j]= reader.nextInt();
            somme= somme + tab[i] [j];
        }
    }
    // je fait le cast de somme pour avoir les chiffres après la virgule.
    moyenne =(double) somme/(tab.length*tab[0].length);   
    System.out.println("la moyenne des nombres saisis vaut  : " + moyenne);
    }
 }