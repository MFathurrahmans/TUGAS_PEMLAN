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
public class Pilihan {
    
    String namaMerchant;
    String namaProduk;
    double harga;
    
    public Pilihan (String namaMerchant, String namaProduk, double harga){
        this.namaMerchant = namaMerchant;
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public String getnamaMerchant() {
        return namaMerchant;
    }

    public void setnamaMerchant(String namaMerchant) {
        this.namaMerchant = namaMerchant;
    }

    public String getnamaProduk() {
        return namaProduk;
    }

    public void setnamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}