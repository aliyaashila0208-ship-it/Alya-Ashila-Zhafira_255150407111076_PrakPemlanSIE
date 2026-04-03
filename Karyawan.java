public abstract class Karyawan {
    protected String nama;
    protected double gajiPokok;

    public abstract double hitungGaji();
    public abstract double hitungBonus();

    public void cetakSlipGaji() {
        System.out.println("=== Slip Gaji ===");
        System.out.println("Nama      : " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Total Gaji: " + hitungGaji());
        System.out.println("Bonus     : " + hitungBonus());
        System.out.println("=================");
    }
}