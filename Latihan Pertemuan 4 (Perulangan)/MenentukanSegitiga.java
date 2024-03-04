/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aldy
 */

import java.util.Scanner;

public class MenentukanSegitiga {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        System.out.println("Masukkan panjang sisi pertama (a):");
        a = scanner.nextInt();

        System.out.println("Masukkan panjang sisi kedua (b):");
        b = scanner.nextInt();

        System.out.println("Masukkan panjang sisi ketiga (c):");
        c = scanner.nextInt();
        System.out.println("----------------------------");

        // Mengecek apakah segitiga siku-siku
        if (c * c == a * a + b * b) {
            System.out.println("Segitiga Siku-Siku");
        }
        // Mengecek apakah segitiga tumpul
        else if (c * c > a * a + b * b) {
            System.out.println("Segitiga Tumpul");
        }
        // Mengecek apakah segitiga lancip
        else {
            System.out.println("Segitiga Lancip");
        }
    }
}