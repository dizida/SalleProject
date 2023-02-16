/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salleproject;

import java.awt.BorderLayout;
import static java.awt.Color.PINK;
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
        
        this.setLayout(new BorderLayout());
        
        MyButton confirmCommand = new MyButton("Confirm your Command", PINK);
        MyButton cancelConfirm = new MyButton("Cancel your Order", PINK);

        this.add(confirmCommand, BorderLayout.CENTER);
        this.add(cancelConfirm, BorderLayout.EAST);
    }
    
}
