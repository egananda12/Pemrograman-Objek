/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beasiswa;

/**
 *
 * @author LENOVO
 */
public class penerimabeasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama = "Ega Nanda Fadilatul Fitriyah",
               NIM = "201969040006",
               jurusan = "Teknik Informatika",
               smstr = "3",
               kls = "A";
        
        //karena nilai di semester 3 belum keluar jadi saya memasukkan transkip nilai semester 1 dan 2 yang ada di sister saya
       double MK = 3*4; //jumlah (SKS x Point)
       double STI = 3*4; //jumlah (SKS x Point)
       double MKL = 3*4; //jumlah (SKS x Point)
       double SO = 3*4;//jumlah (SKS x Point)
       double DTD = 3*4;//jumlah (SKS x Point)
       double PA = 3*3;//jumlah (SKS x Point)
       double Aswaja = 2 *3;//jumlah (SKS x Point)
       double ASD = 5*3;//jumlah (SKS x Point)
       double BI = 3*3;//jumlah (SKS x Point)
       double PM = 2*3;//jumlah (SKS x Point)
       double DP = 5*3;//jumlah (SKS x Point)
       double AOK = 3*3;//jumlah (SKS x Point)
       double SKS = 38; //jumlah SKS
       double jumlahkumulatif, ipk;
       jumlahkumulatif = MK+STI+MKL+SO+DTD+PA+Aswaja+ASD+BI+PM+DP+AOK;
       ipk = jumlahkumulatif/SKS;
        System.out.println("Nama                                          : " + nama );
        System.out.println("NIM                                           : " + NIM);
        System.out.println("Jurusan                                       : " + jurusan);
        System.out.println("Kelas                                         : " + smstr+kls);
        System.out.println("Nilai MK-Matematika Komputasi                 : " + MK);
        System.out.println("Nilai MK-Sistem dan Teknologi Informasi       : " + STI);
        System.out.println("Nilai MK-Matematika Komputasi Lanjutan        : " + MKL);
        System.out.println("Nilai MK-Sistem Operasi                       : " + SO);
        System.out.println("Nilai MK-Dasar Teknik Digital                 : " + DTD);
        System.out.println("Nilai MK-Pendidikan Agama                     : " + PA);
        System.out.println("Nilai MK-Aswaja                               : " + Aswaja);
        System.out.println("Nilai MK-Algoritma dan Struktur Data          : " + ASD);
        System.out.println("Nilai MK-Bahasa Inggris                       : " + BI);
        System.out.println("Nilai MK-Pendidikan Multikultural             : " + PM);
        System.out.println("Nilai MK-Dasar Pemrograman                    : " + DP);
        System.out.println("Nilai MK-Arsitektur dan Organisasi Komputer   : " + AOK);
        System.out.println("NIlai IPK                                     : " + ipk);
        
       if(ipk >= 3.25) {
            System.out.println("Selamat Anda Mendapat Beasiswa");
        }else if (ipk < 3.25){
            System.out.println("Maaf Anda Tidak Mendapat Beasiswa");
        }
     
        // TODO code application logic here
    }
    
}
