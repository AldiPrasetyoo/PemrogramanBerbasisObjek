/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Aldy
 */

class LimasSegiEmpat{
    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;
    
    public LimasSegiEmpat(){
        this.luasAlas = 0.0;
        this.luasSelubungLimas = 0.0;
        this.tinggi = 0.0;
    }
    
    public LimasSegiEmpat(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru){
        this.luasAlas = luasAlasBaru;
        this.luasSelubungLimas = luasSelubungLimasBaru;
        this.tinggi = tinggiBaru;
    }
    
    public double getLuas(){
        return luasAlas + luasSelubungLimas;
    }
    
    public double getVolume(){
        return (1.0/3.0) * luasAlas * tinggi;
    }
    
    public double getLuasAlas(){
        return luasAlas;
    }
    public double getLuasSelubungLimas(){
        return luasSelubungLimas;
    }
    public double getTinggi(){
        return tinggi;
    }
    
    public void setLuasAlas(double luasAlasBaru){
        this.luasAlas = luasAlasBaru;
    }
    
    public void setLuasSelubung(double luasSelubungBaru){
        this.luasSelubungLimas = luasSelubungBaru;
    }
    
    public void setTinggi(double tinggiBaru){
        this.tinggi = tinggiBaru;
    }
}

public class luasVolumLimasSegiEmpat {
    public static void main(String[] args){
        LimasSegiEmpat LimasSegiEmpat1 = new LimasSegiEmpat(1.0,1.0,1.0);
        System.out.println("Limas segi empat dengan luas alas : " + LimasSegiEmpat1.getLuasAlas() +
                ", luas selubung limas : " + LimasSegiEmpat1.getLuasSelubungLimas() + 
                " dan tinggi : " + LimasSegiEmpat1.getTinggi() + "." + "Luasnya : " + LimasSegiEmpat1.getLuas() + 
                " , sedangkan volumenya :  " + LimasSegiEmpat1.getVolume());
        
        LimasSegiEmpat LimasSegiEmpat2 = new LimasSegiEmpat(30.0,40.0,50.0);
        System.out.println("Limas segi empat dengan luas alas : " + LimasSegiEmpat2.getLuasAlas() +
                ", luas selubung limas : " + LimasSegiEmpat2.getLuasSelubungLimas() + 
                " dan tinggi : " + LimasSegiEmpat2.getTinggi() + "." + "Luasnya : " + LimasSegiEmpat2.getLuas() + 
                " , sedangkan volumenya :  " + LimasSegiEmpat2.getVolume());
        
        LimasSegiEmpat LimasSegiEmpat3 = new LimasSegiEmpat(25.0,35.0,45.0);
        System.out.println("Limas segi empat dengan luas alas : " + LimasSegiEmpat3.getLuasAlas() +
                ", luas selubung limas : " + LimasSegiEmpat3.getLuasSelubungLimas() + 
                " dan tinggi : " + LimasSegiEmpat3.getTinggi() + "." + "Luasnya : " + LimasSegiEmpat3.getLuas() + 
                " , sedangkan volumenya :  " + LimasSegiEmpat3.getVolume());
    }
}
