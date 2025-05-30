/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */


abstract class Mobil {
    public abstract void nyalakan_mesin();
    public abstract void matikan_mesin();
}

class MobilSport extends Mobil {
    @Override
    public void nyalakan_mesin(){
        System.out.println("===Mobil Sport===");
        System.out.println("Mobil sport dinyalakan dengan suara menggelegar!");
    }
    
    @Override
    public void matikan_mesin(){
        System.out.println("Mobil sport dimatikan secara halus.");
        System.out.println("");
    }   
}

class MobilSedan extends Mobil {
    @Override
    public void nyalakan_mesin(){
        System.out.println("===Mobil Sedan===");
        System.out.println("Mobil sedan dinyalakan secara halus.");
    }
    
    @Override
    public void matikan_mesin(){
        System.out.println("Mobil sedan dimatikan dengan aman.");
        System.out.println("");
    }   
}

public class Main{
    public static void main(String[] args){
        Mobil msp = new MobilSport();
        msp.nyalakan_mesin();
        msp.matikan_mesin();
        
        Mobil msd = new MobilSedan();
        msd.nyalakan_mesin();
        msd.matikan_mesin();
        
    }   
}

   

