/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalNo1Segtiga;

/**
 *
 * @author Aldy
 */
public class Geometris {
    private String warna;
    private boolean terisi;
    
    public Geometris(){
    warna = "putih";
    terisi = false;
}
    
    public Geometris (String warna, boolean terisi){
        this.warna = warna;
        this.terisi = terisi;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public boolean getTerisi(){
        return terisi;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public void setTerisi(boolean terisi){
        this.terisi = terisi;
    }
    
    public String toString(){
        return "Segitiga berwarna : "+ warna + "dan terisi : " + terisi;
    }
    
}
