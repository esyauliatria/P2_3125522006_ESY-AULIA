public class Pemeriksaan {
    private int noAntrean;
    private Pasien pasien;
    private Dokter dokter;

    public Pemeriksaan(int noAntrean, Pasien pasien, Dokter dokter) {
        this.noAntrean = noAntrean;
        this.pasien = pasien;
        this.dokter = dokter;
    }

    public void tampilkanData() {
        System.out.println("Nomor Antrean: " + noAntrean);
        System.out.println("--- Data Pasien ---");
        pasien.tampilkanData();
        System.out.println("--- Data Dokter ---");
        dokter.tampilkanData();
    }
}