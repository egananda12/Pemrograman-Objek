/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungIPK;

/**
 *
 * @author LENOVO
 */
public class hitungIPK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nama = "Ega Nanda Fadilatul Fitriyah",
               NIM = "201969040006",
               jurusan = "Teknik Informatika",
               smstr = "3",
               kls = "A";
       int OOP = 70;
       int BS = 85;
       int JK = 80;
       int ip, totalnilaimk;
       totalnilaimk = OOP+BS+JK;
       ip = totalnilaimk/3;
       
        System.out.println("Nama                       : " + nama );
        System.out.println("NIM                        : " + NIM);
        System.out.println("Jurusan                    : " + jurusan);
        System.out.println("Kelas                      : " + smstr+kls);
        System.out.println("Nilai MK-OOP               : " + OOP);
        System.out.println("Nilai MK-Basis Data        : " + BS);
        System.out.println("Nilai MK-Jaringan Komputer : " + JK);
        System.out.println("Nilai Total Mata Kuliah    : " + totalnilaimk);
        System.out.println("Nilai IP                   : " + ip);
        
      char Predikat;
       if(ip >=81) {
            Predikat = 'A';
        }else if (ip >=61){
            Predikat = 'B';
        }else if (ip <=60){
            Predikat = 'C';
        }else 
            Predikat = 'D';
        System.out.println("Selamat Anda Mendapatkan Predikat " + Predikat);
        
       
        
        // TODO code application logic here
    }
    
}
