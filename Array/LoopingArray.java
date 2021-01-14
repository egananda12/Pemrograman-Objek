/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author LENOVO
 */
public class LoopingArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int[] arrInt = new int[1000000];
 
        for (int x = 0; x < arrInt.length; x++) {
            arrInt[x] = x + 1;
            System.out.println(arrInt[x]);
        // TODO code application logic here
    }
    
    }
}
