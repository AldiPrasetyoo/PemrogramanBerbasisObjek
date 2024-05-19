/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalNo2Person;

/**
 *
 * @author Aldy
 */
public class Student extends Person {
    public static final String MhsBaru = "Mahasiswa Baru";
    public static final String MhsTh2 = "Mahasiswa Tahun Ke-2";
    public static final String Junior = "Junior";
    public static final String Senior = "Senior";
    
    private String status;
    
    public Student (String nama, String alamat, String noTelpon, String email, String status){
        super(nama,alamat,noTelpon,email);
        this.status = status;
    }
    
    @Override
    public String toString(){
        return "Student : " + super.toString();
    }
}
