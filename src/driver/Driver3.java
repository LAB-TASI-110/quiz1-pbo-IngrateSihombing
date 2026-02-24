package driver;

import java.util.Scanner;

public class Driver3 ; {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Data Inisialisasi: Daftar 7 Asrama [cite: 2026-02-24]
        String[] daftarAsrama = {
            "Asrama PN1", "Asrama PN2", "Asrama PN3", 
            "Asrama PN4", "Asrama Silo", "Asrama Kapernaum", 
            "Asrama Antiokhia"
        };
        
        String[] daftarHari = {
            "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"
        };

        System.out.println("=== SISTEM OPERASIONAL LAUNDRY DEL ===");
        System.out.println("Pilih Hari Operasional (1-7):");
        for (int i = 0; i < daftarHari.length; i++) {
            System.out.println((i + 1) + ". " + daftarHari[i]);
        }

        // 2. INPUT: Staf memasukkan hari saat ini [cite: 2026-02-24]
        System.out.print("\nMasukkan nomor hari: ");
        int pilihanHari = sc.nextInt();

        // Validasi agar input tidak error jika di luar 1-7
        if (pilihanHari >= 1 && pilihanHari <= 7) {
            int indeksHariIni = pilihanHari - 1;

            // 3. PROSES: Menentukan jadwal jemput & antar [cite: 2026-02-24]
            // Jemput hari ini berdasarkan indeks hari
            String asramaJemput = daftarAsrama[indeksHariIni];

            // Antar asrama yang dijemput kemarin (H-1)
            // Jika hari ini Senin (indeks 0), maka kemarin adalah Minggu (indeks 6)
            int indeksKemarin = (indeksHariIni == 0) ? 6 : indeksHariIni - 1;
            String asramaAntar = daftarAsrama[indeksKemarin];

            // 4. OUTPUT: Menampilkan instruksi kerja petugas [cite: 2026-02-24]
            System.out.println("\n========================================");
            System.out.println("JADWAL HARI " + daftarHari[indeksHariIni].toUpperCase());
            System.out.println("----------------------------------------");
            System.out.println("[>>] JEMPUT (Kotor): " + asramaJemput);
            System.out.println("[<<] ANTAR  (Bersih): " + asramaAntar);
            System.out.println("========================================");
            System.out.println("Status: Operasional Berjalan");
        } else {
            System.out.println("Input tidak valid! Silakan masukkan angka 1-7.");
        }

        sc.close();
    }
}
