package com.uas.algoritm;


import javax.swing.*;

public class RunMesinAntrian {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Aplikasi Antrian Rumah Sakit");
        jFrame.setContentPane(new MesinAntrian().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500, 400);
        jFrame.setVisible(true);
    }
}
