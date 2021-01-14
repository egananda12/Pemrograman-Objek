/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;


/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            System.out.println("Akses elemen ke 5 :" + a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
        } finally {
            a[4] = 10;
            System.out.println("Nilai elemen terakhir: " + a[4]);
        }
        // TODO code application logic here
    }
    
}
