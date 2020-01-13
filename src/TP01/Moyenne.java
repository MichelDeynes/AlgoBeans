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
public class Moyenne {
    public static void main(String[] args) {
    Scanner reader = new Scanner (System.in);
    // N dimension du tableau 
    int n=10;
    int  k = 0;
     double j;
    // int[] tab; déclaration du tableau
    // tab = new int [n]; creation du tableau
    //tab.length variable , propriete de l'objet tab
    int[] tab = new int[n];
    for ( int i=0; i<tab.length;i++) {
    System.out.println("Saisir " +(i+1) +" nombre");
    tab[i]= reader.nextInt();
    k=k+tab[i];
    }
    // Je fais un Cast pour voir les chiffres apres la virgule.
    j= (double) k/tab.length;   
    System.out.println("la moyenne des nombres saisis vaut  : " + j);
    } 
}
