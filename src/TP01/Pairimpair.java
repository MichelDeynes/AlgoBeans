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
public class Pairimpair {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        int nb;

System.out.print("Saisir nombre :");
            nb = reader.nextInt();

    if (nb % 2 > 0 )
    {       System.out.print("Impair  :");}
                
    else
            { System.out.print("Pair  :");}

    }
}
