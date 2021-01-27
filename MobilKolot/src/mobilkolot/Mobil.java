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
public class Mobil {
    public String Merk,Warna,PlatNomer,TahunProduksi;
    
    void ParkirMobil(){
        System.out.println("Mobil " + Warna + " dengan merk mobil " + Merk + " akan parkir di menara efel");
        System.out.println("dan bergerak dengan plat " + PlatNomer + " dan thn produksi " + TahunProduksi);
    }
    void Bergerak(){
        System.out.println("Mobil " + Warna + " dengan merk mobil " + Merk + " Bergerak menuju rumah sakit ");
        System.out.println("Imanonel dengan plat " + PlatNomer + " dan thn produksi " + TahunProduksi);   
    }
    void Mengerem(){
        System.out.println("Mobil " + Warna + " dengan merk mobil " + Merk + " akan pergi kerja ");
        System.out.println("arah ke cibiru dan mengerem di kemcetan cibiru dengan plat " + PlatNomer + " dan thn produksi " + TahunProduksi);
    }
    void Akselerasi(){
        System.out.println("mobil dengan warna " + Warna + " dan merk mobil  " + Merk + " melaju dengan ");
        System.out.println("120km/jam dengan plat " + PlatNomer + " dan thn produksi " + TahunProduksi);
    }
}
