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
public class KelasA {
    
    private int memberA = 5;
    
    char memberB = 'A';
    double memberC = 1.5;
    private int functionA() {
        return memberA;
    }
    
    int functionB() {
        int hasil = functionA() + memberA;
        return hasil;
    }
    
}
