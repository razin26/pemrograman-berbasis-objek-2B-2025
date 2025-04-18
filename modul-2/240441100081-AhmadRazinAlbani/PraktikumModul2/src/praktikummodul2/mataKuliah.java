/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikummodul2;

public class mataKuliah {
    String kode;
    String nama;
    int jumlahSks;

public mataKuliah(String kode, String nama, int jumlahSks){
    if(ValidasiSks(jumlahSks)){
    this.kode = kode;
    this.nama = nama;
    this.jumlahSks = jumlahSks;
  }else {
        System.out.println("SKS unvalid: "+ jumlahSks);
        System.out.println("");
    }
}

public static boolean ValidasiSks(int sks) {
        return sks == 2 || sks == 3;
    }
public void tampilkanInfo(){
    if(jumlahSks != 0){
    System.out.println("Kode Matkul: "+ kode);
    System.out.println("Nama Matkul: "+ nama);
    System.out.println("Jumlah Sks : "+jumlahSks);
    System.out.println("");
        }  
    }
}







