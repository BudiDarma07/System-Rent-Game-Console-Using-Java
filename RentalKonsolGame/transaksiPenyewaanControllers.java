
package RentalKonsolGame;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class transaksiPenyewaanControllers {
    public void Create(){
        Scanner input = new Scanner(System.in);
        transaksiPenyewaan penyewaan1 = new transaksiPenyewaan();
        
        while (true) {
            System.out.print("\n\nMasukkan Id Penyewaan\t: ");
            String idPenyewaan = input.nextLine();
            if (idPenyewaan.length() == 5) {
                penyewaan1.setIdPenyewaan(idPenyewaan);
                break;
            } else {
                System.out.println("Id Salah! Id harus terdiri dari 5 karakter.");
            }
        }
         while (true) {
            System.out.print("Masukkan Id Customer\t: ");
            String idCustomer = input.nextLine();
            // cek apakah id customer valid
            boolean customerFound = false;
            for (customer c : inisialisasi.listCustomer) {
                if (c.getIdCustomer().equals(idCustomer)) {
                    penyewaan1.setIdCustomer(idCustomer);
                    customerFound = true;
                    break;
                }
            }
            if (!customerFound) {
                System.out.println("Id Customer tidak ditemukan!");
            } else {
                break;
            }
        }
        while (true) {
            System.out.print("Masukkan Tanggal (yyyy-MM-dd)\t: ");
            String tgl = input.nextLine();
            try {
                penyewaan1.setTgl(tgl); // setTgl method will handle the Date conversion
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Tanggal tidak valid. Format harus yyyy-MM-dd");
            }
        }
        System.out.print("Masukkan Metode Pembayaran\t: ");
        penyewaan1.setMetodePembayaran(input.nextLine());
        System.out.print("Masukkan Nama Konsol\t: ");
        penyewaan1.setNamaKonsol(input.nextLine());
        inisialisasi.listTransaksiPenyewaan.add(penyewaan1);
        System.out.println("Data telah ditambahkan");
    }
    
    public void Read(){
        System.out.println("\n\n--------------------");
        for(transaksiPenyewaan penyewaan: inisialisasi.listTransaksiPenyewaan){            
            penyewaan.getStatusTransaksi();
            penyewaan.getInfoSewa();
            System.out.println("--------------------");
        }
        System.out.println("\n\n--------------------");
    for(transaksiPenyewaan penyewaan: inisialisasi.listTransaksiPenyewaan){            
        penyewaan.getStatusTransaksi();
        penyewaan.getInfoSewa();
        // tambahkan kode untuk menampilkan data customer berdasarkan idCustomer
        customer customerData = inisialisasi.listCustomer.stream()
            .filter(c -> c.getIdCustomer().equals(penyewaan.getIdCustomer()))
            .findFirst()
            .orElse(null);
        if(customerData != null){
            System.out.println("Data Customer:");
            System.out.println("Nama\t: " + customerData.getNama());
            System.out.println("Alamat\t: " + customerData.getAlamat());
            System.out.println("No Telepon\t: " + customerData.getNo_telp());
            System.out.println("Email\t: " + customerData.getEmail());
        } else {
            System.out.println("Data Customer tidak ditemukan.");
        }
        System.out.println("--------------------");
    }
    }  
    
    public transaksiPenyewaan ReadbyIdPenyewaan(String idPenyewaan){
        for(transaksiPenyewaan penyewaan: inisialisasi.listTransaksiPenyewaan){            
            if(penyewaan.getIdPenyewaan() == idPenyewaan)
                return penyewaan;
        }
        return null;
    }
    
    public void Update(){
        Scanner inputUpdate = new Scanner(System.in);
        System.out.print("Masukkan indeks data yg diupdate : ");       
        int indeks = inputUpdate.nextInt();
        
        Scanner input = new Scanner(System.in);
        transaksiPenyewaan penyewaan1 = new transaksiPenyewaan();
        
        penyewaan1 = inisialisasi.listTransaksiPenyewaan.get(indeks);
        
        while (true) {
            System.out.print("Masukkan Tanggal (yyyy-MM-dd)\t: ");
            String tgl = input.nextLine();
            try {
                penyewaan1.setTgl(tgl); // setTgl method will handle the Date conversion
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Tanggal tidak valid. Format harus yyyy-MM-dd");
            }
        }
        System.out.print("Masukkan Metode Pembayaran\t: ");
        penyewaan1.setMetodePembayaran(input.nextLine());
        inisialisasi.listTransaksiPenyewaan.add(penyewaan1);
        System.out.println("Data telah diubah");
    }
    
    public void Delete(){
        Scanner inputUpdate = new Scanner(System.in);
        System.out.print("Masukkan indeks data yg diupdate : ");       
        int indeks = inputUpdate.nextInt();
        
        inisialisasi.listTransaksiPenyewaan.remove(indeks);
        System.out.println("Data telah dihapus");
    }
}
