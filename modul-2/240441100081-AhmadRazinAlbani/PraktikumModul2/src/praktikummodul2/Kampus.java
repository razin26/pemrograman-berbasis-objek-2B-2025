/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikummodul2;

public class Kampus {    
    String nama;
    String alamat;
    static int totalMhs = 0;
    
public Kampus(String nama, String alamat, int jumlahMhs){
    if(validasiKampus(nama)){
    this.nama = nama;
    this.alamat = alamat;
    totalMhs = jumlahMhs;
    }else {
        System.out.println("Nama kampus unvalid: "+ nama);
        System.out.println("");
    }
}
    
public void infoKampus(){
    if(nama != null){
     System.out.println("Nama Mahasiswa\t: "+ nama);
    System.out.println("Alamat Kampus\t: "+ alamat);
    System.out.println("Total Mahasiswa\t: "+ totalMhs);
    System.out.println("");
    }
}

public static boolean validasiKampus(String nama){
    return nama != null && !nama.matches(".*\\d.*");
    }
}


    
    
    
    
    
    
    
    

