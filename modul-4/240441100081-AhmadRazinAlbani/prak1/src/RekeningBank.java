/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class RekeningBank {
    private String noRek;
    private String nama;
    private double saldo;
    
    public RekeningBank(String noRek, String nama, double saldo){
        this.noRek = noRek;
        this.nama = nama;
        this.saldo = saldo; 
    }
    
    public String getNoRek(){
        return noRek;
    }
    public String getNama(){
        return nama;
    }
    public double getSaldo(){
        return saldo;
    }
    
    public void setor(double jumlah){
        if(jumlah > 0){
            saldo += jumlah;
        }
    }
    public void tarik(double jumlah){
        if(jumlah > 0 && saldo>=jumlah){
            saldo -= jumlah;
        }
    }
    
    public void tampilkanInfo(){
        System.out.println("No. Rekening: "+noRek);
        System.out.println("Nama Pemilik: "+nama);
        System.out.println("Saldo: "+saldo);
        System.out.println("");
        
    }
}
