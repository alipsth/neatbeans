package gajian;

public class Pegawai {
    
    String Nama,Alamat;
    int nip;
            
    Pegawai(){
        
    }
    
    Pegawai(int nip ,String Nama ,String Alamat){
        this.nip   =nip;
        this.Nama  =Nama;
        this.Alamat=Alamat;
  
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public String getNama (){
        return this.Nama;
    }
    
    
    public int getGaji(int Gaji){
        return Gaji;
    }
    
    
    @Override
    public String toString (){
        String a ="-----PEGAWAI----- "
        +"\n nip = " +this.nip +
        "\nNama  = " +this.Nama +
        "\nAlamat= " +this.Alamat +
        "\nTotal Gaji = " +getGaji(1500000);
        return a;
    }     
}