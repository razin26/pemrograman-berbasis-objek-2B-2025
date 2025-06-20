/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class CreditCard implements Payment {
    private double adminFee = 0.03; 

    @Override
    public double calculateTotal(double amount) {
        return amount + (amount * adminFee);
    }

    @Override
    public void pay(double amount) {
        double total = calculateTotal(amount);
        System.out.println("Metode: Kartu Kredit");
        System.out.println("Total setelah biaya admin: Rp" + total);
    }
}
