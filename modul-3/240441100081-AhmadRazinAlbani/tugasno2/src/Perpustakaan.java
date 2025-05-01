/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Perpustakaan {
    ArrayList<BukuFiksi> koleksiFiksi;
    ArrayList<BukuNonFiksi> koleksiNonFiksi;
    
    public Perpustakaan(){
        koleksiFiksi = new ArrayList<>();
        koleksiNonFiksi = new ArrayList<>();
    }
    
    public void tambahBukuFiksi(BukuFiksi buku){
        koleksiFiksi.add(buku);
    }
    
    public void tambahBukuNonFiksi(BukuNonFiksi buku){
        koleksiNonFiksi.add(buku);
    }
    
    public void tampilkanKoleksi(){
        System.out.println("====Buku Fiksi====");
        for (BukuFiksi f : koleksiFiksi){
            f.infoFiksi();
        }
        System.out.println("====Buku NonFiksi====");
        for (BukuNonFiksi nf : koleksiNonFiksi){
            nf.infoNonFiksi();       
        }
    
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan p = new Perpustakaan();
        
        System.out.print("Masukkan jumlah buku Fiksi: ");
        int jumlahFiksi = input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < jumlahFiksi; i++) {
            System.out.println("Data Buku Fiksi ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = input.nextLine();
            System.out.print("Penulis: ");
            String penulis = input.nextLine();
            System.out.print("Genre: ");
            String genre = input.nextLine();
            System.out.println("");

            BukuFiksi bf = new BukuFiksi(judul, penulis, genre);
            p.tambahBukuFiksi(bf);
        }
        System.out.print("Masukkan jumlah buku Non Fiksi: ");
        int jumlahNonFiksi = input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < jumlahNonFiksi; i++) {
            System.out.println("Data Buku Non Fiksi ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = input.nextLine();
            System.out.print("Penulis: ");
            String penulis = input.nextLine();
            System.out.print("Topik: ");
            String topik = input.nextLine();
            System.out.println("");

            BukuNonFiksi nf = new BukuNonFiksi(judul, penulis, topik);
            p.tambahBukuNonFiksi(nf);
        }
        p.tampilkanKoleksi();
        
    }
}

