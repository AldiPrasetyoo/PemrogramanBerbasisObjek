/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalNo2Person;

/**
 *
 * @author Aldy
 */
public class Person {
    private String nama;
    private String alamat;
    private String noTelpon;
    private String email;
    
    public Person (String nama, String alamat, String noTelpon, String email){
        this.nama = nama;
        this.alamat = alamat;
        this.noTelpon = noTelpon;
        this.email = email;
    }
    
    @Override
    public String toString(){
        return "Person: " + nama;
    }
    
    
}