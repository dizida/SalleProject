/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salleproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;
import java.util.ArrayList;

/**
 *
 * @author sarkissian
 */
public class MyFrame extends JFrame {

    private String title;
    private int width;
    private int height;

    public MyFrame(String title, int width, int height) {
        super(title);
        this.width = width;
        this.height = height;
        this.setUpAndDisplay();
    }

    private void setUpAndDisplay() {

        ReadJson j1 = new ReadJson();
        ArrayList<String> entree = j1.readEntree();
        
        ReadJson j2 = new ReadJson();
        ArrayList<String> plates = j2.readPlate();
        
        ReadJson j3 = new ReadJson();
        ArrayList<String> dessert = j2.readDessert();
        

        JPanel mpp = new JPanel();
        MyPanel mp = new MyPanel(entree.size(), "Entrées", entree);
        MyPanel mp1 = new MyPanel(plates.size(), "Plats", plates);
        MyPanel mp2 = new MyPanel(dessert.size(), "Desserts", dessert);
        InterfaceTitle iT = new InterfaceTitle();
        Command cd = new Command();
        //MyLabel myMppTitle = new MyLabel("titre2",0);

        mpp.setLayout(new BorderLayout());
        //mpp.setBackground(Color.BLUE);
        mpp.add(mp, BorderLayout.WEST);
        mpp.add(mp1, BorderLayout.CENTER);
        mpp.add(mp2, BorderLayout.EAST);
        mpp.add(iT, BorderLayout.NORTH);
        mpp.add(cd, BorderLayout.SOUTH);

        this.add(mpp);
        //this.setSize(height, width);
        pack();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}
