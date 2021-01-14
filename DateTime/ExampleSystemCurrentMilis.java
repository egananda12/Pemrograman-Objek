/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetime;

/**
 *
 * @author LENOVO
 */
public class ExampleSystemCurrentMilis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         long timeNow = System.currentTimeMillis();
        System.out.println("Waktu sekarang adalah " + timeNow + " milisecond");
        // TODO code application logic here
    }
    
}
