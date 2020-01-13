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
public class Circonference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   double diam, circ;
  //final double PI =3.14;
   Scanner reader = new Scanner (System.in);
        System.out.print (" diametre ?");
        diam  = reader.nextDouble();
circ = diam * Math.PI;
System.out.println("diametre =" + circ);
    
    }
}
