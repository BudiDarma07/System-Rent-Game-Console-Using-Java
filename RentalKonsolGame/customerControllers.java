
package RentalKonsolGame;


//Crud
import java.util.Scanner;
public class customerControllers {
    public void Create(){
        Scanner input = new Scanner(System.in);
        customer cstm1 = new customer();
        
        while (true) {
            System.out.print("\n\nMasukkan Id Customer\t: ");
            String idCustomer = input.nextLine();
            if (idCustomer.length() == 5) {
                cstm1.setIdCustomer(idCustomer);
                break;
            } else {
                System.out.println("Id Salah! Id harus terdiri dari 5 karakter.");
            }
        }
        System.out.print("Masukkan Alamat\t: ");
        cstm1.setAlamat(input.nextLine());
        while (true) {
            System.out.print("Masukkan Nama\t: ");
            String nama = input.nextLine();
            if (nama.length() >= 3) {
                cstm1.setNama(nama);
                break;
            } else {
                System.out.println("Nama kurang lengkap, harus terdiri dari 3 karakter.");
            }
        }
        System.out.print("Masukkan Email\t: ");
        cstm1.setEmail(input.nextLine());
        String no_telp;
        while (true) {
            System.out.print("Masukkan No telepon\t: ");
            no_telp = input.nextLine();
            if (no_telp.matches("\\d{11,13}")) {
                cstm1.setNo_telp(no_telp);
                break;
            } else {
                System.out.println("Nomor telepon salah! Harus terdiri dari 11 hingga 13 angka.");
            }
        }
        inisialisasi.listCustomer.add(cstm1);
        System.out.println("Data telah ditambahkan");
    }
    
    public void Read(){
        System.out.println("\n\n--------------------");
        for(customer cstm: inisialisasi.listCustomer){            
            cstm.getTransaksi();
            System.out.println("--------------------");
        }
    }  
    
    public customer ReadbyIdCustomer(String idCustomer){
        for(customer cstm: inisialisasi.listCustomer){            
            if(cstm.getIdCustomer() == idCustomer)
                return cstm;
        }
        return null;
    }
    
    public void Update(){
        Scanner inputUpdate = new Scanner(System.in);
        System.out.print("Masukkan indeks data yg diupdate : ");       
        int indeks = inputUpdate.nextInt();
        
        Scanner input = new Scanner(System.in);
        customer cstm1 = new customer();
        
        cstm1 = inisialisasi.listCustomer.get(indeks);
        
        System.out.print("Masukkan Alamat\t: ");
        cstm1.setAlamat(input.nextLine());
        System.out.print("Masukkan Nama\t: ");
        cstm1.setNama(input.nextLine());
        System.out.print("Masukkan Email\t: ");
        cstm1.setEmail(input.nextLine());
        String no_telp;
        while (true) {
            System.out.print("Masukkan No telepon\t: ");
            no_telp = input.nextLine();
            if (no_telp.matches("\\d{11,13}")) {
                cstm1.setNo_telp(no_telp);
                break;
            } else {
                System.out.println("Nomor telepon salah! Harus terdiri dari 11 hingga 13 angka.");
            }
        }
        inisialisasi.listCustomer.add(cstm1);
        System.out.println("Data telah diubah");
    }
    
    public void Delete(){
        Scanner inputUpdate = new Scanner(System.in);
        System.out.print("Masukkan indeks data yg diupdate : ");       
        int indeks = inputUpdate.nextInt();
        
        inisialisasi.listCustomer.remove(indeks);
        System.out.println("Data telah dihapus");
    }
}