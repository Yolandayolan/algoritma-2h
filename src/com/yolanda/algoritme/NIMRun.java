package com.yolanda.algoritme;


import java.util.Scanner;

public class NIMRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("NIM : ");
        String nim = input.nextLine();
        NIM objNim = new NIM();
        objNim.setNim(nim);
        System.out.println("Jenjang Pendidikan = "+objNim.getJenjangPendidikan());
        System.out.println("Tahun Masuk = "+objNim.getTahunMasuk());
        System.out.println("Fakultas = "+objNim.getFakultas());
        System.out.println("Jurusan = "+objNim.getJurusan());
        System.out.println("Jenis Kelamin = "+objNim.getJenisKelamin());
        System.out.println("No Urut Mahasiswa = "+objNim.getNoUrutMahasiswa());
    }
}
