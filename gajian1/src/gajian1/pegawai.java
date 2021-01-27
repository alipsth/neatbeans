
package gajian1;

public class pegawai {
    String nip, nama, alamat;
    
    pegawai () {
        
    }
    pegawai (String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    public String setNama (String nama){
        this.nama = nama;
        return nama;
    }
    public String getNama (String nama){
        return nama;
    }

   
   
    public int getGaji (int gaji){
        return gaji;
    }
    @Override
    public String toString(){
        String s = "*** PEGAWAI *** \n"
                + "Nip    : "+nip+"\n"
                + "Nama   : "+getNama(nama)+"\n"
                + "Alamat : "+alamat+"\n"
                + "Gaji   : "+getGaji(1500000)+" ";
        return s;
    }
}

