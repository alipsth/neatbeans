
package gajian;

public class Staff {
    String nip,Nama,Alamat;
    int gaji=1500000,tarif=50000,jumlahkehadiran;
            
    Staff(){
        
    }
    
    Staff(String nip ,String Nama ,String Alamat){
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
    
    public void setjumlahkehadiran(int jumlahkehadiran){
        this.jumlahkehadiran=jumlahkehadiran * tarif + gaji;
    }
    
    public int getGaji(){
        return gaji;
    }
    
    
    @Override
    public String toString (){
        String a ="-----PEGAWAI----- "
        +"\n nip = " +this.nip +
        "\nNama  = " +this.Nama +
        "\nAlamat= " +this.Alamat +
        "\nTotal Gaji = " +this.jumlahkehadiran;
        return a;
    }     
}

