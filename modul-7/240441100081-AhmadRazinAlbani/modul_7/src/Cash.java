/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Cash implements Payment {
    private double discountRate = 0.05; 

    @Override
    public double calculateTotal(double amount) {
        return amount - (amount * discountRate);
    }

    @Override
    public void pay(double amount) {
        double total = calculateTotal(amount);
        System.out.println("Metode: Tunai");
        System.out.println("Total setelah diskon: Rp" + total);
    }
}

