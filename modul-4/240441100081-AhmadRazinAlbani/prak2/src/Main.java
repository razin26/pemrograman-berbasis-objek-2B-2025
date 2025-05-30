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
        Perpustakaan p = new Perpustakaan(5);
        
        p.tambahBuku(new Buku("Fisika", "Ali", 500));
        p.tambahBuku(new Buku("Bumi Manusia", "Pramodya", 400));
       
        System.out.println("===Daftar Buku===");
        p.infoBuku();
    }
}
