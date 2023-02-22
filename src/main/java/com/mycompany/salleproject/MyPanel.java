/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salleproject;

import java.awt.BorderLayout;
import java.awt.Color;
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

    public MyPanel() {

        super();
        this.nombreCase = 3;
        this.setUp();

    }

    public MyPanel(int nombreCase, String titreLabel) {

        super();
        this.nombreCase = nombreCase;
        this.titreLabel = titreLabel;
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

            MySecondPanel premiereLigne = new MySecondPanel();
            center.add(premiereLigne, BorderLayout.CENTER);
        }

        myCanvas.add(center);
        /*MyLabel entree1 = new MyLabel("Pate bolognaise au saumon", 2);
        entree1.setSize(10, 3);
        west.add(entree1);
        
        SpinnerModel model1 = new SpinnerNumberModel(1, 0, 100, 1); 
        JSpinner sp1 = new JSpinner(model1);
        sp1.setSize(3, 3);
        east.add(sp1);
        
        myCanvas.add(west, BorderLayout.CENTER);
        myCanvas.add(east, BorderLayout.EAST);*/
        this.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(8, 3, 3, 8)));

        //J'ajoute mon Jlabel à ma principale JPanel qui sera mon titre
        this.add(myTitle, BorderLayout.NORTH);
        //J'ajoute ma seconde JPanel qui va intégrer mes TextField au centre
        this.add(myCanvas, BorderLayout.CENTER);

    }
}
