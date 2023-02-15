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
        
        JPanel myPrincipalCanvas = new JPanel(new BorderLayout());
        JPanel mySecondCanvas = new JPanel(new BorderLayout());

        MyLabel myTitle = new MyLabel("titre",0);
        
        Box west = new Box(BoxLayout.PAGE_AXIS);
        Box east = new Box(BoxLayout.LINE_AXIS);
        
        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        JTextField textField3 = new JTextField();
        JTextField textField4 = new JTextField();
        JTextField textField5 = new JTextField();
        JTextField textField6 = new JTextField();

        //J'ajoute ma seconde JPanel qui va intégrer mes TextField au centre
        myPrincipalCanvas.add(mySecondCanvas, BorderLayout.CENTER);
        
        //J'ajoute mon Jlabel à ma principale JPanel qui sera mon titre
        myPrincipalCanvas.add(myTitle, BorderLayout.NORTH);
        
        mySecondCanvas.add(west, BorderLayout.WEST);
        mySecondCanvas.add(west, BorderLayout.EAST);
        
        west.add(textField1);
        west.add(textField2);
        west.add(textField3);
        east.add(textField4);
        east.add(textField5);
        east.add(textField6);

        this.add(myPrincipalCanvas);
    }   
}
