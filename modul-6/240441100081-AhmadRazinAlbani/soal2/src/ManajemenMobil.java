/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenMobil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mobil> spek = new ArrayList<>();

        while (true) {
            System.out.println("\nInfo Mobil:");
            System.out.println("1. Mobil Sport");
            System.out.println("2. Mobil Sedan");
            System.out.println("3. Tampilkan Semua Info");
            System.out.println("4. Keluar");
            System.out.print("Silahkan dipilih: ");

            try {
                int pilih = input.nextInt();
                input.nextLine();

                switch (pilih) {
                    case 1:
                        Mobil mobilSport = new MobilSport();
                        spek.add(mobilSport);
                        mobilSport.nyalakan_mesin();
                        mobilSport.matikan_mesin();
                        break;
                    case 2:
                        Mobil mobilSedan = new MobilSedan();
                        spek.add(mobilSedan);
                        mobilSedan.nyalakan_mesin();
                        mobilSedan.matikan_mesin();
                        break;
                    case 3:
                        if (spek.isEmpty()) {
                            System.out.println("Belum ada data mobil.");
                        } else {
                            for (Mobil m : spek) {
                                m.nyalakan_mesin();
                                m.matikan_mesin();
                                System.out.println();
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Anda keluar.");
                        input.close();
                        return;
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            } catch (Exception e) {
                System.out.println("Input harus berupa angka! Silakan coba lagi.");
                input.nextLine();
            }
        }
    }
}

