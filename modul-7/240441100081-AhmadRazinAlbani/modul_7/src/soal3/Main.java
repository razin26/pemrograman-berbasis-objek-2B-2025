/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan sistem = new Perpustakaan();

        // Tambahkan contoh buku
        sistem.tambahBuku(new BukuFiksi("Laskar Pelangi"));
        sistem.tambahBuku(new BukuFiksi("Bumi"));
        sistem.tambahBuku(new BukuReferensi("Ensiklopedia Indonesia"));
        sistem.tambahBuku(new BukuReferensi("Atlas Dunia"));

        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        while (true) {
            sistem.tampilkanBuku();
            System.out.print("\nPilih nomor buku (0 untuk keluar): ");
            int pilihan = input.nextInt();
            input.nextLine(); // konsumsi newline

            if (pilihan == 0) break;

            Buku buku = sistem.pilihBuku(pilihan - 1);
            if (buku == null) {
                System.out.println("Pilihan tidak valid.");
                continue;
            }

            System.out.println("1. Pinjam");
            System.out.println("2. Reservasi");
            System.out.print("Pilih: ");   
            int aksi = input.nextInt();
            input.nextLine();
            
            if (aksi == 1 && buku instanceof Peminjaman) {
                ((Peminjaman) buku).pinjam(nama);
            } else if (aksi == 2 && buku instanceof Reservasi) {
                ((Reservasi) buku).reservasi(nama);
            } else {
                System.out.println("Tindakan tidak tersedia untuk jenis buku ini.");
            }
        }

        System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
    }
}
