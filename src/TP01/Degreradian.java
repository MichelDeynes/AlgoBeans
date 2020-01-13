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
public class Degreradian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner reader = new Scanner (System.in);
    double degre; 
    double radian;
    System.out.print("Saisir radian :" );
         radian = reader.nextDouble();
degre = radian * (180/Math.PI);
    System.out.println("Conversion en degre  =" + degre);
    }
    
}
