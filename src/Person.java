public abstract class Person {
    private String nama;

    public Person(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Abstract Method yang wajib di-override oleh subclass
    public abstract void tampilkanPeran();

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
    }
}