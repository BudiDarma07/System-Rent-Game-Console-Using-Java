
package RentalKonsolGame;


public class transaksiPenyewaan extends transaksi{
    //atribut
    private String idPenyewaan;
    private String statusPenyewaan;
    private boolean isDone;
    private String idCustomer;
    //method
    public void	getPenyewaan(){}
    
    //encapsulation
    //setter
     public void setIdPenyewaan(String idPenyewaan) {
        if (idPenyewaan != null && !idPenyewaan.isEmpty()) {
            this.idPenyewaan = idPenyewaan;
        } else {
            throw new IllegalArgumentException("Id Penyewaan tidak boleh null atau kosong");
        }
    }
     
     public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }
     
     public void setStatusPenyewaan(String statusPenyewaan) {
        this.statusPenyewaan = statusPenyewaan;
    }

     
    //getter
    public String getIdPenyewaan() { return this.idPenyewaan; }
    public String getIdCustomer() {
        return idCustomer;
    }
    //polymorphism
    @Override
    public void getInfoSewa() {
    System.out.println("Status Sewa: " + (isDone ? "Done" : "Belum"));
    }
   
    
    @Override
    public void	getStatusTransaksi() {
        System.out.println("IdPenyewaan\t: " + getIdPenyewaan());
        System.out.println("Tanggal\t: " + getTgl());
        System.out.println("Metode Pembayaran\t: " + getMetodePembayaran());
        System.out.println("Nama Konsol\t: " + getNamaKonsol());
        super.getStatusTransaksi(); 
        isDone = (getTgl() != null && getMetodePembayaran() != null && getIdCustomer() != null && getNamaKonsol() != null);
    }

}