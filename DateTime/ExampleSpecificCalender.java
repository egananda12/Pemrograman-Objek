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
public class ExampleSpecificCalender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());
       
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 hari yang lalu: " + calendar.getTime());
       
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 bulan kemudian: " + calendar.getTime());
        
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 tahun kemudian: " + calendar.getTime());
    }
        // TODO code application logic here
    }
    

