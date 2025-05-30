/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




public class Klinik {
    private Pasien[] daftarPasien;
    private int jumlahPasien;
    
    public Klinik(int k){
        daftarPasien = new Pasien[k];
        jumlahPasien = 0;
    }
    
    public void tambahPasien(Pasien p){
        if (jumlahPasien < daftarPasien.length){
            daftarPasien[jumlahPasien] = p;
            jumlahPasien++;
        }else {
            System.out.println("Klinik Penuh");
        }
    }
    
    public void infoPasien() {
        for (int i=0; i<jumlahPasien; i++){
            Pasien p = daftarPasien[i];
            System.out.println("Nama: "+ p.getNama());
            System.out.println("Umur: "+ p.getUmur()+ " th");
            System.out.println("Keluhan: "+ p.getKeluhan());
            System.out.println("");
        }
    }
}
