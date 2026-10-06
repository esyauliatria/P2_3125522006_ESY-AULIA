public class Main {
    public static void main(String[] args) {
        // --- 1. INSTANSIASI OBJECT (Minimal 2 object per class) ---
        // Object Class Pasien
        Pasien pasien1 = new Pasien("P001", "Esyaulia", "Demam dan Batuk");
        Pasien pasien2 = new Pasien("P002", "Rian", "Sakit Gigi");

        // Object Class Dokter
        Dokter dokter1 = new Dokter("D001", "dr. Ahmad", "Umum");
        Dokter dokter2 = new Dokter("D002", "drg. Sarah", "Gigi");

        // Object Class Pemeriksaan
        Pemeriksaan periksa1 = new Pemeriksaan(1, pasien1, dokter1);
        Pemeriksaan periksa2 = new Pemeriksaan(2, pasien2, dokter2);


        // --- 2. PENGUJIAN METHOD & TAMPILAN DATA ---
        System.out.println("====================================");
        System.out.println("      PENGUJIAN CLASS PASIEN");
        System.out.println("====================================");
        pasien1.tampilkanData();
        System.out.println("\n-> Mengubah keluhan pasien1...");
        pasien1.ubahKeluhan("Demam dan Flu Ringan");
        System.out.println("Nama Pasien (via getNama): " + pasien1.getNama());

        System.out.println("\n====================================");
        System.out.println("      PENGUJIAN CLASS DOKTER");
        System.out.println("====================================");
        dokter1.tampilkanData();
        System.out.println("\n-> Mengubah spesialis dokter1...");
        dokter1.ubahSpesialis("Penyakit Dalam");
        System.out.println("Nama Dokter (via getNama): " + dokter1.getNama());

        System.out.println("\n====================================");
        System.out.println("   PENGUJIAN CLASS PEMERIKSAAN");
        System.out.println("====================================");
        periksa1.tampilkanData();
        System.out.println();
        periksa1.ubahAntrean(10);
        System.out.println("Nomor Antrean Terkini (via getNoAntrean): " + periksa1.getNoAntrean());
    }
}