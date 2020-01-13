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
public class Leplusgrand {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner reader = new Scanner (System.in);
    int n=10;
    int  k;
    int i = 0;
    int[] tab = new int[n];

    //string msg = "Saisir nombre";
    // int[] tab; déclaration du tableau
    // tab = new int [n]; creation du tableau
    //tab.length variable , propriete de l'objet tab
    System.out.println("Saisir " +(i+1) +" nombre");
     tab[i]= reader.nextInt();
     k=tab[i];
    
    for (  i=1; i<tab.length;i++) {
        System.out.println("Saisir " +(i+1) +" nombre");
        tab[i]= reader.nextInt();
        if (tab[i]> k ){
            k=tab[i];
        }
    }
    
    System.out.println("le plus grand des nombres saisis vaut  : " + k);
    }
}
