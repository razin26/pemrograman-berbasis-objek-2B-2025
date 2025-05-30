/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Buku {
    private String judul;
    private String penulis;
    private int jumlahHal;
    
    public Buku(String judul, String penulis, int jumlahHal ) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahHal = jumlahHal;
    }
    
    public String getJudul(){
        return judul;
    }
    public String getPenulis(){
        return penulis;
    }
    public int getJumlahHal(){
        return jumlahHal;
    }  
}
