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
public class AppelFactorielle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
        Scanner reader = new Scanner (System.in);
        int nb ;
        int var;

    System.out.print("Saisir nombre :");
    nb = reader.nextInt();
    
    var = factorielle (nb);
    System.out.println("Factorielle de  :" +nb +" est :" +var);   
    }
    public static int factorielle (int var) {
    int nb=1;
    for (int i=2; i<=var; i++) {       
        nb=nb * i;
        }
        return nb;
    }
}
