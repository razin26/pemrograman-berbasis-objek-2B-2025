/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author ASUS
 */
public class BukuReferensi extends Buku implements Reservasi {

    public BukuReferensi(String judul) {
        super(judul);
    }

    @Override
    public void reservasi(String namaPeminjam) {
        System.out.println(namaPeminjam + " telah mereservasi buku referensi: " + judul);
    }
}
