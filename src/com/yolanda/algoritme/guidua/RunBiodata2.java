package com.yolanda.algoritme.guidua;

import javax.swing.*;
public class RunBiodata2 {


        public static void main(String[] args) {
            JFrame jFrame = new JFrame("Form Biodata");
            jFrame.setContentPane(new Biodata2().getRootPanel());
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setLocationRelativeTo(null);
            jFrame.setSize(500, 400);
            jFrame.setVisible(true);
        }
    }
