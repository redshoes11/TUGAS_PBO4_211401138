package abstrak;

public abstract class Karyawan {
    protected String name;
    protected int id;

    protected Karyawan(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract void displayInfo();
}
