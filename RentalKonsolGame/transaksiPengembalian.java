
package RentalKonsolGame;
public class transaksiPengembalian extends transaksi {
    //atribut
    private String idPengembalian;
    private String statusPengembalian;
    private boolean isDone;
    private String idCustomer;
    //method
    public void	getPengembalian(){}
    
    //encapsulation
    //setter
    public void setIdPengembalian(String idPengembalian) {
        if (idPengembalian != null && !idPengembalian.isEmpty()) {
            this.idPengembalian = idPengembalian;
        } else {
            throw new IllegalArgumentException("Id Penyewaan tidak boleh null atau kosong");
        }
    }
    
    public void setStatusPengembalian(String statusPengembalian) {
        this.statusPengembalian = statusPengembalian;
    }
    
    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }
    //getter
    public String getIdPengembalian() { return this.idPengembalian; }
    public String getIdCustomer() {
        return idCustomer;
    }
    
    //polymorphism
    @Override
    public void getInfoSewa() {
    System.out.println("Status Pengembalian: " + (isDone ? "Done" : "Belum"));
    }
    
    @Override
    public void	getStatusTransaksi() {
        System.out.println("IdPengembalian\t: " + getIdPengembalian());
        System.out.println("Tanggal\t: " + getTgl());
        System.out.println("Metode Pembayaran\t: " + getMetodePembayaran());
        System.out.println("Nama Konsol\t: " + getNamaKonsol());
        super.getStatusTransaksi(); 
        isDone = (getTgl() != null && getMetodePembayaran() != null && getIdCustomer() != null && getNamaKonsol() != null);
    }

}
