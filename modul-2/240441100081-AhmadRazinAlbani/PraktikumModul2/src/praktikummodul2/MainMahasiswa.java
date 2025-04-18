/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikummodul2;

/**
 *
 * @author ASUS
 */
public class MainMahasiswa {

    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Putra", "2342042945", "SI");
        m1.tambahMataKuliah("Bhs Inggris");
        m1.tambahMataKuliah("PPKN");
        m1.tambahMataKuliah("PBD");
        m1.tambahMataKuliah("Bhs Indonesia");
        m1.tampilkanBiodata();
        
        Mahasiswa m2 = new Mahasiswa("Aby", "2349549305", "Teknik Informatika");
        m2.tambahMataKuliah("DMJ");
        m2.tambahMataKuliah("PBO");
        m2.tambahMataKuliah("PBW");
        m2.tambahMataKuliah("ALPRO");
        m2.tampilkanBiodata();
        
        Mahasiswa m3 = new Mahasiswa("Rio", "2453345", "SI");
        m3.tambahMataKuliah("Bhs Inggris");
        m3.tambahMataKuliah("PBO");
        m3.tambahMataKuliah("PBW");
        m3.tambahMataKuliah("ALPRO");
        m3.tampilkanBiodata();
        
        Mahasiswa m4 = new Mahasiswa("Toni", "2348953345", "SI");
        m4.tambahMataKuliah("Bhs Indonesia");
        m4.tambahMataKuliah("PBO");
        m4.tambahMataKuliah("PBW");
        m4.tambahMataKuliah("ALPRO");
        m4.tampilkanBiodata();
        
        Mahasiswa m5 = new Mahasiswa("Andhika", "2343234856", "Teknik Industri");
        m5.tambahMataKuliah("Teknologi");
        m5.tambahMataKuliah("PBO");
        m5.tambahMataKuliah("PBW");
        m5.tambahMataKuliah("Ecommerce");
        m5.tampilkanBiodata();
        
        Mahasiswa m6 = new Mahasiswa("Indra", "2343234856", "Psikologi");
        m6.tambahMataKuliah("Sains");
        m6.tambahMataKuliah("Sosiologi");
        m6.tambahMataKuliah("Antropologi");
        m6.tambahMataKuliah("Ilmu sosial");
        m6.tampilkanBiodata();
        
        System.out.println("Total Mahasiswa: " + Mahasiswa.getJumlahMahasiswa());
    }
}
