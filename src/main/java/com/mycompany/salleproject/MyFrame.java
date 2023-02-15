/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salleproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;

/**
 *
 * @author sarkissian
 */
public class MyFrame extends JFrame{
    
    private String title;
    private int width;
    private int height;
    
    
    public MyFrame(String title, int width, int height){
        super(title);
        this.width = width;
        this.height = height;
        this.setUpAndDisplay();
    }
      
        private void setUpAndDisplay() {
            MyPanel mp = new MyPanel();
                    
            
            
            this.add(mp);
            //this.setSize(height, width);
            pack();
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.setVisible(true);
        }    
}



    

