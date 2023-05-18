package kelas;

import abstrak.Karyawan;
import antarmuka.DetailKaryawan;

public class Staff extends Karyawan implements DetailKaryawan {
    private String position;

    public Staff(String name, int id, String position) {
        super(name, id);
        this.position = position;
    }

    public void displayInfo() {
        System.out.println("Staff");
        System.out.println("Name        : " + name);
        System.out.println("ID          : " + id);
        System.out.println("Position    : " + position);
    }

    public void displayDetails() {
        System.out.println("Staff Details:");
        System.out.println("Name        : " + name);
        System.out.println("ID          : " + id);
        System.out.println("Position    : " + position);
    }
}
