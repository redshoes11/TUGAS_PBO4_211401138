// Berikut ini merupakan program Sistem Management Karyawan di Perusahaan

import kelas.Manager;
import kelas.Perusahaan;
import kelas.Staff;

public class Main {
    public static void main(String[] args) {
        // menambhakan banyak karyawan dalam perusahaan
        Perusahaan company = new Perusahaan(4);

        // membuat objek-objek karyawan
        Manager manager1 = new Manager("Mesiya Anastasia", 101, "HRD");
        Manager manager2 = new Manager("Risnia Gita", 102, "IT");
        Staff staff1 = new Staff("Elizabeth Bennet", 201, "Data Analyst");
        Staff staff2 = new Staff("Anna Karenina", 205, "Recruitment-Staff");
        Staff staff3 = new Staff("Sebastian Vettel",203, "Back-end Developer");

        // menambhakan karyawan ke dalam perusahaan
        company.addKaryawan(manager1);
        company.addKaryawan(manager2);
        company.addKaryawan(staff1);
        company.addKaryawan(staff2);

        // menampilkan detail seluruh karyawan di perusahaan
        company.displayDetails();

        System.out.println();

        // menampilkan detail karyawan secara khusus
        manager1.displayDetails();
        System.out.println();
        staff2.displayDetails();

        // menambahkan karyawan ke dalam perusahaan
        company.addKaryawan(staff3);
    }
}


