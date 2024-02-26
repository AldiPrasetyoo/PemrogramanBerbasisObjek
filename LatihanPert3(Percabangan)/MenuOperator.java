/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aldy
 */

import java.util.Scanner;

public class MenuOperator {
    public static void main(String[] args){
        Scanner operator = new Scanner (System.in);
        Scanner bilangan = new Scanner (System.in);
        
        System.out.print("Masukkan Bilangan Pertama: ");
        int bil1 = bilangan.nextInt();
        System.out.print("Masukkan Bilangan Kedua: ");
        int bil2 = bilangan.nextInt();
        
        System.out.print("Masukkan Operator Aritmatika: ");
        char op = operator.next().charAt(0);
        
        int hasil = 0;
        switch(op){
            case '+':
                hasil = bil1+bil2;
                break;
            case '-':
                hasil = bil1-bil2;
                break;
            case '*':
                hasil = bil1*bil2;
                break;
            case '/':
                hasil = bil1/bil2;
                break;
            case '%':
                hasil = bil1%bil2;
                break;
            default:
                System.out.println("Data Yang Anda Masukan Salah");
                return;
        }
            System.out.println("------------------------------------------------------");
            System.out.println("Hasil dari " + bil1 + " " + op + " " + bil2 + " adalah " + hasil);
    }
}
