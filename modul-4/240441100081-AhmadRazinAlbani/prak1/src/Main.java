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
        Bank b = new Bank(8);
        
        b.tambahRek(new RekeningBank("321", "Tio", 100000));
        b.tambahRek(new RekeningBank("123", "Vian", 50000));
        
        b.setor("321",200000);
        b.tarik("123", 60000);
        
        System.out.println("===Semua Data Rekening===");
        b.infoRekening();
       
    }
    
}
