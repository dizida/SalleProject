/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salleproject;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author sarkissian
 */
public class MyThirdPanel extends JPanel{
    
    public MyThirdPanel() {
        super();
        this.setUp();
    }

    private void setUp() {
        
        this.setLayout(new GridLayout(0, 1));
        // Création de label vide pour aérer mon interface
        JLabel c = new JLabel(); 
        JLabel b = new JLabel(); 
        
        //JLabel d = new JLabel(); 
        //JLabel e = new JLabel(); 
        // Tu utilises le label par défaut pour ne pas avoir de setBorder
        JLabel a = new JLabel("Quantitées", 2); 
        a.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        
        this.add(b);
        this.add(a);
        this.add(c);
        //this.add(d);
        //this.add(e);
        

    }
            

    
    
}
