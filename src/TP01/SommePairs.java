/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP01;

import static com.sun.javafx.fxml.expression.Expression.modulo;
import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class SommePairs {
    public static void main(String[] args) {
    Scanner reader = new Scanner (System.in);
    int i, j = 0;
    System.out.print("Saisir nombre :" );
    i = reader.nextInt();
    if (i%2>0){
     i--;}
    for( ; i>0; i=i-2) 
        {
        j=j+i;
        }
    System.out.println("la somme des nombres : " + j);
    /* somme des n nombres pairs saisis avec increment i=2
    for 
    for (i=2; i<=(i*2);i+2){ 
    somme=somme+i;
    
    */
    } 
    
}
