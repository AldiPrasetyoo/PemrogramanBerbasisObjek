/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalNo2Person;

/**
 *
 * @author Aldy
 */
public class Pengujian {
    public static void main(String[] args) {
        Person person = new Person("Aldi Prasetyo", "Cimahi", "082117728116", "aldiprasetyowidodo@upi.edu");
        Student student = new Student("Aldi Prasetyo", "Cimahi", "082117728116", "aldiprasetyowidodo@upi.edu", Student.Junior);
        MyDate hireDate = new MyDate(2022, 5, 15);
        Employee employee = new Employee("Asep", "Bandung", "082113428116", "Asepkun@gmail.com", "FPMIPA", 2500000, hireDate);
        Fakultas faculty = new Fakultas("Dr. Didi", "Gegerkalong Tengah", "083115728116", "Di@upi.edu", "FPMIPA C", 7000000, hireDate, 15, "Professor");
        StafPegawai staff = new StafPegawai("Rusby", "Batujajar", "089652140252", "rusby@yahoo.co.id", "JICA", 4000000, hireDate, "Staff Workshop");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
