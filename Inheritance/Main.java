/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        System.out.println("Apakah hewan IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing -> " + (hewan instanceof Kucing));
        
        System.out.println("----------------------------");
        
        Kucing kucing = new Kucing();
        System.out.println("Apakah hewan IS-A Objek -> " + (kucing instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (kucing instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing -> " + (kucing instanceof Kucing));
        
        System.out.println("----------------------------");
        hewan.makan();
        kucing.makan();
        kucing.makan("daging ikan");
        
        System.out.println("----------------------------");
        
        Kucing meow = new Kucing("Ocicat", "tropis");
        Kucing puss = new Kucing("Ocicat", "subtropis");
        Kucing popo = new Kucing("Anggora", "subtropis");
        
        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());
        
        System.out.println("meow aquals puss ? " + meow.equals(puss));
        System.out.println("meow aquals popo ? " + meow.equals(popo));
        
        System.out.println("----------------------------");
        
        Object o = new Kucing();
        Hewan h = new Kucing();
        Kucing k = new Kucing();
        
        h.makan();
        k.makan();
        
        Object object = k;
        Hewan hewanK = k;
        
        hewanK.makan();
        Kucing kucingK = (Kucing) h;
        kucing.makan();
        
        Hewan harimau = new Hewan();
        Kucing anggora = (Kucing) harimau;
        
        
        

// TODO code application logic here
    }
    
}
