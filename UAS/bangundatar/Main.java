/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

import java.util.Scanner;


/**
 *
 * @author LENOVO
 */
public class Main {
    
    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Persegi opersegi;
Segitiga osegitiga;
Lingkaran olingkaran;
int s1 = 06;
int s2 = 06;
int r = 06;


opersegi = new Persegi();
osegitiga = new Segitiga();
olingkaran = new Lingkaran();


mainMenu();
 switch(pilihan){
            case '1':{
           
                System.out.println("Luas persegi : " + opersegi.luas(s1,s2));
                System.out.println("Keliling persegi : " + opersegi.keliling(s1,s2));
                break;
     }
            case '2':{
                
                System.out.println("Luas segitiga: " + osegitiga.luas(s1,s2));
                System.out.println("Keliling segitiga: " + osegitiga.keliling(s1,s2));
                break;
            }
            case '3':{
            
                System.out.println("Luas lingkaran: " + olingkaran.luas(r));
                System.out.println("Keliling lingkaran: " + olingkaran.keliling(r));
                break;
            }
            default :{
                System.out.println("tidak ada pilihan");
                break;
            }
    }
    }
private static void mainMenu(){
    System.out.println("===================");
    System.out.println("Hitung Luas dan Keliling :");
    System.out.println("1. Persegi");
    System.out.println("2. Segitiga");
    System.out.println("3. Lingkaran");
    System.out.println("Masukan Menu : ");
    pilihan = scanner.next().charAt(0);
    
}    
    }
