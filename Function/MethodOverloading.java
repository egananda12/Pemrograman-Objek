/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.function;

/**
 *
 * @author LENOVO
 */
public class MethodOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double p = 7;
      double l = 6.5;
      double hasil = hitungLuas(p, l);
        System.out.println("Hasilnya adalah = " + hasil);
        int pn = 7;
        int lb = 6;
        int hsl = hitungLuas(pn, lb);
        System.out.println("Hasilnya adalah = " + hsl);
        
    }
    public static double hitungLuas(double panjang, double lebar){
        double luas = panjang * lebar;
        return luas;
        
    }
    public static int hitungLuas(int panjang, int lebar){
        int luas = panjang * lebar;
        return luas;
    }
}
