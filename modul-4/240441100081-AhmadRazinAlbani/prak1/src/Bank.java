/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Bank {
    private RekeningBank[] rekening;
    private int jumlahRekening;
    
    public Bank(int k){
        rekening = new RekeningBank[k];
        jumlahRekening = 0;
    }
    
    
    public void tambahRek(RekeningBank r){
        if(jumlahRekening < rekening.length){
            rekening[jumlahRekening] = r;
            jumlahRekening++;
        } else{
            System.out.println("Kapasitas Penuh");
        }
    }
    
    public RekeningBank cariRek(String Rek){
        for(int i=0; i < jumlahRekening; i++){
            if(rekening[i].getNoRek().equals(Rek)){
                return rekening[i];
            }
        }
        return null;
    }
    
    public void setor(String Rek, double jumlah){
        RekeningBank r = cariRek(Rek);
        if(r != null){
            r.setor(jumlah);
        }else{
            System.out.println("No.Rek tidak ada");
        }        
    }
    
    public void tarik(String Rek, double jumlah){
        RekeningBank r = cariRek(Rek);
        if(r != null){
            r.tarik(jumlah);
        }else{
            System.out.println("No.Rek tidak ada");
        }
    }
    
  
    public void infoRekening(){
        for (int i=0; i < jumlahRekening; i++){
            rekening[i].tampilkanInfo();
        }
    }
}
