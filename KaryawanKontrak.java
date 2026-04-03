public class KaryawanKontrak extends Karyawan {
    private int hariKerja;

    public KaryawanKontrak(String nama, double gajiPokok, int hariKerja) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.hariKerja = hariKerja;
    }

    @Override
    public double hitungGaji() {
        return (gajiPokok / 22) * hariKerja; // dihitung per hari kerja
    }

    @Override
    public double hitungBonus() {
        return 0; 
    }
}