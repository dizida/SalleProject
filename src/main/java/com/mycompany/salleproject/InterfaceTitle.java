/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salleproject;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author sarkissian
 */
public class InterfaceTitle extends JPanel {
    
     public InterfaceTitle(){
        
        super();
        this.setUp();      
    }

    private void setUp() {
        
        this.setLayout(new BorderLayout());
        
        MyLabel myInterfaceTitle = new MyLabel("Les Commandes de la Salle",0);
        
        this.setBackground(Color.PINK);
        
        this.add(myInterfaceTitle);
    }
}
