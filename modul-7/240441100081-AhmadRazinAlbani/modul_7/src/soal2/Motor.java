/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author ASUS
 */
public class Motor implements Booking, Insurance {
    private final double biayaPerJam = 15000;

    @Override
    public void pesan(String name, int age, int duration) {
        double total = menghitungBiaya(duration) + biayaAsuransi();
        System.out.println("\n====Booking====");
        System.out.println(name + " berhasil booking Motor selama " + duration + " jam.");
        System.out.println("Biaya perJam: Rp" + biayaPerJam);
        System.out.println("Biaya sewa: Rp" + (biayaPerJam * duration));
        System.out.println("Biaya asuransi: Rp" + biayaAsuransi());
        System.out.println("Total bayar: Rp" + total);
    }

    @Override
    public double menghitungBiaya(int duration) {
        return biayaPerJam * duration;
    }

    @Override
    public double biayaAsuransi() {
        return 5000;
    }
}

