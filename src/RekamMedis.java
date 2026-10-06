public class RekamMedis {
    private String idRekamMedis;
    private String catatan;

    public RekamMedis(String idRekamMedis, String catatan) {
        this.idRekamMedis = idRekamMedis;
        this.catatan = catatan;
    }

    public void tampilkanInfoMedis() {
        System.out.println("-> [Rekam Medis ID: " + idRekamMedis + " | Catatan: " + catatan + "]");
    }
}