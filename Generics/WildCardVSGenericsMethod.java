/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author LENOVO
 */
public class WildCardVSGenericsMethod {
    
     static void print(Collection<?> col) {
        for (Object o : col) {
            System.out.println(o);
        }
    }
     
      static <T> Collection arrayToCollection(T[] a) {
        Collection<T> c = new ArrayList();
        for (T o : a) {
            c.add(o);
        }
        return c;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] sa = { "Happy", "Coding" };
        Collection r = arrayToCollection(sa);
        print(r);
        // TODO code application logic here
    }
    
}
