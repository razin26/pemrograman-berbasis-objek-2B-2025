/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class MahasiswaReguler extends Mahasiswa {
    String kelas;

    public MahasiswaReguler(String nama, String nim, String kelas) {
        super(nama, nim);
        this.kelas = kelas;
    }
    
    public void infoReguler(){
        infoMahasiswa();
        System.out.println("Kelas\t: " + kelas);
        System.out.println("");
    }
}
