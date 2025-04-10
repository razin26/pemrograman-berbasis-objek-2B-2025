
package mahasiswa;

import java.util.Scanner;

public class Mahasiswa {

    String nama;
    String nim;
    String prodi;
    String alamat;
   
    public Mahasiswa(String n, String i, String p, String a){
        nama = n;
        nim = i;
        prodi = p;
        alamat = a;
    }
    
    public void dataMahasiswa(){
        System.out.println("Data mahasiswa:");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("Alamat : " + alamat);
             
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Data Mahasiswa 1");
        System.out.print("Masukkan Nama : ");
        String nama1 = input.nextLine();
        System.out.print("Masukkan NIM : ");
        String nim1 = input.nextLine();
        System.out.print("Masukkan Prodi : ");
        String prodi1 = input.nextLine();
        System.out.print("Masukkan Alamat : ");
        String alamat1 = input.nextLine();
        System.out.println("");
        
        Mahasiswa m1 = new Mahasiswa(nama1, nim1, prodi1, alamat1);
        m1.dataMahasiswa();
        
        System.out.println("");
        System.out.println("Data Mahasiswa 2");
        System.out.print("Masukkan Nama : ");
        String nama2 = input.nextLine();
        System.out.print("Masukkan NIM : ");
        String nim2 = input.nextLine();
        System.out.print("Masukkan Prodi : ");
        String prodi2 = input.nextLine();
        System.out.print("Masukkan Alamat : ");
        String alamat2 = input.nextLine();
        System.out.println("");
        
        Mahasiswa m2 = new Mahasiswa(nama2, nim2, prodi2, alamat2);
        m2.dataMahasiswa();
        
        System.out.println("");
        System.out.println("Data Mahasiswa 3");
        System.out.print("Masukkan Nama : ");
        String nama3 = input.nextLine();
        System.out.print("Masukkan NIM : ");
        String nim3 = input.nextLine();
        System.out.print("Masukkan Prodi : ");
        String prodi3 = input.nextLine();
        System.out.print("Masukkan Alamat : ");
        String alamat3 = input.nextLine();
        System.out.println("");
        
        Mahasiswa m3 = new Mahasiswa(nama3, nim3, prodi3, alamat3);
        m3.dataMahasiswa();
    }
}
