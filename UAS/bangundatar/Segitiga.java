/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;



/**
 *
 * @author LENOVO
 */
public class Segitiga implements bangundatar {
   Segitiga(){
    
}
   int s1 = 06;
   int s2 = 06;
   
@Override
public double luas (int s1, int s2){
    return (0.5*s1*s2);
}
@Override
public double keliling(int s1, int s2){
return (s1+s2+Math.sqrt((s1*s1)+(s2*s2)));
}

}