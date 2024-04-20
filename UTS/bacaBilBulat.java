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

public class bacaBilBulat {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int bilPositif = 0;
    int bilNegatif = 0;
    double nilaiTotal = 0;
    int inputBilangan;
    int totalInput = 0;
    
        System.out.println("Masukan bilangan integer, program akan berhenti jika memasukan nilai 0: ");
        
           while (true) {
            inputBilangan = input.nextInt();
            if (inputBilangan == 0) {
                break;
            } else if (inputBilangan > 0) {
                bilPositif++;
                nilaiTotal += inputBilangan;
            } else {
                bilNegatif++;
                nilaiTotal += inputBilangan;
            }
            totalInput++;
        }
        
        if(totalInput == 0){
            System.out.println("Kosong");
        }
        else{
            System.out.println("Jumlah bilangan positif adalah " + bilPositif);
            System.out.println("Jumlah bilangan negatif adalah " + bilNegatif);
            System.out.println("Nilai total adalah " + nilaiTotal);
            System.out.println("Nilai rata-rata " + (nilaiTotal / totalInput));
        }
}    
}
