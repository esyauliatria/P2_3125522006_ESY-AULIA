class Pasien {
    // Attribute
    String idPasien;
    String nama;
    String keluhan;

    // Constructor
    Pasien(String idPasien, String nama, String keluhan) {
        this.idPasien = idPasien;
        this.nama = nama;
        this.keluhan = keluhan;
    }

    // Method 1: Tanpa parameter
    void tampilkanData() {
        System.out.println("ID Pasien : " + idPasien);
        System.out.println("Nama      : " + nama);
        System.out.println("Keluhan   : " + keluhan);
    }

    // Method 2: Dengan parameter
    void ubahKeluhan(String keluhanBaru) {
        this.keluhan = keluhanBaru;
    }

    // Method 3: Mengembalikan nilai (Return Value)
    String getNama() {
        return this.nama;
    }
}