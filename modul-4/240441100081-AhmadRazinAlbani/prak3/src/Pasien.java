/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Pasien {
    private String nama;
    private int umur;
    private String keluhan;
    
    public Pasien(String nama, int umur, String keluhan){
        this.nama = nama;
        this.umur = umur;
        this.keluhan = keluhan;
    }
    
    public String getNama(){
        return nama;
    }
    public int getUmur(){
        return umur;
    }
    public String getKeluhan(){
        return keluhan;
    }
    
}
