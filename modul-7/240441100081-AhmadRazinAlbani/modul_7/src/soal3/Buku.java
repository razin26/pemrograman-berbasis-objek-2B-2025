/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author ASUS
 */
public abstract class Buku {
    String judul;
    boolean tersedia = true;

    public Buku(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}

