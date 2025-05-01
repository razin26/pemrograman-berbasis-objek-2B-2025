/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class BukuNonFiksi extends Buku {
    String topik;
    
    public BukuNonFiksi(String judul, String penulis, String topik){
        super(judul,penulis);
        this.topik = topik;
    }
    public void infoNonFiksi(){
        info();
        System.out.println("Topik\t: "+ topik);
        System.out.println("");
    }
    
}
