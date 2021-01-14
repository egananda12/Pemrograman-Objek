/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VokalKonsonan;

import com.sun.istack.internal.NotNull;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class VokalKonsCount {
    
     private static int num_vokal(@NotNull String word){
        int i;
        int jumlah_vokal = 0;

        for(i=0; i<word.length(); i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'o'){
                jumlah_vokal ++;
            }
        }

        return jumlah_vokal;

    }

    private static int num_konsonan(@NotNull String word){
        int i;
        int jumlah_konsonan = 0;

        for(i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(word.charAt(i) != 'a' && word.charAt(i) != 'i' && word.charAt(i) != 'u' && word.charAt(i) != 'e' && word.charAt(i) != 'o' && word.charAt(i) != ' '){
                jumlah_konsonan ++;

            }
        }

        return jumlah_konsonan;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String word = "";
        int vokal = 0;
        int konsonan = 0;

        /*Program*/

        //masukan kalimat
        System.out.print("Masukan kalimat : ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();

        //memanggil prosedur yang mengembalikan nilai int
        vokal = num_vokal(word);
        konsonan = num_konsonan(word);

        System.out.println("Jumlah huruf vokal : " +vokal);
        System.out.println("Jumlah huruf konsonan : " +konsonan);

    }

        // TODO code application logic here
    }
    

