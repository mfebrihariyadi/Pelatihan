/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cariprima;
import java.util.Scanner;
/**
 *
 * @author Master
 */
public class CariPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  System.out.println("Silakan masukkan bilangan prima ke-n : ");
   
  int angka = input.nextInt();
        for (int i = 0; i <= angka; i++) {
           
            int b = 0;
            for(int h=1; h<=i ;h++){
                if(i%h==1)
                    b=b+1; 
            }
            
            System.out.println("Bilangan prima ke"+i+" adalah "+b);
        }
 
  
  
    }
}