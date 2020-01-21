/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class Polybe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
final int N =5;
char [] [] T = new char [][] {
                                {'A','B','C','D','E'},
                                {'F','G','H','I','J'},
                                {'K','L','M','N','O'},
                                {'P','Q','R','S','T'},
                                {'U','V','X','Y','Z'}
                                };
                        for (int i=0; i<N; i++){
                            System.out.println();
                            for  (int j=0; j<N; j++){
                            System.out.print(T[i][j] + "");
                            }        
                        }    
    // La Fonction de codage du Polybe
    String mot;
    Scanner reader = new Scanner (System.in);
    System.out.print(" Saisir le mot à coder : ");
        mot = reader.next().toUpperCase();
        // je code la chaine de caracteres et j'affiche le code
        int [] motcrypte = codepolybe (mot);
        for (int i=0; i< motcrypte.length; i++){
            System.out.print(motcrypte[i] + " ");
            }
        // je decode le mot crypte et j'affiche 
       // mot = decodepolybe (motcrypte);
       System.out.println("Le mot chiffre est : " + decodepolybe(motcrypte));

    }
    
public static int [] codepolybe (String mot) {
final int N =5;
char [] [] T = new char [][] {
                                {'A','B','C','D','E'},
                                {'F','G','H','I','J'},
                                {'K','L','M','N','O'},
                                {'P','Q','R','S','T'},
                                {'U','V','X','Y','Z'}
                                };

// il me faudra un tableau du double de la longueur du mot car codé par deux nombres
    int c [] = new int [mot.length()*2]; // tableau qui contiendra le mot codé
    char lettre; // la lettre courante à traiter
    int pos=0; // la postion courante pour ecrire dans le tableau
        
    for (int k = 0; k< mot.length(); k++)  {
        lettre = mot.charAt(k); // la lettre à l'indice donné
        if (lettre == 'W') lettre= 'V';
        for (int i=0; i<N; i++ ){
            for (int j=0; j<N; j++ ){
               if (lettre == T[i] [j]) {
                    c[pos++]=i; // incrementation apres affectation
                    c[pos++]=j;// ecriture des 2 chiffres pour le codage dela lettre
                    }
               }
            }
        } 
    return c;
    }

public static String  decodepolybe ( int motcrypte[]) {
final int N =5;
char [] [] T = new char [][] {
                                {'A','B','C','D','E'},
                                {'F','G','H','I','J'},
                                {'K','L','M','N','O'},
                                {'P','Q','R','S','T'},
                                {'U','V','X','Y','Z'}
                                };

    String mot="";
        // de 2 en 2 car une lettre est codée par deux chiffres
    for (int k = 0; k< motcrypte.length; k=k+2)  {
        int i = motcrypte[k];
        int j = motcrypte[k+1];
        if (T [i] [j] == 'V') // cas du W
            mot = mot + "W/V";
        else
            mot = mot + T [i] [j]; // l'addition de chaines de car. concatène
            }
    return mot;
    }
}


