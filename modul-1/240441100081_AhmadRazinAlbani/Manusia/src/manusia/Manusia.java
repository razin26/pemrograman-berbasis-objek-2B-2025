
package manusia;
public class Manusia {
    String nama;
    int umur;
    String alamat;
    
    public Manusia(String n, int u, String a){
        nama = n;
        umur = u;
        alamat = a;
    }
    
    public void berjalan(){
        System.out.println(nama + " berjalan menuju sekolah");
        System.out.println();
    }
    public void berlari(){
        System.out.println(nama + " berlari memutari lapangan olahraga");
        System.out.println();
    }
    public void tampilkanInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Alamat : " + alamat);
    }
      
    public static void main(String[] args) {
        Manusia org1 = new Manusia("Sultan", 17, "Jl.Cokroningrat");
        org1.tampilkanInfo();
        org1.berjalan();
        
        Manusia org2 = new Manusia("Roy", 20, "Jl.Garuda");
        org2.tampilkanInfo();
        org2.berlari();
        
        Manusia org3 = new Manusia("Vian", 26, "Jl.Surakarta");
        org3.tampilkanInfo();
        org3.berlari();
        
        Manusia org4 = new Manusia("Sri", 15, "Jl.Wijaya");
        org4.tampilkanInfo();
        org4.berjalan();
        
        Manusia org5 = new Manusia("Putra", 30, "Jl.Broto");
        org5.tampilkanInfo();
        org5.berlari();
        
    }
    
}
