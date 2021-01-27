
package gajian;

public class Dosen {
    String nip,Nama,Alamat;
    int gaji=1500000,tarif=120000,jumlahsks;
            
    Dosen(){
        
    }
    
    Dosen(String nip ,String Nama ,String Alamat){
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
    
    public void setjumlahsks(int jumlahsks){
        this.jumlahsks=jumlahsks * tarif + gaji;
    }
    
    public int getGaji(){
        return gaji;
    }
    
    
    @Override
    public String toString (){
        String a ="-----DOSEN----- "
        +"\n nip = " +this.nip +
        "\nNama  = " +this.Nama +
        "\nAlamat= " +this.Alamat +
        "\nTotal Gaji = " +this.jumlahsks;
        return a;
    }     
}

