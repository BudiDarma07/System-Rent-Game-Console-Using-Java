package RentalKonsolGame;

import java.util.Scanner;
public class transaksiPengembalianControllers {
    public void Create(){
        Scanner input = new Scanner(System.in);
        transaksiPengembalian pengembalian1 = new transaksiPengembalian();
        
        while (true) {
            System.out.print("\n\nMasukkan Id Pengembalian\t: ");
            String idPengembalian = input.nextLine();
            if (idPengembalian.length() == 5) {
                pengembalian1.setIdPengembalian(idPengembalian);
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
                    pengembalian1.setIdCustomer(idCustomer);
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
                pengembalian1.setTgl(tgl); // setTgl method will handle the Date conversion
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Tanggal tidak valid. Format harus yyyy-MM-dd");
            }
        }
        System.out.print("Masukkan Metode Pembayaran\t: ");
        pengembalian1.setMetodePembayaran(input.nextLine());
        System.out.print("Masukkan Nama Konsol\t: ");
        pengembalian1.setNamaKonsol(input.nextLine());
        inisialisasi.listTransaksiPengembalian.add(pengembalian1);
        System.out.println("Data telah ditambahkan");
    }
    
    public void Read(){
        System.out.println("\n\n--------------------");
        for(transaksiPengembalian pengembalian: inisialisasi.listTransaksiPengembalian){            
           pengembalian.getStatusTransaksi();
            pengembalian.getInfoSewa();
            System.out.println("--------------------");
        }
        System.out.println("\n\n--------------------");
    for(transaksiPengembalian pengembalian: inisialisasi.listTransaksiPengembalian){            
        pengembalian.getStatusTransaksi();
        pengembalian.getInfoSewa();
        // tambahkan kode untuk menampilkan data customer berdasarkan idCustomer
        customer customerData = inisialisasi.listCustomer.stream()
            .filter(c -> c.getIdCustomer().equals(pengembalian.getIdCustomer()))
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
    
    public transaksiPengembalian ReadbyIdPengembalian(String idPengembalian){
        for(transaksiPengembalian pengembalian: inisialisasi.listTransaksiPengembalian){            
            if(pengembalian.getIdPengembalian() == idPengembalian)
                return pengembalian;
        }
        return null;
    }
    
    public void Update(){
        Scanner inputUpdate = new Scanner(System.in);
        System.out.print("Masukkan indeks data yg diupdate : ");       
        int indeks = inputUpdate.nextInt();
        
        Scanner input = new Scanner(System.in);
        transaksiPengembalian pengembalian1 = new transaksiPengembalian();
        
        pengembalian1 = inisialisasi.listTransaksiPengembalian.get(indeks);
        
       
        while (true) {
            System.out.print("Masukkan Tanggal (yyyy-MM-dd)\t: ");
            String tgl = input.nextLine();
            try {
                pengembalian1.setTgl(tgl); // setTgl method will handle the Date conversion
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Tanggal tidak valid. Format harus yyyy-MM-dd");
            }
        }
        System.out.print("Masukkan Metode Pembayaran\t: ");
        pengembalian1.setMetodePembayaran(input.nextLine());
        System.out.print("Masukkan Nama Konsol\t: ");
        pengembalian1.setNamaKonsol(input.nextLine());
        inisialisasi.listTransaksiPengembalian.add(pengembalian1);
        System.out.println("Data telah diubah");
    }
    
    public void Delete(){
        Scanner inputUpdate = new Scanner(System.in);
        System.out.print("Masukkan indeks data yg diupdate : ");       
        int indeks = inputUpdate.nextInt();
        
        inisialisasi.listTransaksiPengembalian.remove(indeks);
        System.out.println("Data telah dihapus");
    }
}
