/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aldy
 */

import java.util.Scanner;

public class BilanganNegatif {
    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);

        // Inputan   tiga bilangan bulat negatif
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = bilangan.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = bilangan.nextInt();

        System.out.print("Masukkan bilangan ketiga: ");
        int bil3 = bilangan.nextInt();

        // Operasi
        int tambah = bil1 + bil2 + bil3;
        int kurang = bil1 - bil2 - bil3;
        int kali = bil1 * bil2 * bil3;
        float bagi = (float) bil1 / bil2 / bil3;

        // Hasil operasi
        System.out.println("-----------------------------");
        System.out.println("Hasil penjumlahan: " + tambah);
        System.out.println("Hasil pengurangan: " + kurang);
        System.out.println("Hasil perkalian: " + kali);
        System.out.println("Hasil pembagian: " + bagi);
    }
}
