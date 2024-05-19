/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalNo2Person;

/**
 *
 * @author Aldy
 */
public class StafPegawai extends Employee {
    private String gelar;
    
    public StafPegawai(String nama,String alamat, String noTelpon, String email, String kantor, double gaji, MyDate tanggalDipekerjakan, String gelar){
        super(nama, alamat, noTelpon, email, kantor, gaji, tanggalDipekerjakan);
        this.gelar = gelar;
    }
    
    @Override
    public String toString(){
        return "Staf Pegawai : " + super.toString();
     }
}
