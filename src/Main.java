public class Main {
    public static void main(String[] args) {
        System.out.println("=== TEST MODUL 7: ABSTRACT CLASS & INTERFACE ===");

        // 1. Menggunakan Polymorphism melalui Abstract Class Reference
        Person p1 = new Pasien("P001", "Esy Aulia", "Demam Berdarah");
        Person p2 = new Dokter("D001", "dr. Ahmad, Sp.PD", "Penyakit Dalam");

        p1.tampilkanPeran();
        p2.tampilkanPeran();

        System.out.println("\n=== TEST POLYMORPHIC COLLECTION ===");
        Person[] daftarPerson = {
            new Pasien("P002", "Budi Santoso", "Flu Batuk"),
            new Dokter("D002", "dr. Siti, Sp.A", "Anak")
        };

        for (Person p : daftarPerson) {
            p.tampilkanPeran();
            p.tampilkanData();
            System.out.println("-------------------");
        }

        System.out.println("\n=== TEST INTERFACE ===");
        DapatDiingatkan pasienPengingat = new Pasien("P003", "Ani Rahma", "Sakit Kepala");
        pasienPengingat.kirimPengingatJadwal();
    }
}