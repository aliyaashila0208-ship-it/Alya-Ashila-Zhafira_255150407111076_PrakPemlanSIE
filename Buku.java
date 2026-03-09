public class Buku { 
public String judul; 
public int halaman; 
public String author; 
public Penerbit penerbit; 
public void display() { 
System.out.println("Buku " + judul); 
System.out.println("Halaman: " + halaman); 
System.out.println("Author : " + author); 
penerbit.display(); 
System.out.println("------------------"); 
} 
}

public class BukuApp { 
 public static void main(String[] args) { 
  
 Penerbit gm = new Penerbit("Gramedia", "Jakarta"); 
 Penerbit sp = new Penerbit("Springer", "New York"); 
 Buku artikel = new Buku(); 
 artikel.judul = "Rahasia OOP"; 
 artikel.halaman = 10; 
 artikel.author = "John D. Walker"; 
 artikel.penerbit = gm; 
 Buku paper = new Buku(); 
 paper.judul = "Tips dan Trik Pemrograman Diet"; 
 paper.halaman = 240; 
 paper.author = "Cydia Lapr"; 
 paper.penerbit = sp; 
  
 // === 
 artikel.display(); 
 paper.display(); 
 // copy! 
 artikel.author = paper.author; 
 artikel.author = "Halu de Luna"; 
 artikel.display(); 
 paper.display(); 
 // copy! 
 artikel.penerbit = paper.penerbit; 
 artikel.penerbit.nama = "UB Press"; 
 artikel.display(); 
 paper.display(); 
 } 
}

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

public class Penerbit { 
 String nama; 
 String kota = "Malang"; 
 Penerbit() { 
 this.nama = "Springer"; 
 } 
 Penerbit(String nama) { 
 this.nama = nama; 
 } 
 Penerbit(String nama, String kota) { 
 this.nama = nama; 
 this.kota = kota; 
 } 
 public void display() { 
 System.out.println("Penerbit " + nama); 
 System.out.println("di Kota " + kota); 
 } 
}


public class PenerbitApp { 
 public static void main(String[] args) { 
 Penerbit penerbit = new Penerbit(); 
 penerbit.display(); 
 Penerbit or = new Penerbit("O'Reilly"); 
 or.display(); 
 Penerbit gm = new Penerbit("Gramedia", "Jakarta"); 
 gm.display(); 
 } 
}
