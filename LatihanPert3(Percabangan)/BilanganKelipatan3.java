/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aldy
 */

import java.util.Scanner;

public class BilanganKelipatan3 {
    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);

        System.out.print("Masukkan Bilangan Desimal 2 Angka Belakang Koma: ");
        double desimal = bilangan.nextDouble();

        int angkaDepanKoma = (int) desimal;
        int angkaBelakangKoma = (int) ((desimal - angkaDepanKoma)*100);

        System.out.printf("Angka Depan Koma : %d\nAngka Belakang Koma : %d\n",angkaDepanKoma, angkaBelakangKoma);
        System.out.printf("Mod Angka Depan Koma : %d\nMod Angka Belakang Koma : %d\n",angkaDepanKoma%3, angkaBelakangKoma%3);
        System.out.println("----------------------------------------------------");
        if (angkaDepanKoma % 3 == 0 && angkaBelakangKoma % 3 == 0) {
            System.out.println("Angka di depan koma dan di belakang koma adalah kelipatan 3.");
        } else {
            System.out.println("Angka di depan koma dan di belakang koma bukan kelipatan 3.");
        }
    }
}
