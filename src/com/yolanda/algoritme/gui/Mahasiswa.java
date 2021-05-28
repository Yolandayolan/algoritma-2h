package com.yolanda.algoritme.gui;

public class Mahasiswa {
    private String Nama;
    private String Nim;
    private String JenjangPendidikan;
    private String TahunMasuk;
    private String Fakultas;
    private String Jurusan;
    private String JenisKelamin;
    private String NomorUrut;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim, String jenjangPendidikan, String tahunMasuk, String fakultas, String jurusan, String jenisKelamin, String nomorUrut) {
        this.Nama = nama;
        this.Nim = nim;
        this.JenjangPendidikan = jenjangPendidikan;
        this.TahunMasuk = tahunMasuk;
        this.Fakultas = fakultas;
        this.Jurusan = jurusan;
        this.JenisKelamin = jenisKelamin;
        this.NomorUrut = nomorUrut;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public String getNim() {
        return Nim;
    }

    public void setNim(String nim) {
        this.Nim = nim;
    }

    public String getJenjangPendidikan() {
        return JenjangPendidikan;
    }

    public void setJenjangPendidikan(String jenjangPendidikan) {
        this.JenjangPendidikan = jenjangPendidikan;
    }

    public String getTahunMasuk() {
        return TahunMasuk;
    }

    public void setTahunMasuk(String tahunMasuk) {
        this.TahunMasuk = tahunMasuk;
    }

    public String getFakultas() {
        return Fakultas;
    }

    public void setFakultas(String fakultas) {
        this.Fakultas = fakultas;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String jurusan) {
        this.Jurusan = jurusan;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.JenisKelamin = jenisKelamin;
    }

    public String getNomorUrut() {
        return NomorUrut;
    }

    public void setNomorUrut(String nomorUrut) {
        this.NomorUrut = nomorUrut;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "Nama='" + Nama + '\'' +
                ", Nim='" + Nim + '\'' +
                ", JenjangPendidikan='" + JenjangPendidikan + '\'' +
                ", TahunMasuk='" + TahunMasuk + '\'' +
                ", Fakultas='" + Fakultas + '\'' +
                ", Jurusan='" + Jurusan + '\'' +
                ", JenisKelamin='" + JenisKelamin + '\'' +
                ", NomorUrut='" + NomorUrut + '\'' +
                '}';
    }
}
