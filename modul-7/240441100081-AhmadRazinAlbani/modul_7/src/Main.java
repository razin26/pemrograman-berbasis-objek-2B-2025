/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Payment paymentMethod = null;

        System.out.print("Masukkan total belanja: Rp");
        double amount = input.nextDouble();

        System.out.println("Pilih metode pembayaran:");
        System.out.println("1. Tunai");
        System.out.println("2. Kartu Kredit");
        System.out.println("3. E-Wallet");
        System.out.print("Pilihan: ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                paymentMethod = new Cash();
                break;
            case 2:
                paymentMethod = new CreditCard();
                break;
            case 3:
                paymentMethod = new EWallet();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(0);
        }

        paymentMethod.pay(amount);
    }
}
