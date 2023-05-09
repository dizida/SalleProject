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
import javax.swing.JSpinner;

/**
 *
 * @author sarkissian
 */
public class MyFrame extends JFrame {

    private String title;
    private int width;
    private int height;
    private ArrayList<MySpinner> fusionBis;

    public MyFrame(String title, int width, int height) {
        super(title);
        this.width = width;
        this.height = height;
        ArrayList<MySpinner> b = new ArrayList<MySpinner> ();
        this.fusionBis = b;
        this.setUpAndDisplay();
    }

    private void setUpAndDisplay() {

        // permet de mettre dans mes jLabel mes entrées
        ReadJson j1 = new ReadJson();  
        ArrayList<Dish> entree = j1.readEntree();
        
        ReadJson j2 = new ReadJson();
        ArrayList<Dish> plates = j2.readPlate();
        
        ReadJson j3 = new ReadJson();
        ArrayList<Dish> dessert = j2.readDessert();
        

        JPanel mpp = new JPanel();
        MyPanel mp = new MyPanel(entree.size(), "Entrées", entree);
        MyPanel mp1 = new MyPanel(plates.size(), "Plats", plates);
        MyPanel mp2 = new MyPanel(dessert.size(), "Desserts", dessert);
        InterfaceTitle iT = new InterfaceTitle();
        Command cd = new Command();
        
        fusionBis.addAll(mp.getFusion());
        fusionBis.addAll(mp1.getFusion());
        fusionBis.addAll(mp2.getFusion());//fusion ArrayList
        
        // Permet d'effacer les quantités
        cd.getReset().addActionListener(e -> { 
            for(JSpinner f : fusionBis){
                f.setValue(0);
            }
        });
        
        //met à jour la quantité de chaque plat
        cd.getConfirmCommand().addActionListener(e -> {
            
            for(MySpinner f : fusionBis){
                f.getDish().setQty((int) f.getValue());
            }
            
            WriteJson ecritor = new WriteJson();
            ecritor.generator(entree, plates, dessert);
            
            //Remet mes spinner à 0
            for(JSpinner f : fusionBis){
                f.setValue(0);
            }
        });
    
        mpp.setLayout(new BorderLayout());
        
        mpp.add(mp, BorderLayout.WEST);
        mpp.add(mp1, BorderLayout.CENTER);
        mpp.add(mp2, BorderLayout.EAST);
        mpp.add(iT, BorderLayout.NORTH);
        mpp.add(cd, BorderLayout.SOUTH);

        this.add(mpp);
        pack();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}
