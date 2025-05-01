/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    String nama;
    String nim;
    
    public Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }
    public void infoMahasiswa(){
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + nim);
    }
        
}
