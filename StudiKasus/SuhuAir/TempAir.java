/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuhuAir;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class TempAir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int T;

        System.out.println("Contoh IF tiga kasus");
        System.out.print("Temperatur (der. C) = ");

        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt(); 

        if (T < 0){
            System.out.println("Wujud air beku " + T);
        }else if ((0 <= T) && (T <= 100))
        {
            System.out.println ("Wujud air cair " + T);
        }
        else if (T > 100)
        {
            System.out.println("Wujud air uap/gas " + T);
        }
        // TODO code application logic here
    }
    
}
