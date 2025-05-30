/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Perpustakaan {
    private Buku[] daftarBuku;
    private int jumlahBuku;
    
    public Perpustakaan(int k){
        daftarBuku = new Buku[k];
        jumlahBuku = 0;
    }
    
    public void tambahBuku(Buku b){
        if (jumlahBuku < daftarBuku.length){
            daftarBuku[jumlahBuku] = b;
            jumlahBuku++;
        } else{
            System.out.println("Perpustakaan Penuh");
        }
    }
    
    public void infoBuku(){
        for (int i=0; i<jumlahBuku; i++){
            Buku b = daftarBuku[i];
            System.out.println("Judul: " + b.getJudul());
            System.out.println("Penulis: " + b.getPenulis());
            System.out.println("Jumlah Hal: "+ b.getJumlahHal());
            System.out.println("");
        }
    }
}
