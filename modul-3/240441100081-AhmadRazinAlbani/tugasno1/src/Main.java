/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {      
        System.out.println("Data Mahasiswa Reguler:");
        MahasiswaReguler mr1 = new MahasiswaReguler("Yudistira Maulana", "240441100130", "2B");
        mr1.infoReguler();
        MahasiswaReguler mr2 = new MahasiswaReguler("Alfie Firmansyah", "240441100130", "2C");
        mr2.infoReguler();
        
        System.out.println("Data Mahasiswa Beasiswa:");
        MahasiswaBeasiswa mb1 = new MahasiswaBeasiswa("Surya Kartono", "24044110002", "Prestasi");
        mb1.infoBeasiswa();
        MahasiswaBeasiswa mb2 = new MahasiswaBeasiswa("Sinta Aulia", "240441100112", "Riset");
        mb2.infoBeasiswa();
    }
}
