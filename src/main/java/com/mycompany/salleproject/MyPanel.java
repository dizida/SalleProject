/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salleproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author sarkissian
 */
public class MyPanel extends JPanel {

    private int nombreCase;
    private String titreLabel;
    private ArrayList<Dish> list; //Création d'une arrayList de plat qui sera lu par mes Jlabel
    private ArrayList<MySpinner> fusion; //Fusion de mes trois JSpiner


    public MyPanel(int nombreCase, String titreLabel, ArrayList<Dish> list) {

        super();
        this.nombreCase = nombreCase;
        this.titreLabel = titreLabel;
        ArrayList<MySpinner> b = new ArrayList<MySpinner> ();
        this.fusion = b;
        this.list = list;
        this.setUp();

    }

    private void setUp() {

        this.setLayout(new BorderLayout());

        JPanel myCanvas = new JPanel(new BorderLayout());

        this.setBackground(Color.ORANGE);
        myCanvas.setBackground(Color.YELLOW);

        MyLabel myTitle = new MyLabel(titreLabel, 0);
        Box center = Box.createVerticalBox();

        for (int i = 0; i < nombreCase; ++i) {
            Dish a = list.get(i);
            MySecondPanel premiereLigne = new MySecondPanel(a);
            fusion.addAll(premiereLigne.getA()); //fusion ArrayList
            center.add(premiereLigne, BorderLayout.CENTER);
            
        }
        
      
        myCanvas.add(center);

        this.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(8, 3, 3, 8)));

        //J'ajoute mon Jlabel à ma principale JPanel qui sera mon titre
        this.add(myTitle, BorderLayout.NORTH);
        //J'ajoute mon second JPanel qui va intégrer mes spinner au centre
        this.add(myCanvas, BorderLayout.CENTER);

    }

    /**
     * @return the fusion
     */
    public ArrayList<MySpinner> getFusion() {
        return fusion;
    }
}
