/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salleproject;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.PINK;
import java.awt.FlowLayout;
import javax.swing.JPanel;

/**
 *
 * @author sarkissian
 */
public class Command extends JPanel {
    
     public Command(){
        
        super();
        this.setUp();      
    }

    private void setUp() {
        
        this.setLayout(new FlowLayout(2));
        
        MyButton confirmCommand = new MyButton("Confirm your Command", Color.GREEN);
        MyButton cancelConfirm = new MyButton("Cancel your Order", Color.RED);

        this.add(confirmCommand, BorderLayout.CENTER);
        this.add(cancelConfirm, BorderLayout.EAST);
    }

   
    
}
