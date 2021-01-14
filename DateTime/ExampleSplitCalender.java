/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetime;

import java.util.Calendar;

/**
 *
 * @author LENOVO
 */
public class ExampleSplitCalender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());
       
        System.out.println("Tanggal : " + calendar.get(Calendar.DATE));
        System.out.println("Bulan   : " + calendar.get(Calendar.MONTH));
        System.out.println("Tahun   : " + calendar.get(Calendar.YEAR));
        // TODO code application logic here
    }
    
}
