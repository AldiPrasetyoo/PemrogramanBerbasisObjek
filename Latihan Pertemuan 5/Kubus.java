/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aldy
 */

import java.util.Scanner;

public class Kubus {
    static void penentuKubus(int sisi1,int sisi2,int sisi3){
        boolean sama = true;
        for (int i = 1; i < 3; i++) {
            if ((sisi1 != sisi2) || (sisi1 != sisi3) || (sisi2 != sisi3)) {
                sama = false;
                break;
            }
        }

        if (sama) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }
    
    public static void main(String[]args){
        Scanner sisi = new Scanner (System.in);
        
        System.out.print("Masukkan Sisi Ke-1 : ");
        int sisi1 = sisi.nextInt();
        System.out.print("Masukkan Sisi Ke-2 : ");
        int sisi2 = sisi.nextInt();
        System.out.print("Masukkan Sisi Ke-3 : ");
        int sisi3 = sisi.nextInt();
        
        penentuKubus(sisi1,sisi2,sisi3);
    }
}
