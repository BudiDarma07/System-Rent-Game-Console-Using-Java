package RentalKonsolGame;

public class customer extends person{
    //atribut
    private String idCustomer;
    private String alamat;
    
    //method
    public void	getCustomer(){}
    
    //encapsulation
    //setter
    public void	setIdCustomer(String _idCustomer) {
        if(_idCustomer.length() != 5)
            System.out.println("Id Salah!!!");
        else
            this.idCustomer = _idCustomer;
    }
    public void	setAlamat(String _alamat) {
        this.alamat = _alamat;
    }
    
    //getter
    public String getIdCustomer() { return this.idCustomer; }
    public String getAlamat() { return this.alamat; }
    
    //polymorphism
    @Override
    public void	getTransaksi() {
        System.out.println("IdCustomer\t: " + getIdCustomer());
        System.out.println("Alamat\t: " + getAlamat());
        System.out.println("Nama\t: " + getNama());
        System.out.println("Email\t: " + getEmail());
        System.out.println("No telepon\t: " + getNo_telp());
    }
}
