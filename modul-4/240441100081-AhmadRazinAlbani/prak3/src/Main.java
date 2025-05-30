/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Klinik k = new Klinik(5);
        
        k.tambahPasien(new Pasien("Tino", 20, "Demam"));
        k.tambahPasien(new Pasien("Sri", 27, "Sakit Kepala"));
        
        System.out.println("===Daftar Pasien===");
        k.infoPasien();
    }   
}
