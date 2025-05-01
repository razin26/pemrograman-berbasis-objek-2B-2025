/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class BukuFiksi extends Buku {
    String genre;
    
    public BukuFiksi(String judul, String penulis, String genre){
        super(judul,penulis);
        this.genre = genre;
    }
    
    public void infoFiksi(){
        info();
        System.out.println("Genre\t: "+ genre);
        System.out.println("");
    
    }
}
