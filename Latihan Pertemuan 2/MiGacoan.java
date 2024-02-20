/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aldy
 */

import java.util.Scanner;

public class MiGacoan {
    public static void main(String[] args) {
        Scanner uang = new Scanner(System.in);

        System.out.print("Masukkan jumlah uang Anda: ");
        int jumlahUang = uang.nextInt();

        boolean tidakAdaKelas = false;

        if (jumlahUang > 10000 && !tidakAdaKelas) {
            System.out.println("Anda bisa membeli migacoan!");
        } else {
            System.out.println("Anda tidak bisa membeli migacoan.");
        }
    }
}
