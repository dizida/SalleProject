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
public class MyPanel extends JPanel{
    
    private int nombreCase ;
    
    public MyPanel(){
        
        super();
        this.setUp(); 
        this.nombreCase=3;
    }
    
    public MyPanel(int nombreCase){
        
        super();
        this.setUp();      
    }
    
    
    private void setUp() {
        
        this.setLayout(new BorderLayout());

        this.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(Color.BLACK),
    BorderFactory.createEmptyBorder(8, 3, 3, 8)));
        
        JPanel myCanvas = new JPanel(new BorderLayout());
        
        this.setBackground(Color.ORANGE);
        myCanvas.setBackground(Color.green);


        MyLabel myTitle = new MyLabel("Entrées",0);
        
        Box west = new Box(BoxLayout.PAGE_AXIS);
        Box east = new Box(BoxLayout.PAGE_AXIS);
        
        for (int i=0; i<nombreCase; ++i){
        
        MyLabel entree1 = new MyLabel("Pate bolognaise au saumon", 2);
        SpinnerModel model1 = new SpinnerNumberModel(1, 0, 100, 1); 
        JSpinner sp1 = new JSpinner(model1);
        west.add(entree1);
        east.add(sp1);
        myCanvas.add(west, BorderLayout.CENTER);
        myCanvas.add(east, BorderLayout.EAST);
        
        }
    
        
        /*SpinnerModel model1 = new SpinnerNumberModel(1, 0, 100, 1); 
        SpinnerModel model2 = new SpinnerNumberModel(1, 0, 100, 1); 
        SpinnerModel model3 = new SpinnerNumberModel(1, 0, 100, 1);
        SpinnerModel model4 = new SpinnerNumberModel(1, 0, 100, 1);
        
        JSpinner sp1 = new JSpinner(model1); 
        JSpinner sp2 = new JSpinner(model2);
        JSpinner sp3 = new JSpinner(model3);
        JSpinner sp4 = new JSpinner(model3);
        
        
        west.add(entree1);
        west.add(entree2);
        west.add(entree3);
        west.add(entree4);
        
        east.add(sp1);
        east.add(sp2);
        east.add(sp3);
        east.add(sp4); */
        

       
        
        //J'ajoute mon Jlabel à ma principale JPanel qui sera mon titre
        this.add(myTitle, BorderLayout.NORTH);
        //J'ajoute ma seconde JPanel qui va intégrer mes TextField au centre
        this.add(myCanvas, BorderLayout.CENTER);
    
     
    }   
}
