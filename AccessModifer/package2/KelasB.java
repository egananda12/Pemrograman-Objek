/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesmodifer.package2;

import accesmodifer.package1.KelasA;

/**
 *
 * @author LENOVO
 */
public class KelasB extends KelasA {
    
    protected void methodC() {
        super.methodC();
        
        System.out.println("Contoh pemanggilan protected dari package luar");
        
    }
    
}
