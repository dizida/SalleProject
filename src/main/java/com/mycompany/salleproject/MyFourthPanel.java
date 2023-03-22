/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salleproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author sarkissian
 */
public class MyFourthPanel extends JPanel{
    
    public MyFourthPanel() {
        super();
        this.setUp();
    }

    private void setUp() {
        
        this.setLayout(new BorderLayout());
        // Création de label vide pour aérer mon interface
        JLabel c = new JLabel("    "); 
        JLabel b = new JLabel("    ");  
        
       this.add(b, BorderLayout.NORTH);
       this.add(c, BorderLayout.SOUTH);
        
        //this.setBackground(Color.PINK);
        

    }
            

    
    
}
