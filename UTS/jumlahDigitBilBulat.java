/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Aldy
 */

import java.util.Scanner;

public class jumlahDigitBilBulat {
    public static int sumDigits(long n){
        int sum = 0;
        
        while(n != 0){
            int digit = (int)(n%10);
            sum += digit;
            n /= 10;
        }
        
        return sum;
    }
    
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Bulat : ");
        long bilBulat = input.nextLong();
        
        int sum = sumDigits(bilBulat);
        System.out.println("Jumlah Digit dalam Bilangan " + bilBulat + " adalah " + sum);
    }
}
