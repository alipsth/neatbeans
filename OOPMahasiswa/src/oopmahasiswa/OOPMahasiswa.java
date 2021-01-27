/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmahasiswa;

/**
 *
 * @author User
 */
public class OOPMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mahasiswa ml = new Mahasiswa();
        
        ml.nama   = "Alip Manusia.";
        ml.alamat = "Jl.Kopo Cirangrang No 115";
        ml.umur   = "16 Tahun";
        
        ml.HitungUmur();
    }
    
}
