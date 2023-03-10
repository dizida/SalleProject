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
    private ArrayList<String> list;

    public MyPanel() {

        super();
        this.nombreCase = 3;
        this.setUp();

    }

    public MyPanel(int nombreCase, String titreLabel, ArrayList<String> list) {

        super();
        this.nombreCase = nombreCase;
        this.titreLabel = titreLabel;
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
            String a = list.get(i);
            MySecondPanel premiereLigne = new MySecondPanel(a);
            center.add(premiereLigne, BorderLayout.CENTER);
        }

        myCanvas.add(center);

        this.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(8, 3, 3, 8)));

        //J'ajoute mon Jlabel à ma principale JPanel qui sera mon titre
        this.add(myTitle, BorderLayout.NORTH);
        //J'ajoute ma seconde JPanel qui va intégrer mes TextField au centre
        this.add(myCanvas, BorderLayout.CENTER);

    }
}
