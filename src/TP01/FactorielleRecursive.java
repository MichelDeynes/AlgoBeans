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
public class FactorielleRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        int nb ;
        int fact;
    System.out.print("Saisir nombre :");
    nb = reader.nextInt();
    
    fact = factorielle (nb);
    System.out.println("Factorielle de  :" +nb +" est :" +fact);   
    }
    public static int factorielle (int n) {
    if (n==0) return 1;
    else  return n * factorielle (n -1);
        }
    
}
