/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP01;
import java.util.Scanner;

/**
 
 * @author formation_gep
 */
public class Fibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Suite de fibomacci
        int n, i;
        int un=2, u1=1, u2=1;
        Scanner reader = new Scanner (System.in);
        System.out.print("Saisir nombre :");
        n = reader.nextInt();
        switch(n){
            case 1:
            case 2:
                System.out.println("Resutat 1 et 1");   
                break;
                default:
                    u1=1;
                    u2=1;
                    for ( i=3; i<=n;i++) {
                        un=u1 +u2;
                        u2=u1;
                        u1=un;
                        }        
        }
        
                    
                   
        
    
          System.out.println("Precedents   " +u2 +"  +   " +u1 +"   egal  " +un);   
    }

  }
                 
                 /* {  
                   un=u1+u2;
                    u2=u1;
                    u1=un;
                   } 
                     while (un<=n);   */