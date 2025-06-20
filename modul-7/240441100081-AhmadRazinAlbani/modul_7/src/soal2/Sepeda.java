/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author ASUS
 */
public class Sepeda implements Booking {
    private double biayaPerJam = 5000;

    @Override
    public void pesan(String name, int age, int duration) {
        double total = menghitungBiaya(duration);
        System.out.println("\n====Booking====");
        System.out.println(name + " berhasil booking Sepeda selama " + duration + " jam.");
        System.out.println("Biaya perJam: Rp" + biayaPerJam);
        System.out.println("Total bayar: Rp" + total);
    }

    @Override
    public double menghitungBiaya(int duration) {
        return biayaPerJam * duration;
    }
}
