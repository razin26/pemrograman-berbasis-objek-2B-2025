/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String name = input.nextLine();
        System.out.print("Usia: ");
        int age = input.nextInt();

        System.out.println("Pilih kendaraan:");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("3. Sepeda");
        System.out.print("Pilihan: ");
        int pilih = input.nextInt();
        
        if (pilih == 1 && age < 20) {
            System.out.println("Maaf, usia minimal untuk menyewa Mobil adalah 20 tahun.");
            return;
        } else if (pilih == 2 && age < 18) {
            System.out.println("Maaf, usia minimal untuk menyewa Motor adalah 18 tahun.");
            return;
        } else if (pilih == 3 && age < 14) {
            System.out.println("Maaf, usia minimal untuk menyewa Sepeda adalah 12 tahun.");
            return;
        }

        System.out.print("Durasi sewa (jam): ");
        int duration = input.nextInt();

        Booking kendaraan;

        switch (pilih) {
            case 1:
                kendaraan = new Mobil();
                break;
            case 2:
                kendaraan = new Motor();
                break;
            case 3:
                kendaraan = new Sepeda();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        kendaraan.pesan(name, age, duration);
    }
}
