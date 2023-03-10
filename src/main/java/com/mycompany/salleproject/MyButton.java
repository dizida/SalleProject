/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salleproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 *
 * @author sarkissian
 */
public class MyButton extends JButton {
    
    Color color;
     
     
     public MyButton(String text, Color color) {
         this.color = color;
         this.setText(text);
         this.setUp();
     }

    private void setUp() {
        
        this.setBackground(color);
        this.setOpaque(true);
        this.setBorderPainted(false);
        
    }
    
    
    
}
