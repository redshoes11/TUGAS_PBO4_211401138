package kelas;

import abstrak.Karyawan;
import antarmuka.DetailKaryawan;

public class Manager extends Karyawan implements DetailKaryawan {
    private String department;

    public Manager(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Manager");
        System.out.println("Name        : " + name);
        System.out.println("ID          : " + id);
        System.out.println("Department  : " + department);
    }

    public void displayDetails() {
        System.out.println("Manager Details:");
        System.out.println("Name        : " + name);
        System.out.println("ID          : " + id);
        System.out.println("Department  : " + department);
    }
}
