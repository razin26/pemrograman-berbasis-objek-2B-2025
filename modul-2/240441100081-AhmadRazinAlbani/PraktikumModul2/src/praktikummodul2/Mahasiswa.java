/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikummodul2;

public class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    String daftarMataKuliah = "";
    
    static int JumlahMahasiswa = 0;

public Mahasiswa(String nama, String nim, String prodi){
    if(validasiNIM(nim)){
    this.nama = nama;
    this.nim = nim;
    this.prodi = prodi;
    
    JumlahMahasiswa++;
    }else{
        System.out.println("NIM unvalid: "+ nim);
        System.out.println("");
        this.nim = null;
    }  
 }

public void tambahMataKuliah(String mataKuliah){
    if(daftarMataKuliah.isEmpty()){
    daftarMataKuliah = mataKuliah;
    }else {
    daftarMataKuliah += ", "+ mataKuliah;
    }
}

public void tampilkanBiodata(){
    if(nim != null){
    System.out.println("Nama \t: "+nama);
    System.out.println("NIM \t: "+nim);
    System.out.println("Prodi \t: "+prodi);
    System.out.println("Mata Kuliah yang diambil: "+daftarMataKuliah);
    System.out.println("");
    }
    if (daftarMataKuliah.isEmpty()) {
            System.out.println("  Belum ada mata kuliah yang diambil.");
    }
}
public static int getJumlahMahasiswa() {
        return JumlahMahasiswa;
}

public static boolean validasiNIM(String nim) {
        return nim != null && nim.matches("^23\\d{8}$");
    }
}
