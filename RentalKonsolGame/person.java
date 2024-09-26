package RentalKonsolGame;

//parent class
public class person {
    //atribut
    String nama;
    String password;
    private String email;
    private String no_telp;
    
    //method
    public void getTransaksi() {}
    
    //encapsulation
    //setter
    public void	setNama(String _nama) {
        if(_nama.length() <= 2)
            System.out.println("Nama Kurang Lengkap");
        else
            this.nama = _nama; 
    }
      
    public void	setEmail(String _email) {
        this.email = _email;
    }
    
     public void setNo_telp(String _no_telp) {
        this.no_telp = _no_telp;
    }
    
    //getter
    public String getNama() {
        if(this.nama == null)
        return "Nama Masih Kosong!!!";
        else
            return this.nama; 
    }
    
    
    public String getPassword() { 
        return this.password; 
    }
    
    public String getEmail() { 
        return this.email; 
    }
    
    public String getNo_telp() { 
        return this.no_telp; 
    }
}



