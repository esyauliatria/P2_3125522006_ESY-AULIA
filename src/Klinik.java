public class Klinik {
    private String namaKlinik;
    private Dokter dokterJaga;

    public Klinik(String namaKlinik, Dokter dokterJaga) {
        this.namaKlinik = namaKlinik;
        this.dokterJaga = dokterJaga;
    }

    public void cariDokter(String nama) {
        System.out.println("Mencari dokter dengan nama: " + nama);
        if (dokterJaga != null && dokterJaga.getNama().equalsIgnoreCase(nama)) {
            System.out.println("-> Dokter ditemukan di " + namaKlinik);
        } else {
            System.out.println("-> Dokter tidak ditemukan.");
        }
    }

    public void cariDokter(String spesialis, boolean bySpesialis) {
        System.out.println("Mencari dokter dengan spesialis: " + spesialis);
        if (dokterJaga != null && dokterJaga.getSpesialis().equalsIgnoreCase(spesialis)) {
            System.out.println("-> Dokter spesialis ditemukan di " + namaKlinik);
        } else {
            System.out.println("-> Dokter spesialis tidak ditemukan.");
        }
    }

    public void tampilkanInfoKlinik() {
        System.out.println("Nama Klinik: " + namaKlinik);
        System.out.println("Informasi Dokter Jaga:");
        if (dokterJaga != null) {
            dokterJaga.tampilkanData();
        }
    }
}