/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class ExampleSimpleDaateFormaat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String dateFormated = sdf.format(new Date());
        System.out.println("Format tanggal default : " + new Date());
        System.out.println("Format tanggal dengan format : " + dateFormated);
        // TODO code application logic here
    }
    
}
