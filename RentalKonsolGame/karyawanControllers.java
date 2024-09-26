
package RentalKonsolGame;

import java.util.Scanner;
public class karyawanControllers {  
    public void Create(){
        Scanner input = new Scanner(System.in);
        karyawan kryn1 = new karyawan();
        
        while (true) {
            System.out.print("\n\nMasukkan Id Karyawan\t: ");
            String idKaryawan = input.nextLine();
            if (idKaryawan.length() == 5) {
                kryn1.setIdKaryawan(idKaryawan);
                break;
            } else {
                System.out.println("Id Salah! Id harus terdiri dari 5 karakter.");
            }
        }
        System.out.print("Masukkan Jabatan\t: ");
        kryn1.setJabatan(input.nextLine());
        while (true) {
            System.out.print("Masukkan Nama\t: ");
            String nama = input.nextLine();
            if (nama.length() >= 3) {
                kryn1.setNama(nama);
                break;
            } else {
                System.out.println("Nama kurang lengkap, harus terdiri dari 3 karakter.");
            }
        }
        System.out.print("Masukkan Email\t: ");
        kryn1.setEmail(input.nextLine());
        String no_telp;
        while (true) {
            System.out.print("Masukkan No telepon\t: ");
            no_telp = input.nextLine();
            if (no_telp.matches("\\d{11,13}")) {
                kryn1.setNo_telp(no_telp);
                break;
            } else {
                System.out.println("Nomor telepon salah! Harus terdiri dari 11 hingga 13 angka.");
            }
        }
        inisialisasi.listKaryawan.add(kryn1);
        System.out.println("Data telah ditambahkan");
    }
    
    public void Read(){
        System.out.println("\n\n--------------------");
        for(karyawan kryn: inisialisasi.listKaryawan){            
            kryn.getTransaksi();
            System.out.println("--------------------");
        }
    }  
    
    public karyawan ReadbyIdKaryawan(String idKaryawan){
        for(karyawan kryn: inisialisasi.listKaryawan){            
            if(kryn.getIdKaryawan() == idKaryawan)
                return kryn;
        }
        return null;
    }
    
    public void Update(){
        Scanner inputUpdate = new Scanner(System.in);
        System.out.print("Masukkan indeks data yg diupdate : ");       
        int indeks = inputUpdate.nextInt();
        
        Scanner input = new Scanner(System.in);
        karyawan kryn1 = new karyawan();
        
        kryn1 = inisialisasi.listKaryawan.get(indeks);
        
        System.out.print("Masukkan Jabatan\t: ");
        kryn1.setJabatan(input.nextLine());
        System.out.print("Masukkan Nama\t: ");
        kryn1.setNama(input.nextLine());
        System.out.print("Masukkan Email\t: ");
        kryn1.setEmail(input.nextLine());
        String no_telp;
        while (true) {
            System.out.print("Masukkan No telepon\t: ");
            no_telp = input.nextLine();
            if (no_telp.matches("\\d{11,13}")) {
                kryn1.setNo_telp(no_telp);
                break;
            } else {
                System.out.println("Nomor telepon salah! Harus terdiri dari 11 hingga 13 angka.");
            }
        }
        inisialisasi.listKaryawan.add(kryn1);
        System.out.println("Data telah diubah");
    }
    
    public void Delete(){
        Scanner inputUpdate = new Scanner(System.in);
        System.out.print("Masukkan indeks data yg diupdate : ");       
        int indeks = inputUpdate.nextInt();
        
        inisialisasi.listKaryawan.remove(indeks);
        System.out.println("Data telah dihapus");
    }
}