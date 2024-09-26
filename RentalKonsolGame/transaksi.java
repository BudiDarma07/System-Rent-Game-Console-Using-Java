
package RentalKonsolGame;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class transaksi {
    //atribut
    private Date tgl;
    private String metodePembayaran;
    private String namaCustomer;
    private String namaKonsol;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private boolean isDone;
    
    //method
 
    public void	getInfoSewa(){
    }
    public void getStatusTransaksi() {
    }
    
    //encapsulation
    //setter
    public void setTgl(String _tgl) {
        try {
            this.tgl = dateFormat.parse(_tgl);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Tanggal tidak valid. Format harus yyyy-MM-dd");
        }
    }
    
    
    public void setMetodePembayaran(String _metodePembayaran) {
        this.metodePembayaran = _metodePembayaran;
    }
    
    
    public void setNamaKonsol(String _namaKonsol) {
        this.namaKonsol = _namaKonsol;}
        
    //getter
    public Date getTgl() {
            return this.tgl; 
    }
    
    public String getMetodePembayaran() { 
        return this.metodePembayaran; 
    }
    
    public String getNamaKonsol() { 
        return this.namaKonsol; 
    }
    
    public boolean isDone() {
        return isDone;
    }
}