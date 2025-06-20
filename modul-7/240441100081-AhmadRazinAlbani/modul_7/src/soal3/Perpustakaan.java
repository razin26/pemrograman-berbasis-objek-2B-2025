/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanBuku() {
        System.out.println("\nDaftar Buku:");
        int index = 1;
        for (Buku b : daftarBuku) {
            System.out.println(index++ + ". " + b.getJudul() + (b.isTersedia() ? " [Tersedia]" : " [Dipinjam]"));
        }
    }

    public Buku pilihBuku(int index) {
        if (index >= 0 && index < daftarBuku.size()) {
            return daftarBuku.get(index);
        } else {
            return null;
        }
    }
}

