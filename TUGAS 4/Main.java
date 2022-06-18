package main;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataPilihan.merchant = DataPilihan.tambahMerchant(new Pilihan("Bakso Pak Sahid", "Bakso", 8000));
        DataPilihan.merchant = DataPilihan.tambahMerchant(new Pilihan("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataPilihan.merchant = DataPilihan.tambahMerchant(new Pilihan("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 8000));

        
        DataPilihan.tampilData();
        System.out.println();

       
        System.out.println("===Memasukkan Data Merchant Melalui Input===");
        System.out.print("Input Nama Merchant : ");
        String nm = input.nextLine();
        System.out.print("Input Nama Produk   : ");
        String np = input.nextLine();
        System.out.print("Input Harga Produk  : ");
        double h = input.nextDouble();
        input.nextLine();

        DataPilihan.merchant = DataPilihan.tambahMerchant(new Pilihan(nm, np, h));
        System.out.println();

        
        System.out.println("===Menampilkan Data Merchant===");
        DataPilihan.tampilData();
        System.out.println();
        
         System.out.println("====UBAH DATA MERCHANT UBFOOD====");
        
        System.out.print("Nama baru untuk Merchant  : ");
        String Merchantbaru = input.nextLine();
        System.out.print("Nama Produk baru          : ");
        String produkbaru = input.nextLine();
        System.out.print("Harga baru                : ");
        double ubahHargabaru = input.nextDouble(); 
        System.out.println();
        
        DataPilihan.updateMerchant(DataPilihan.cariMerchant(Merchantbaru), Merchantbaru, produkbaru, ubahHargabaru);
        
        //menampilkan data merchant yang diupdate dengan metode pencarian
        DataPilihan.tampilMerchant(DataPilihan.cariMerchant("Bakso Pak Sahid"));
    }
}