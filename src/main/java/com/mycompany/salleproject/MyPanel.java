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
import javax.swing.JTextField;

/**
 *
 * @author sarkissian
 */
public class MyPanel extends JPanel{
    
    
    public MyPanel(){
        
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


        MyLabel myTitle = new MyLabel("titre",0);
        
        Box west = new Box(BoxLayout.PAGE_AXIS);
        Box east = new Box(BoxLayout.PAGE_AXIS);
        
        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField();
        JTextField textField3 = new JTextField();
        JTextField textField4 = new JTextField(5);
        JTextField textField5 = new JTextField();
        JTextField textField6 = new JTextField();
        
        west.add(textField1);
        west.add(textField2);
        west.add(textField3);
        east.add(textField4);
        east.add(textField5);
        east.add(textField6);

        myCanvas.add(west, BorderLayout.CENTER);
        myCanvas.add(east, BorderLayout.EAST);
        
        //J'ajoute mon Jlabel à ma principale JPanel qui sera mon titre
        this.add(myTitle, BorderLayout.NORTH);
        //J'ajoute ma seconde JPanel qui va intégrer mes TextField au centre
        this.add(myCanvas, BorderLayout.CENTER);
    
     
    }   
}
