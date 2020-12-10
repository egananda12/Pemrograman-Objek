/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesmodifer;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KelasA kelasA = new KelasA();
        System.out.println(kelasA.functionB());
        
        System.out.println(kelasA.memberB);
        System.out.println(kelasA.memberC);
        // TODO code application logic here
    }
    
}
