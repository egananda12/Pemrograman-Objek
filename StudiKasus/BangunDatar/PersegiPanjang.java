/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunDatar;

/**
 *
 * @author LENOVO
 */
public class PersegiPanjang implements bangundatar{
     PersegiPanjang() {
    }
    @Override
    public double luas(int s1, int s2) {
        return (s1 * s2);
    }
    @Override
    public double keliling(int s1, int s2) {
        return (2 * (s1 + s2));
    }
}
