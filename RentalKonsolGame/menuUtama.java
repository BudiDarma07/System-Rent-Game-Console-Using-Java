package RentalKonsolGame;

import java.util.Scanner;
import java.util.InputMismatchException;

public class menuUtama {
    public static void viewMenuCustomer(){
        customerControllers cstmControl = new customerControllers();
        Scanner inputSubMenu = new Scanner(System.in);
        int pilihanSubMenu = 0;
        do {
            System.out.println("--------------------");
            System.out.println(" Data Customer");
            System.out.println("--------------------");
            System.out.println(" 1. Tambah Data\n 2. Ubah Data"
                    + " \n 3. Hapus Data\n 4. Lihat Data\n 5. Kembali");          
            System.out.println("--------------------");
            System.out.print("Pilihan Menu [1-5] : ");
            try {
                pilihanSubMenu = inputSubMenu.nextInt();
                switch(pilihanSubMenu) {
                    case 1: { cstmControl.Create(); break; }
                    case 2: { cstmControl.Update(); break; }
                    case 3: { cstmControl.Delete(); break; }
                    case 4: { cstmControl.Read();  break; }
                    case 5: { break; }
                    default: { 
                        System.out.println("Tidak ada dalam menu");
                        break; }
                }
            } catch (InputMismatchException e) {
                System.out.println("Input salah, silakan masukkan angka antara 1 dan 5.");
                inputSubMenu.next(); // Membersihkan input yang salah
            }
        } while (pilihanSubMenu != 5);
    }

    public static void viewMenuKaryawan(){
        karyawanControllers krynControl = new karyawanControllers();
        Scanner inputSubMenu = new Scanner(System.in);
        int pilihanSubMenu = 0;
        do {
            System.out.println("--------------------");
            System.out.println(" Data Karyawan");
            System.out.println("--------------------");
            System.out.println(" 1. Tambah Data\n 2. Ubah Data"
                    + " \n 3. Hapus Data\n 4. Lihat Data\n 5. Kembali");          
            System.out.println("--------------------");
            System.out.print("Pilihan Menu [1-5] : ");
            try {
                pilihanSubMenu = inputSubMenu.nextInt();
                switch(pilihanSubMenu) {
                    case 1: { krynControl.Create(); break; }
                    case 2: { krynControl.Update(); break; }
                    case 3: { krynControl.Delete(); break; }
                    case 4: { krynControl.Read();  break; }
                    case 5: { break; }
                    default: { 
                        System.out.println("Tidak ada dalam menu");
                        break; }
                }
            } catch (InputMismatchException e) {
                System.out.println("Input salah, silakan masukkan angka antara 1 dan 5.");
                inputSubMenu.next(); // Membersihkan input yang salah
            }
        } while (pilihanSubMenu != 5);
    }

    public static void viewMenuPenyewaan(){
        transaksiPenyewaanControllers penyewaanControl = new transaksiPenyewaanControllers();
        Scanner inputSubMenu = new Scanner(System.in);
        int pilihanSubMenu = 0;
        do {
            System.out.println("--------------------");
            System.out.println(" Data Penyewaan");
            System.out.println("--------------------");
            System.out.println(" 1. Tambah Data\n 2. Ubah Data"
                    + " \n 3. Hapus Data\n 4. Lihat Data\n 5. Kembali");          
            System.out.println("--------------------");
            System.out.print("Pilihan Menu [1-5] : ");
            try {
                pilihanSubMenu = inputSubMenu.nextInt();
                switch(pilihanSubMenu) {
                    case 1: { penyewaanControl.Create(); break; }
                    case 2: { penyewaanControl.Update(); break; }
                    case 3: { penyewaanControl.Delete(); break; }
                    case 4: { penyewaanControl.Read();  break; }
                    case 5: { break; }
                    default: { 
                        System.out.println("Tidak ada dalam menu");
                        break; }
                }
            } catch (InputMismatchException e) {
                System.out.println("Input salah, silakan masukkan angka antara 1 dan 5.");
                inputSubMenu.next(); // Membersihkan input yang salah
            }
        } while (pilihanSubMenu != 5);
    }

    public static void viewMenuPengembalian(){
        transaksiPengembalianControllers pengembalianControl = new transaksiPengembalianControllers();
        Scanner inputSubMenu = new Scanner(System.in);
        int pilihanSubMenu = 0;
        do {
            System.out.println("--------------------");
            System.out.println(" Data Pengembalian");
            System.out.println("--------------------");
            System.out.println(" 1. Tambah Data\n 2. Ubah Data"
                    + " \n 3. Hapus Data\n 4. Lihat Data\n 5. Kembali");          
            System.out.println("--------------------");
            System.out.print("Pilihan Menu [1-5] : ");
            try {
                pilihanSubMenu = inputSubMenu.nextInt();
                switch(pilihanSubMenu) {
                    case 1: { pengembalianControl.Create(); break; }
                    case 2: { pengembalianControl.Update(); break; }
                    case 3: { pengembalianControl.Delete(); break; }
                    case 4: { pengembalianControl.Read();  break; }
                    case 5: { break; }
                    default: { 
                        System.out.println("Tidak ada dalam menu");
                        break; }
                }
            } catch (InputMismatchException e) {
                System.out.println("Input salah, silakan masukkan angka antara 1 dan 5.");
                inputSubMenu.next(); // Membersihkan input yang salah
            }
        } while (pilihanSubMenu != 5);
    }

    public static void main(String[] args){
        inisialisasi.init();
        Scanner inputMenu = new Scanner(System.in);
        int pilihanMenu = 0;
        do {
            System.out.println("--------------------");
            System.out.println("Data Rental Konsol");
            System.out.println("--------------------");
            System.out.println(" 1. Data Customer\n 2. Data Karyawan"
                    + " \n 3. Data Penyewaan\n 4. Data Pengembalian\n 5. Keluar");          
            System.out.println("--------------------");
            System.out.print("Pilihan Menu [1-5] : ");
            try {
                pilihanMenu = inputMenu.nextInt();
                switch(pilihanMenu) {
                    case 1 : { viewMenuCustomer(); break; }
                    case 2 : { viewMenuKaryawan(); break; }
                    case 3 : { viewMenuPenyewaan(); break; }
                    case 4 : { viewMenuPengembalian(); break; }
                    case 5 : { 
                        System.out.println("Terima kasih telah menggunakan sistem");
                        break; }
                    default : { 
                        System.out.println("Tidak ada dalam menu");
                        break; }
                }
            } catch (InputMismatchException e) {
                System.out.println("Input salah, silakan masukkan angka antara 1 dan 5.");
                inputMenu.next(); // Membersihkan input yang salah
            }
        } while (pilihanMenu != 5);
    }
}
