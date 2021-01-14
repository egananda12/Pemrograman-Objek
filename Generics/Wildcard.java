/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Wildcard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         List<String> ls = new ArrayList();
        ls.add("String1");
        ls.add("String2");
        
        print(ls); 
 
        Collection<Planet> cp = new ArrayList();
        cp.add(new Planet("Mercury", 0.06));
        cp.add(new Planet("Venus", 0.82));
        
        print(cp); 
    }
    
    public static void print(Collection<?> collection) { 
        for (Object o : collection) {
            System.out.println(o);
        }
        // TODO code application logic here
    }
    
}
