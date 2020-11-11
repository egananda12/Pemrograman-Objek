/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.operator;

/**
 *
 * @author LENOVO
 */
public class OperatorConditional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int value = 4;
        int anotherValue = 5;
        
        System.out.println("Conditional AND");
        boolean result = value == 3 && anotherValue == 5;
        boolean anotherResult = value != 3 && anotherValue == 5;
        
        System.out.println("Hasil Operator AND pada syarat value == 3 dan anotherValue == 5 adalah " + result);
        System.out.println("Hasil Operator AND pada syarat value != 3 dan anotherValue == 5 adalah " + anotherResult);
        System.out.println();
        System.out.println("Conditional OR");
        
        result = value == 3 || anotherValue == 5;
        anotherResult = value != 3 || anotherValue == 5;
        
        System.out.println("Hasil Operator OR pada syarat value == 3 dan anotherValue == 5 adalah " + result);
        System.out.println("Hasil Operator OR pada syarat value != 3 dan anotherValue == 5 adalah " + anotherResult);
        System.out.println();
        // TODO code application logic here
    }
    
}
