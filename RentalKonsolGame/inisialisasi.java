
package RentalKonsolGame;

import java.util.ArrayList;

/**
 *
 * @author Budi Darma
 */
public class inisialisasi {
    //array menampung  data object berupa list
    public static ArrayList<customer>
                listCustomer = new ArrayList<>();
    public static ArrayList<karyawan>
                listKaryawan = new ArrayList<>();
    public static ArrayList<transaksiPenyewaan>
                listTransaksiPenyewaan = new ArrayList<>();
    public static ArrayList<transaksiPengembalian>
                listTransaksiPengembalian = new ArrayList<>();
    
    public static void init()
    {
        //data customer
        customer cstm1 = new customer();
        cstm1.setIdCustomer("30538");
        cstm1.setAlamat("Denpasar");
        cstm1.setNama("Budi");
        cstm1.setEmail("budidarma@rocketmail.com");
        cstm1.setNo_telp("0899912112");
        listCustomer.add(cstm1);
        
        customer cstm2 = new customer();
        cstm2.setIdCustomer("30517");
        cstm2.setAlamat("Denpasar");
        cstm2.setNama("Ryes");
        cstm2.setEmail("Ryezz@gmail.com");
        cstm2.setNo_telp("0899944244");
        listCustomer.add(cstm2);
        
        customer cstm3 = new customer();
        cstm3.setIdCustomer("30565");
        cstm3.setAlamat("Denpasar");
        cstm3.setNama("sutelekesa");
        cstm3.setEmail("sutelekesa@gmail.com");
        cstm3.setNo_telp("0893333312");
        listCustomer.add(cstm3);
        
        //data karyawan
        karyawan kryn1 = new karyawan();
        kryn1.setIdKaryawan("58330");
        kryn1.setJabatan("admin");
        kryn1.setNama("darma");
        kryn1.setEmail("darma@gmail.com");
        kryn1.setNo_telp("0812121212");
        listKaryawan.add(kryn1);
        
        karyawan kryn2 = new karyawan();
        kryn2.setIdKaryawan("51730");
        kryn2.setJabatan("admin");
        kryn2.setNama("wira");
        kryn2.setEmail("wira@gmail.com");
        kryn2.setNo_telp("0891281902");
        listKaryawan.add(kryn2);
        
        karyawan kryn3 = new karyawan();
        kryn3.setIdKaryawan("56530");
        kryn3.setJabatan("karyawan");
        kryn3.setNama("putra");
        kryn3.setEmail("putra@gmail.com");
        kryn3.setNo_telp("0891281902");
        listKaryawan.add(kryn2);
    }
    
}
