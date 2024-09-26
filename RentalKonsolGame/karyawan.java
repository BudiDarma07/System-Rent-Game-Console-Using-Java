
package RentalKonsolGame;

public class karyawan extends person{
    //atribut
    private String idKaryawan;
    private String jabatan;
    
    //method
    public void	getGaji(){}
    
    //encapsulation
    //setter
    public void	setIdKaryawan(String _idKaryawan) {
        if(_idKaryawan.length() != 5)
            System.out.println("Id Salah!!!");
        else
            this.idKaryawan= _idKaryawan;
    }
    public void	setJabatan(String _jabatan) {
        this.jabatan = _jabatan;
    }
    
    //getter
    public String getIdKaryawan() { return this.idKaryawan; }
    public String getJabatan() { return this.jabatan; }
    
    //polymorphism
    @Override
    public void	getTransaksi() {
        System.out.println("IdKaryawan\t: " + getIdKaryawan());
        System.out.println("Jabatan\t: " + getJabatan());
        System.out.println("Nama\t: " + getNama());
        System.out.println("Email\t: " + getEmail());
        System.out.println("No telepon\t: " + getNo_telp());
    }
}
