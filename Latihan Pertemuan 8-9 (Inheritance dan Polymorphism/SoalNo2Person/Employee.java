/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalNo2Person;

/**
 *
 * @author Aldy
 */
public class Employee extends Person {
    private String kantor;
    private double gaji;
    private MyDate tanggalDipekerjakan;
    
    public Employee (String nama, String alamat, String noTelpon, String email, String kantor, double gaji, MyDate tanggalDipekerjakan){
        super(nama, alamat, noTelpon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalDipekerjakan = tanggalDipekerjakan;
    }
    
    @Override
    public String toString(){
        return "Employee : " + super.toString();
    }
}
