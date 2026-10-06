class Pemeriksaan {
    // Attribute
    int noAntrean;
    Pasien pasien;
    Dokter dokter;

    // Constructor
    Pemeriksaan(int noAntrean, Pasien pasien, Dokter dokter) {
        this.noAntrean = noAntrean;
        this.pasien = pasien;
        this.dokter = dokter;
    }

    // Method 1: Tanpa parameter
    void tampilkanData() {
        System.out.println("Nomor Antrean : " + noAntrean);
        System.out.println("--- Data Pasien ---");
        pasien.tampilkanData();
        System.out.println("--- Data Dokter ---");
        dokter.tampilkanData();
    }

    // Method 2: Dengan parameter
    void ubahAntrean(int noAntreanBaru) {
        this.noAntrean = noAntreanBaru;
        System.out.println("Nomor antrean berhasil diperbarui menjadi: " + noAntreanBaru);
    }

    // Method 3: Mengembalikan nilai (Return Value)
    int getNoAntrean() {
        return this.noAntrean;
    }
}