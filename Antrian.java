import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Antrian { 

    public static void main(String[] args) { 
        Queue<String> queue = new LinkedList<>(); 
        Scanner sc = new Scanner(System.in); 
        
        while (true) { 
            System.out.println("\nMenu Antrian Pelanggan:"); 
            System.out.println("1. Tambah Pelanggan"); 
            System.out.println("2. Layani Pelanggan"); 
            System.out.println("3. Tampilkan Antrian"); 
            System.out.println("4. Lihat Antrian Terdepan (Peek)"); 
            System.out.println("5. Keluar"); 
            System.out.print("Pilih (1-5): "); 
            
            try { 
                int choice = sc.nextInt(); 
                sc.nextLine(); // Membuang karakter newline dari buffer
                
                switch (choice) { 
                    case 1: 
                        System.out.print("Masukan Nama Pelanggan: "); 
                        String name = sc.nextLine(); 
                        queue.add(name); // Operasi Enqueue
                        System.out.println(name + " ditambahkan ke antrian."); 
                        break; 

                    case 2: 
                        if (queue.isEmpty()) {
                            System.out.println("Antrian kosong."); 
                        } else { 
                            String nama = queue.poll(); // Operasi Dequeue
                            System.out.println("Melayani pelanggan : " + nama); 
                        } 
                        break; 

                    case 3: 
                        System.out.println("Antrian Saat Ini: " + queue); 
                        break; 

                    case 4: 
                        // Implementasi instruksi nomor 2: Peek
                        if (queue.isEmpty()) {
                            System.out.println("Tidak ada antrian");
                        } else {
                            String terdepan = queue.peek(); // Hanya melihat, tidak menghapus
                            System.out.println("Pelanggan di posisi paling depan adalah: " + terdepan);
                        }
                        break;

                    case 5: 
                        System.out.println("Keluar."); 
                        sc.close(); 
                        return; 

                    default: 
                        System.out.println("Input tidak valid. Pilih 1-5.");
                } 
            } catch(Exception e) { 
                System.out.println("Error: Terjadi kesalahan input."); 
                sc.next(); // Membersihkan token input yang salah
            } 
        } 
    } 
}