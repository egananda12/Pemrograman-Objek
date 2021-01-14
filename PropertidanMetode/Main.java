/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // kita tambahkan 1 argumen dengan nilai int 2
        //nilai tersebut adalah nilai yang digunakan untuk inisiasi variabel umur
        
        Hewan kucing = new Hewan(2);
        kucing.makan();
        kucing.jalan();
        kucing.lari();
        //contoh penggunaan fungsi getUmur
        System.out.println("Umurnya adalah " + kucing.getUmur());
        
        //perhitungan indeks massa tubuh (BMI)
        //brat(kg) / (tinggi(m) * tinggi(m))
        double bmi = kucing.getBerat()/((kucing.getTinggi() *0.01)*(kucing.getTinggi()*0.01));
        System.out.println("Indeks massa tubuhnya adalah " + bmi);
    }
    
}
