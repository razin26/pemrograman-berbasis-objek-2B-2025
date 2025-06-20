/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class EWallet implements Payment {
    private double cashback = 6000;

    @Override
    public double calculateTotal(double amount) {
        return amount;
    }

    @Override
    public void pay(double amount) {
        double total = calculateTotal(amount);
        System.out.println("Metode: E-Wallet");
        System.out.println("Total yang dibayar: Rp" + total);
        System.out.println("Selamat! Anda akan menerima cashback sebesar Rp" + cashback);
    }
}

