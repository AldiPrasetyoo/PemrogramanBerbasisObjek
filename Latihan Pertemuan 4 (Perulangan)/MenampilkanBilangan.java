/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aldy
 */

import java.util.Scanner;

public class MenampilkanBilangan {
    public static void main(String[] args){
        Scanner bilangan = new Scanner (System.in);
        
        System.out.println("Masukkan Bilangan n : ");
        int n = bilangan.nextInt();
        
        System.out.println("----------------------------");
        if(n>=1){
            int i = 1;
            while(i<=n){
                System.out.println(i);
                i++;
            }
        }else{
            System.out.println("Bilangan n Harus Lebih Besar Dari 1!");
        }
   
    }
}
