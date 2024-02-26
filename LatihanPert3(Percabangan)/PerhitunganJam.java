/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aldy
 */

import java.util.Scanner;

public class PerhitunganJam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jam_awal, menit_awal, jam_akhir, menit_akhir, jam, menit, total_menit, konversi;

        System.out.print("Masukkan jam mulai : ");
        jam_awal = input.nextInt();
        menit_awal = input.nextInt();
        
        System.out.print("Masukkan jam akhir : ");
        jam_akhir = input.nextInt();
        menit_akhir = input.nextInt();

        if (jam_akhir < 10) {
            konversi = jam_awal - 12;
            total_menit = ((jam_akhir * 60) + menit_akhir) - ((konversi * 60) + menit_awal);
            jam = total_menit / 60;
            menit = total_menit % 60;
        } else {
            total_menit = ((jam_akhir * 60) + menit_akhir) - ((jam_awal * 60) + menit_awal);
            jam = total_menit / 60;
            menit = total_menit % 60;
        }
        
        
        System.out.println("--------------------------------------------------");
        System.out.println("Lama (Menit) : "+total_menit);
        System.out.println("Lama (Jam, Menit) : "+ jam +" Jam "+ menit +" Menit");
    }
}
