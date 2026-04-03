public class KaryawanTetap extends Karyawan {

    public KaryawanTetap(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (0.1 * gajiPokok); // tunjangan 10%
    }

    @Override
    public double hitungBonus() {
        return gajiPokok * 2; 
    }
}