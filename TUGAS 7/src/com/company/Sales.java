package com.company;

public class Sales extends Pegawai {
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    @Override
    public double gaji() {
        return (getPenjualan() * getKomisi());
    }

    @Override
    public String toString() {
        return "Sales\t\t\t : " + getNama() +
                "\nNo. KTP \t\t : " + getNoKTP() +
                "\nTotal Penjualan\t : " + getPenjualan()
                + "\nBesaran Komisi\t : " + getKomisi() +
                "\nPendapatan\t\t : Rp." + (int) gaji();
    }
}
