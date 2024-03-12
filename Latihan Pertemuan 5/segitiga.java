/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aldy
 */

import java.util.Scanner;

public class segitiga {
    static void PenentuSegitiga(int a, int b, int c) {
        if (a <= b && b <= c) {
            if (c * c == a * a + b * b) {
                System.out.println("Segitiga Siku-Siku");
            } else if (c * c > a * a + b * b) {
                System.out.println("Segitiga Tumpul");
            } else {
                System.out.println("Segitiga Lancip");
            }
        } else {
            System.out.println("Data harus a <= b <= c");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        System.out.print("Masukkan panjang sisi pertama (a):");
        a = scanner.nextInt();

        System.out.print("Masukkan panjang sisi kedua (b):");
        b = scanner.nextInt();

        System.out.print("Masukkan panjang sisi ketiga (c):");
        c = scanner.nextInt();

        PenentuSegitiga(a, b, c);
    }
}
