package gajian1;

public class dosen extends pegawai{
    int jml_sks;
    int tarif_sks = 120000;
    
    dosen(){
        
    }
    dosen(String nip,String nama,String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    public int setSKS(int jml_sks){
        this.jml_sks = jml_sks;
        return jml_sks;
        
    }
    @Override
    public int getGaji(int gaji){
       this.jml_sks = jml_sks * tarif_sks + 1500000;
        return super.getGaji(jml_sks); 
    }
    @Override
    public String toString(){
       String s = "*** DOSEN *** \n"
               +"nip    : "+nip+"\n"
               +"nama   : "+nama+"\n"
               +"alamat : "+alamat+"\n"
               +"Gaji   : "+getGaji(jml_sks);
       return s;
    }
}
