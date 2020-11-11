/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.percabangan;

/**
 *
 * @author LENOVO
 */
public class IfThenElseIfThenElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilaiUjian = 85;
        char indeksPrestasi;
        
        if(nilaiUjian >=90) {
            indeksPrestasi = 'A';
        }else if (nilaiUjian >=80){
            indeksPrestasi = 'B';
        }else if (nilaiUjian >=70){
            indeksPrestasi = 'C';
        }else if (nilaiUjian >=60){
            indeksPrestasi = 'D';
        }else if (nilaiUjian >=50){
            indeksPrestasi = 'E';
        }else {
            indeksPrestasi = 'F';
        }    
        System.out.println("Nilai ujian akhir anda adalah " + indeksPrestasi);
           
}
}