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
public class InputFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hitungLuas(7, 6.5);
        // TODO code application logic here
    }
    public static void hitungLuas(double panjang, double lebar){
        double luas;
        luas = panjang * lebar;
        System.out.println(luas);
    }
}
