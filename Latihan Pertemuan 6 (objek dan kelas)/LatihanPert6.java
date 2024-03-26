/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package latihan.latihanpert6;

/**
 *
 * @author Aldy
 */
import java.util.Scanner;

class Segitiga {
    private double alas;
    private double tinggi;
    private double sisi;

    public Segitiga() {
        alas = 0;
        tinggi = 0;
        sisi = 0;
    }

    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    public double getKeliling() {
        return sisi * 3;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}

public class LatihanPert6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Segitiga segitiga = new Segitiga();

        System.out.print("Masukkan nilai alas: ");
        double alas = input.nextDouble();
        segitiga.setAlas(alas);

        System.out.print("Masukkan nilai tinggi: ");
        double tinggi = input.nextDouble();
        segitiga.setTinggi(tinggi);

        System.out.print("Masukkan nilai sisi : ");
        double sisi = input.nextDouble();
        segitiga.setSisi(sisi);

        double luas = segitiga.getLuas();
        double keliling = segitiga.getKeliling();

        System.out.println("=====================");
        System.out.println("Luas segitiga: " + luas);
        System.out.println("Keliling segitiga: " + keliling);
    }
}