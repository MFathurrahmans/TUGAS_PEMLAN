package com.company;

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai;
        pegawai = new Pegawai();
        System.out.println("==============================");
        System.out.println("Pegawai Tetap");
        System.out.println("==============================");
        pegawai = new PegawaiTetap("M.Fathurrahman Susetyo", "1107092010030002", 9000000);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new PegawaiTetap("vynnn", "1234567891011", 27000000);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new PegawaiTetap("R7", "5647356473676", 16000000);
        System.out.println(pegawai.toString() + "\n");
        System.out.println("==============================");
        System.out.println("Pegawai Harian");
        System.out.println("==============================");
        pegawai = new PegawaiHarian("Skylar", "745352434", 5000, 40);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new PegawaiHarian("Ajun", "4673553797", 5000, 50);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new PegawaiHarian("James", "44677365483", 5000, 30);
        System.out.println(pegawai.toString() + "\n");
        System.out.println("=================================");
        System.out.println("Sales");
        System.out.println("=================================");
        pegawai = new Sales("REKT", "7864537845", 40, 15000);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new Sales("XINNN", "4874765375", 65, 15000);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new Sales("Clay", "89474673620", 64, 15000);
        System.out.println(pegawai.toString() + "\n");

    }
}
