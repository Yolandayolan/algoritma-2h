package com.yolanda.algoritme.guidua.table;

import javax.swing.*;

public class RunTableAngka {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {
        }
        /**
         * Set image icon
         */
        ImageIcon imageIcon = new ImageIcon("res/mqdefault.png");
        JFrame jFrame = new JFrame("TabelAngka");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new TabelAngka().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    }