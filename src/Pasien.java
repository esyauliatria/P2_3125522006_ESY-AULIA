public class Pasien extends Person implements DapatDiingatkan {
    private String idPasien;
    private String keluhan;
    private RekamMedis rekamMedis;

    public Pasien(String idPasien, String nama, String keluhan) {
        super(nama);
        this.idPasien = idPasien;
        this.keluhan = keluhan;
        this.rekamMedis = new RekamMedis("RM-" + idPasien, "Catatan awal keluhan: " + keluhan);
    }

    public String getIdPasien() { 
        return idPasien; 
    }
    
    public String getKeluhan() { 
        return keluhan; 
    }
    
    public RekamMedis getRekamMedis() { 
        return rekamMedis; 
    }

    @Override
    public void tampilkanPeran() {
        System.out.println("Peran: Pasien Klinik");
    }

    @Override
    public void tampilkanData() {
        System.out.println("ID Pasien   : " + idPasien);
        System.out.println("Nama Pasien : " + getNama());
        System.out.println("Keluhan     : " + keluhan);
        rekamMedis.tampilkanInfoMedis();
    }

    @Override
    public void kirimPengingatJadwal() {
        System.out.println("Pengingat: Pasien " + getNama() + " memiliki jadwal kontrol kesehatan.");
    }
}