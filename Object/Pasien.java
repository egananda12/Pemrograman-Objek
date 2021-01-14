/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obyek;

/**
 *
 * @author LENOVO
 */
public class Pasien {
    String nama;
    int tinggipasien;
    int beratpasien;
    
    public Pasien(String namaPasien){
        nama = namaPasien;
     
    }
    public void tinggiPasien(int tinggiPasien){
        tinggipasien = tinggiPasien;
        
    }
    public void beratPasien(int beratPasien){
        beratpasien = beratPasien;
        
    }
    public void cetakPasien(){
        System.out.println("Nama Pasien " + nama);
        System.out.println("Tinggi Pasien " + tinggipasien + "cm");
        System.out.println("Berat Pasien " + beratpasien + "kg");
    }
}
