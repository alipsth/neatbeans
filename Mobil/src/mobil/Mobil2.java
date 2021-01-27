/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author User
 */
public class Mobil2 {
    String nama,warna;
    int platNo;
    
    
    public void jalankan(){
       System.out.println("Masukan gigi 1,tekan " 
               + " Kopling di buka perlahan-lahan dan gas");       
    }
    public void setWarna (String warna){
        this.warna = warna;
    }
    public String getWarna (){
        return this.warna;
    }
    
    
}
