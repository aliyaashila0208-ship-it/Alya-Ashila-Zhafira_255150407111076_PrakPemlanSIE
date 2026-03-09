public class Mobil {
    private String nopol;
    private String warna;
    private String merk;
    private int kecepatan;
    private double jarakTempuh;

    public void setNopol(String n) {
        nopol = n;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setMerk(String m) {
        merk = m;
    }

    public void setKecepatan(int k) {
        kecepatan = k;
    }

    public double hitungJarak(double waktu) {
        jarakTempuh = kecepatan * waktu;
        return jarakTempuh;
    }

    public double kecepatanMPS() {
        double mps = kecepatan / 3.6;
        System.out.println("Kecepatan dalam m/s: " + mps);
        return mps;
    }

    public void display() {
        System.out.println("Mobil bermerk " + merk);
        System.out.println("bernomor polisi " + nopol);
        System.out.println("serta memiliki warna " + warna);
        System.out.println("bergerak dengan kecepatan " + kecepatan + " kpj");
        System.out.println("jarak tempuh: " + jarakTempuh + " km");
    }
}