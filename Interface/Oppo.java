/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author LENOVO
 */
public class Oppo implements Phone {
    private int volume;
    private boolean isPowerOn;
    
    public Oppo(){
        this.volume = 50;
    } 
    @Override
    public void powerOn(){
        isPowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di OPPO");
        System.out.println("Android version 9.0");
    }
    @Override
    public void powerOff(){
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }
    @Override
    public void volumeUp(){
        if(isPowerOn){
            if(this.volume == MAX_VOLUME){
                System.out.println("volumene wes full!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else{
                this.volume += 10;
                System.out.println("Volume sekarang : " + this.getVolume());
            }
        } else {
            System.out.println("HP mu uripno sek!!");
            
        }
    }
    @Override
    public void volumeDown(){
      if(isPowerOn){
          if(this.volume == MIN_VOLUME){
              System.out.println("gedekno volumene!ora krungu aku!!!");
          }else{
              this.volume -= 10;
              System.out.println("Volume sekarang : " + this.getVolume());
          }
      }  else {
          System.out.println("HP mu uripno sek!!");
      }
    }
    public int getVolume(){
        return this.volume;
    }
}
