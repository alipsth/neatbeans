/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilkolot;

/**
 *
 * @author User
 */
public class MobilKolot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil km = new Mobil();
        
        km.Warna         ="Hejo tai kuda";
        km.Merk          ="Honda";
        km.PlatNomer     ="B4 T4G0 RR";
        km.TahunProduksi ="1998";
        
        km.ParkirMobil();
        System.out.println(" ");
        km.Bergerak();
        System.out.println(" ");
        km.Mengerem();
        System.out.println(" ");
        km.Akselerasi();
        System.out.println(" ");
    }
    
}
