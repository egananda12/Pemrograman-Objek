/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasar;

/**
 *
 * @author LENOVO
 */
public class game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Player petani=new Player();
        
        
        petani.name = "petani kode";
        petani.speed = 78;
        petani.healthPoin = 100;
        
        petani.run();
        if(petani.isDead()){
            System.out.println("Game Over!");
            
        }
    }
    
}
