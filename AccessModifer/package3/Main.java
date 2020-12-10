/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesmodifer.package3;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        System.out.println("Nilainya adalah " + Perhitungan.nilai);
        
        for (int x = 0; x < 5; x++) {
            new Perhitungan();
        }
        System.out.println("Sampai " + Perhitungan.nilai);
        
        System.out.println("getNilai memiliki nilai " + Perhitungan.getNilai());
        // TODO code application logic here
    }
    
}
