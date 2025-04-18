/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikummodul2;

/**
 *
 * @author ASUS
 */
public class MainMatkul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mataKuliah mk1 = new mataKuliah("IF302","Algoritma",1);
        mk1.tampilkanInfo();
        
        mataKuliah mk2 = new mataKuliah("SI202","PBD",3);
        mk2.tampilkanInfo();
        
        mataKuliah mk3 = new mataKuliah("IF112","PBO",4);
        mk3.tampilkanInfo();
        
        mataKuliah mk4 = new mataKuliah("SI282","DMJ",3);
        mk4.tampilkanInfo();
        
        mataKuliah mk5 = new mataKuliah("IF502","Pengantar TI",2);
        mk5.tampilkanInfo();
        
        mataKuliah mk6 = new mataKuliah("SI223","Bhs Inggris",2);
        mk6.tampilkanInfo();
        
        mataKuliah mk7 = new mataKuliah("IF600","PPKN",3);
        mk7.tampilkanInfo();
        
        mataKuliah mk8 = new mataKuliah("SI332","Basis Data",2);
        mk8.tampilkanInfo();
    }  
}
