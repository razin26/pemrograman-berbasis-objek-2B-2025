/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author ASUS
 */
public class BukuFiksi extends Buku implements Peminjaman, Reservasi {

    public BukuFiksi(String judul) {
        super(judul);
    }

    @Override
    public void pinjam(String namaPeminjam) {
        if (tersedia) {
            System.out.println(namaPeminjam + " meminjam buku fiksi: " + judul);
            tersedia = false;
        } else {
            System.out.println("Buku fiksi \"" + judul + "\" sedang tidak tersedia.");
        }
    }

    @Override
    public void reservasi(String namaPeminjam) {
        System.out.println(namaPeminjam + " telah mereservasi buku fiksi: " + judul);
    }
}
