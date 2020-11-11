/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luaskelilingpersegi;

import java.util.Scanner;


/**
 *
 * @author LENOVO
 */
public class luaskeliling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);
        int sisi = 6;
        int Luas,Keliling;
        Luas = sisi*sisi;
        System.out.println("Luas persegi adalah " + Luas);
        Keliling = 4*sisi;
        System.out.println("Keliling persegi adalah " + Keliling);
    }
}
