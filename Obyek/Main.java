/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obyek;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pasien Egananda = new Pasien("Egananda");
        Pasien Kunyuk = new Pasien ("Kunyuk");
        
        Egananda.tinggiPasien(157);
        Egananda.beratPasien(56);
        Egananda.cetakPasien();
        
        Kunyuk.tinggiPasien(187);
        Kunyuk.beratPasien(65);
        Kunyuk.cetakPasien();
        // TODO code application logic here
    }
    
}
