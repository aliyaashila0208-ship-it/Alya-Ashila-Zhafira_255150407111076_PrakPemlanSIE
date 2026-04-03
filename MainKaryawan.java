public class MainKaryawan {
    public static void main(String[] args) {

        KaryawanTetap k1 = new KaryawanTetap("Budi", 5000000);
        k1.cetakSlipGaji();

        System.out.println();

        KaryawanKontrak k2 = new KaryawanKontrak("Sari", 4000000, 18);
        k2.cetakSlipGaji();
    }
}
