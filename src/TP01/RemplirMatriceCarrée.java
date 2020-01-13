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
public class RemplirMatriceCarrée {
// Carré magique d'ordre impair !
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
    int n,l,c;
    // int[] [] tab = new int[l];
    //Pile de valeurs.
    int pile;
    int[] [] tab;
    
    System.out.print("Saisir la dimension de la matrice : ");
        n = reader.nextInt();
        tab  = new int [n] [n];

        //Positionnement initial de départ
        // colonne du milieu, ligne + 1
        // avec modulo si indice sors du tabeau j'entre par la gauche
        c=n/2;
        l=c+1;
        l=l++;
        pile= 1;
        tab[l][c]=pile;
       for (pile=2; pile <=n*n; pile++){
            if (((pile-1)%n==0)){
                l=(l+2)%n;
                }
            else {
                c=(c+1)%n;
                l=(l+1)%n;
                }
            tab[l] [c]=pile;
            }
    
    for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++){
            System.out.print(  "\t" +tab[i][j]);
            //System.out.println();

        }
                    System.out.println();

    }
    }
    }
