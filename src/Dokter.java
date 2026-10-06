public class Dokter extends Person {
    private String idDokter;
    private String spesialis;

    public Dokter(String idDokter, String nama, String spesialis) {
        super(nama);
        this.idDokter = idDokter;
        this.spesialis = spesialis;
    }

    public String getIdDokter() { return idDokter; }
    public String getSpesialis() { return spesialis; }

    @Override
    public void tampilkanPeran() {
        System.out.println("Peran: Dokter Spesialis");
    }

    @Override
    public void tampilkanData() {
        System.out.println("ID Dokter: " + idDokter);
        System.out.println("Nama Dokter: " + getNama());
        System.out.println("Spesialis: " + spesialis);
    }
}