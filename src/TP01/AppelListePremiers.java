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
public class AppelListePremiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner reader = new Scanner (System.in);
    int n;
    System.out.print("Saisir un nombre > 2 :");
    n = reader.nextInt();

    System.out.println("Liste des nombres premiers de l'intervalle [3, n] " +n);
    //AfficheNP(n);
    // pOUR LES NOMBRES eNTIERS jUMEAUX CAD QUI ON 2 DE DIFFERENCE.
        AfficheNPJ(n);

    }
    public static boolean EstPremier (int n) {
    int div=3;
    if (n%2==0) return false;
    
    while (div * div <= n && n%div >0){
        div = div +2;
        }
    // retourne un bouléen ( > n donc j'ai dépassé n est il est premier
    // < n je suis sorti du tant-que par la condition n modulo de div > 0
    return div * div > n;
    }

public static void AfficheNPJ (int n) {
    int avantdernier, dernier=2;
            System.out.printf("Liste des nombres premiers jumeaux %n");
            for (int i=3; i <= n; i++) { 
            if (EstPremier (i)){
                
             /*  if (avantdernier == i-2 ) {
                System.out.printf(" %d %d %n", i-2, i);
                    }
                }
                */
                 avantdernier=dernier;
                 dernier=i;
               if (dernier == avantdernier+2 ) {
                System.out.printf(" %d %d %n", avantdernier, dernier);
                    }
                    // avantdernier=i; 
                }

            }
           System.out.printf("%n Fin de Liste %n");
        }

}

