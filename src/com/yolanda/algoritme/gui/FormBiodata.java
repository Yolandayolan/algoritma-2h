package com.yolanda.algoritme.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNim;
    private JTextField textJenjangPendidikan;
    private JTextField textTahunMasuk;
    private JTextField textFakultas;
    private JTextField textJurusan;
    private JTextField textJenisKelamin;
    private JTextField textNomorUrut;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JLabel labelHasil;

    public FormBiodata() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String Nama = textNama.getText();
                String Nim = textNim.getText();
                String JenjangPendidikan = textJenjangPendidikan.getText();
                String TahunMasuk = textTahunMasuk.getText();
                String Fakultas = textFakultas.getText();
                String Jurusan = textJurusan.getText();
                String JenisKelamin = textJenisKelamin.getText();
                String NomorUrut = textNomorUrut.getText();
                //diproses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(Nama);
                mhs.setNim(Nim);
                mhs.setJenjangPendidikan(JenjangPendidikan);
                mhs.setTahunMasuk(TahunMasuk);
                mhs.setFakultas(Fakultas);
                mhs.setJurusan(Jurusan);
                mhs.setJenisKelamin(JenisKelamin);
                mhs.setNomorUrut(NomorUrut);
                //tampilkan output ke FORM
                labelHasil.setText(mhs.toString());
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
