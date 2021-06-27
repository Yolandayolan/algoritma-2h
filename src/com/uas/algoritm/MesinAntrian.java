//digunakan untuk mengelompokkan kelas-kelas yang memiliki kemiripan fungsi
package com.uas.algoritm;

import java.text.SimpleDateFormat; //
import java.util.Calendar;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

public class MesinAntrian {
    private JPanel rootPanel;
    private JTextArea textArea1;
    private JButton buttonProsesAntrian;
    private JButton buttonAmbilAntrian;
    private JLabel lbJmlAntrian;
    private JLabel lbTotalAntrian;
    private JLabel lbPanggilanAntrian;
    private JLabel txtAtas;
    private JLabel txtAtas1;
    private JLabel txtAtas2;
    private JLabel txtAtas3;
    private JLabel txtAtas4;

    // untuk membuat dan menginisialisasikan objec queue(antrian) dengan menggunakan linked list
    Queue<Object> antrian = new LinkedList<>();
    int nomor = 0;

    public MesinAntrian() {

        buttonProsesAntrian.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if (antrian.isEmpty()) { //untuk mengecek suatu antrian itu kosong atau tidak
                    JOptionPane.showMessageDialog(rootPanel, "Ambil Nomor antrian terlebih dahulu !");
                }
                textArea1.setText("");//mengkosongkan daftar antrian di teksarea
                antrian.poll();
                antrian.forEach((Object element) -> {
                    textArea1.append("" + element + "\n"); //mencetak daftar antrian ke textArea
                });
                if (antrian.isEmpty()) { //untuk antrian kosong
                    lbJmlAntrian.setText("0"); //jumlah antrian 0
                    lbTotalAntrian.setText("0"); //total antrian 0
                    lbPanggilanAntrian.setText("-----");
                } else {
                    lbPanggilanAntrian.setText("" + antrian.peek());
                }
                String cvt = String.valueOf(antrian.size());
                lbJmlAntrian.setText(cvt);

                txtAtas.setText("RSUD Sei Dareh");
                txtAtas2.setText("Nomor Antrian");
                txtAtas3.setText(" " + nomor);
                txtAtas4.setText("Silahkan Menunggu "+ cvt + " antrian lagi");
            }
        });


                buttonAmbilAntrian.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {

                        //untuk mensetting tanggal dan waktu otomatis
                        Calendar cal = Calendar.getInstance();
                        SimpleDateFormat s = new SimpleDateFormat("EEEE, dd-MMMM-yyyy HH:mm:ss");
                        String tgl = s.format(cal.getTime());
                        nomor++; //menambah nomor antrian
                        String antr = "Nomor Antrian " + nomor; //menyimpak kedalam variabel antr
                        antrian.add(antr); //memasukkan antrian ke list
                        String cvt = String.valueOf(antrian.size());//mengambil ukuran/panjangnya list
                        lbJmlAntrian.setText(cvt); //mensetting text di jumlah antrian untuk menampilkan panjang list
                        lbPanggilanAntrian.setText("" + antrian.peek());//menampilkan data paling atas
                        lbTotalAntrian.setText("" + nomor); //untuk mensettin total antrian
                        textArea1.append(antr + "\n");

                        txtAtas.setText("RSUD Sei Dareh");
                        txtAtas1.setText(tgl);
                        txtAtas2.setText("Nomor Antrian");
                        txtAtas3.setText(" " + nomor);
                        txtAtas4.setText("Silahkan Menunggu " + cvt + " Antrian Lagi ");
                    }
                });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    }
