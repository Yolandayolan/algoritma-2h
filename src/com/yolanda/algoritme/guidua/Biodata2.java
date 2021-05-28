package com.yolanda.algoritme.guidua;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Biodata2 {
    private JTextField textNama;
    private JTextField textNIM;
    private JButton buttonCek;
    private JButton buttonKeluar;
    private JPanel rootPanel;
    private JLabel hasil;
    private JLabel hasil2;
    private JLabel hasil3;
    private JLabel hasil4;
    private JLabel hasil5;
    private JLabel hasil6;
    private JLabel hasil7;
    private JLabel hasil8;

    public Biodata2() {
        buttonCek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String Nama = textNama.getText();
                String NIM = textNIM.getText();
                //diproses
                Mahasiswa2 mhs = new Mahasiswa2();
                mhs.setNama(Nama);
                mhs.setNIM(NIM);
                hasil.setText("Nama: " + mhs.getNama());
                hasil2.setText("NIM: " + mhs.getNIM());
                hasil3.setText("Jenjang Pendidikan: " + mhs.getJenjangPendidikan());
                hasil4.setText("Tahun Masuk: " + mhs.getTahunMasuk());
                hasil5.setText("Fakultas: " + mhs.getFakultas());
                hasil6.setText("Jurusan: " + mhs.getJurusan());
                hasil7.setText("Jenis Kelamin: " + mhs.getJenisKelamin());
                hasil8.setText("Nomor Urut: " + mhs.getNoUrutMahasiswa());
            }
        });
        buttonKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }

        public JPanel getRootPanel () {
            return rootPanel;
        }
    }
