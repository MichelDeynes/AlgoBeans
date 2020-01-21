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
public class AppelPremier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner reader = new Scanner (System.in);
    int n;
    System.out.print("Saisir un nombre > 2 :");
    n = reader.nextInt();
     /*if (EstPremier (n))
            System.out.print("EST un nombre premier");
    else 
            System.out.print("PAS un nombre premier");
     */
     // Operateur ternaire
    // String msg = (EstPremier (n)) ? "Est premier" : "N'est pas premier";
    //System.out.println(msg);
    System.out.println((EstPremier(n)) ? "Premier" : "Pas premier");


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
    
}
