/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanpertemuan7;

/**
 *
 * @author Aldy
 */

import java.util.Scanner;

class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation() {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public void setBil(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean isSolvable() {
        return a * d - b * c != 0;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

    public static void main(String[] args) {
        LinearEquation persamaan = new LinearEquation();
        System.out.println("Masukkan nilai a, b, c, d, e, f untuk persamaan ax + by = e dan cx + dy = f:");
        Scanner nilai = new Scanner(System.in);
        double a = nilai.nextDouble();
        double b = nilai.nextDouble();
        double c = nilai.nextDouble();
        double d = nilai.nextDouble();
        double e = nilai.nextDouble();
        double f = nilai.nextDouble();

        persamaan.setBil(a, b, c, d, e, f);
        if (persamaan.isSolvable()) {
            System.out.println("Solusi x = " + persamaan.getX() + " dan y = " + persamaan.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi");
        }
    }
}
