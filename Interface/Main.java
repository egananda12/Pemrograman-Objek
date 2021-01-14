/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Phone redmiNote8 = new Oppo();
       PhoneUser pingda = new PhoneUser(redmiNote8);
       pingda.turnOnThePhone();
       Scanner input = new Scanner(System.in);
       String aksi;
       
       while (true) {
           System.out.println("== APLIKASI INTERFACE ==");
           System.out.println("[1] Nyalakan HP");
           System.out.println("[2] Matikan HP");
           System.out.println("[3] Pebesar Volume");
           System.out.println("[4] Kecilkan Volume");
           System.out.println("[0] Keluar");
           System.out.println("------------------------");
           System.out.println("Pilih aksi>");
           aksi=input.nextLine();
           
           if(aksi.equalsIgnoreCase("1")){
               pingda.turnOnThePhone();
           }else if (aksi.equalsIgnoreCase("2")){
               pingda.turnOffThePhone();
           }else if(aksi.equalsIgnoreCase("3")){
               pingda.makePhoneLouder();
           }else if(aksi.equalsIgnoreCase("4")){
               pingda.makeSilent();
           }else if (aksi.equalsIgnoreCase("0")){
               System.exit(0);
           }else {
               System.out.println("Kamu memilih aksi yang salah! angle wes angel!!!");
           }
       }
       
// TODO code application logic here
    }
    
}
