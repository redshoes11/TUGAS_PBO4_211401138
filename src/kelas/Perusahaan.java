package kelas;

import abstrak.Karyawan;

public class Perusahaan {
    private Karyawan[] karyawan;
    private int count;

    public Perusahaan(int size) {
        karyawan = new Karyawan[size];
        count = 0;
    }

    public void addKaryawan(Karyawan employee) {
        if (count < karyawan.length) {
            karyawan[count] = employee;
            count++;
        } else {
            System.out.println("Perusahaan telah mencapai kapasistas maksimum.");
        }
    }

    public void displayDetails() {
        for (Karyawan employee : karyawan) {
            if (employee != null) {
                employee.displayInfo();
            }
        }
    }
}
