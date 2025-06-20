/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manusia[] pribadi = new Manusia[4];
        int index = 0;

        while (true) {
            System.out.println("\nInfo Pribadi");
            System.out.println("1. Joko");
            System.out.println("2. Beni");
            System.out.println("3. Fani");
            System.out.println("4. Jani");
            System.out.println("5. Tampilkan Semua Info");
            System.out.println("6. Keluar");
            System.out.print("Silahkan dipilih: ");

            try {
                int pilih = input.nextInt();
                input.nextLine();

                switch (pilih) {
                    case 1:
                        if (index < pribadi.length) {
                            pribadi[index++] = new Joko();
                            pribadi[index - 1].berbicara();
                            pribadi[index - 1].bekerja();
                            pribadi[index - 1].makan();
                        } else {
                            System.out.println("Kapasitas penuh!");
                        }
                        break;
                    case 2:
                        if (index < pribadi.length) {
                            pribadi[index++] = new Beni();
                            pribadi[index - 1].berbicara();
                            pribadi[index - 1].bekerja();
                            pribadi[index - 1].makan();
                        } else {
                            System.out.println("Kapasitas penuh!");
                        }
                        break;
                    case 3:
                        if (index < pribadi.length) {
                            pribadi[index++] = new Fani();
                            pribadi[index - 1].berbicara();
                            pribadi[index - 1].bekerja();
                            pribadi[index - 1].makan();
                        } else {
                            System.out.println("Kapasitas penuh!");
                        }
                        break;
                    case 4:
                        if (index < pribadi.length) {
                            pribadi[index++] = new Jani();
                            pribadi[index - 1].berbicara();
                            pribadi[index - 1].bekerja();
                            pribadi[index - 1].makan();
                        } else {
                            System.out.println("Kapasitas penuh!");
                        }
                        break;
                    case 5:
                        System.out.println("INFO SEMUA PRIBADI:");
                        for (int i = 0; i < index; i++) {
                            pribadi[i].berbicara();
                            pribadi[i].bekerja();
                            pribadi[i].makan();
                            System.out.println("");
                        }
                        break;
                    case 6:
                        System.out.println("Anda keluar.");
                        input.close();
                        return;
                    default:
                        System.out.println("Pilihan unvalid.");
                }

            } catch (Exception e) {
                System.out.println("Input harus berupa angka! Silakan coba lagi.");
                input.nextLine();
            }
        }
    }
}

