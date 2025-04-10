package hewan;
class Kelinci {
    String nama;
    int umur;
   
    Kelinci(String n, int u){
        nama = n;
        umur = u;
    }
    void kelinciInfo(){
        System.out.println("Nama: " + nama + " Umur: " + umur);
    }
    void Melompat(){
        System.out.println(nama + " melompat-lompat!");
    }
}
class Ikan {
    String nama;
    String jenis;
    
    Ikan(String n, String j){
        nama = n;
        jenis = j;
    }
    
    void ikanInfo(){
        System.out.println("Nama: " + nama + " Jenis: " + jenis);
    }
    void Berenang(){
        System.out.println(nama + " berenang cepat!");
    }
}
class Kurakura {
    String nama;
    double berat;
    
    Kurakura(String n, double b){
        nama = n;
        berat = b;
    }
    void kuraInfo(){
        System.out.println("Nama: " + nama + " Berat: " + berat + " kg");
    }
    void Berjalan(){
        System.out.println(nama + " berjalan pelan-pelan..");
    }
}

public class Main { 
        public static void main(String[] args) {
        for (int i=1; i<=3; i++){
            Kelinci daftarKelinci = new Kelinci("Kelinci"+i, i);
            daftarKelinci.kelinciInfo();
            daftarKelinci.Melompat();
        }
            System.out.println("");
        for (int i=1; i<=3; i++){
            Ikan daftarIkan = new Ikan("Ikan"+i, "jenis"+i);
            daftarIkan.ikanInfo();
            daftarIkan.Berenang();
        }
            System.out.println("");
        for (int i=1; i<=3; i++){
            double berat = 1.5 + i;
            Kurakura daftarKura = new Kurakura("Kura-kura"+i,berat);
            daftarKura.kuraInfo();
            daftarKura.Berjalan();
        }
            
    }
}
