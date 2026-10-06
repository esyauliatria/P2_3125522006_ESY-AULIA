class Dokter {
    // Attribute
    String idDokter;
    String nama;
    String spesialis;

    // Constructor
    Dokter(String idDokter, String nama, String spesialis) {
        this.idDokter = idDokter;
        this.nama = nama;
        this.spesialis = spesialis;
    }

    // Method 1: Tanpa parameter
    void tampilkanData() {
        System.out.println("ID Dokter : " + idDokter);
        System.out.println("Nama      : " + nama);
        System.out.println("Spesialis : " + spesialis);
    }

    // Method 2: Dengan parameter
    void ubahSpesialis(String spesialisBaru) {
        this.spesialis = spesialisBaru;
    }

    // Method 3: Mengembalikan nilai (Return Value)
    String getNama() {
        return this.nama;
    }
}