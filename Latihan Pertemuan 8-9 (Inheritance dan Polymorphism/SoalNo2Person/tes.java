/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalNo2Person;

/**
 *
 * @author Aldy
 */

public class tes {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Main St", "555-1234", "john@example.com");
        Student student = new Student("Jane Doe", "456 College Ave", "555-5678", "jane@example.com", Student.Junior);
        MyDate hireDate = new MyDate(2020, 5, 15);
        Employee employee = new Employee("Mark Smith", "789 Business Rd", "555-8765", "mark@example.com", "Office 1", 50000, hireDate);
        Fakultas faculty = new Fakultas("Dr. Lucy", "321 University St", "555-4321", "lucy@example.com", "Office 2", 70000, hireDate, 10, "Professor");
        StafPegawai staff = new StafPegawai("Anna Johnson", "654 Admin Ave", "555-6543", "anna@example.com", "Office 3", 40000, hireDate, "Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
