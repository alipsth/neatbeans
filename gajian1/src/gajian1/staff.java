
package gajian1;

public class staff extends pegawai{
    public int jumlah_kehadiran;
    public int tarif_harian = 50000;
    
    staff(){
        
    }
    staff(String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    public int setKehadiran(int kehadiran){
        this.jumlah_kehadiran = kehadiran;
        return kehadiran;
    }
    @Override
    public int getGaji(int gaji){
        this.jumlah_kehadiran = jumlah_kehadiran * tarif_harian + 1500000;
        return super.getGaji(jumlah_kehadiran);
    }
    @Override
    public String toString(){
      String s = "*** STAFF *** \n"
                + "Nip    : "+nip+"\n"
                + "Nama   : "+nama+"\n"
                + "Alamat : "+alamat+"\n"
                + "Gaji   : "+getGaji(jumlah_kehadiran)+" ";
        return s;
    
    }
    
}
