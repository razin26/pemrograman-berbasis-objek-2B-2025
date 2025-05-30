/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

abstract class Manusia {
    public abstract void berbicara();
    public abstract void bekerja();
    public abstract void makan();   
} 

class Joko extends Manusia{
    @Override
    public void berbicara(){
        System.out.println("bicara tentang bisnis");
    } 
    @Override
    public void bekerja(){
        System.out.println("Kerja kantoran");
    } 
    @Override
    public void makan(){
        System.out.println("makan sate ayam");
    } 
    
}  
class Beni extends Manusia{
    @Override
    public void berbicara(){
        System.out.println("bicara tentang Coding");
    } 
    @Override
    public void bekerja(){
        System.out.println("kerja web developer");
    } 
    @Override
    public void makan(){
        System.out.println("makan nasi pecel");
    } 
    
}  

class Fani extends Manusia{
    @Override
    public void berbicara(){
        System.out.println("bicara tentang Psikologi");
    } 
    @Override
    public void bekerja(){
        System.out.println("kerja psikiater");
    } 
    @Override
    public void makan(){
        System.out.println("makan sushi");
    } 
    
}  

class Jani extends Manusia{
    @Override
    public void berbicara(){
        System.out.println("bicara tentang Hukum");
    } 
    @Override
    public void bekerja(){
        System.out.println("kerja pengacara");
    } 
    @Override
    public void makan(){
        System.out.println("makan pizza");
    } 
}  

public class Main{
    public static void main(String[] args) {
        System.out.println("===Joko===");
            Manusia joko = new Joko();
            joko.berbicara();
            joko.bekerja();
            joko.makan();
        System.out.println("");
        
        System.out.println("===Beni===");
            Manusia beni = new Beni();
            beni.berbicara();
            beni.bekerja();
            beni.makan();
        System.out.println("");
        
        System.out.println("===Fani===");
            Manusia fani = new Fani();
            fani.berbicara();
            fani.bekerja();
            fani.makan();
        System.out.println("");
        
        System.out.println("===Jani===");
            Manusia jani= new Jani();
            jani.berbicara();
            jani.bekerja();
            jani.makan();
        System.out.println("");
    } 
}
