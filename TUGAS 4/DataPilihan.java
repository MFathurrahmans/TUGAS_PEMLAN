/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author USER
 */
public class DataPilihan {
    static Pilihan[] merchant = new Pilihan[0];

    public static Pilihan[] tambahMerchant (Pilihan m){
        Pilihan[] merch = new Pilihan[DataPilihan.merchant.length + 1];

        for (int i = 0; i < DataPilihan.merchant.length; i++){
            merch[i] = merchant[i];
        }

        merch[DataPilihan.merchant.length] = m;
        return merch;
    }

    public static void tampilData(){
        for (Pilihan x : DataPilihan.merchant) {
            System.out.println("=== Tampilan Data Merchant UBFOOD ===");
            System.out.println("Nama Merchant   : " + x.getnamaMerchant());
            System.out.println("Nama Produk     : " + x.getnamaProduk());
            System.out.println("Harga           : " + (int) x.getHarga());
        }
    }

    public static Pilihan cariMerchant (String nama){
        int index = 0;
        for (int i = 0; i < DataPilihan.merchant.length; i++){
            if (DataPilihan.merchant[i].getnamaMerchant() == nama){
                index = i;
                break;
            }
        }
        return merchant[index];
    }

    public static void tampilMerchant (Pilihan m){
        System.out.println("=== Tampilan Data Merchant UBFOOD ===");
        System.out.println("Nama Merchant   : " + m.getnamaMerchant());
        System.out.println("Nama Produk     : " + m.getnamaProduk());
        System.out.println("Harga           : " + (int) m.getHarga());
    }

    public static void updateMerchant (Pilihan m, String nm, String np, double h){
        m.setnamaMerchant(nm);
        m.setnamaProduk(np);
        m.setHarga(h);
    }
}
