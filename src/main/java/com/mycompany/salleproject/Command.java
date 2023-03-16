/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salleproject;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.PINK;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.reflect.Array.get;
import static java.nio.file.Paths.get;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import static javax.swing.UIManager.get;

/**
 *
 * @author sarkissian
 */
public class Command extends JPanel {
    
    private JButton confirmCommand ;
    private JButton reset ;
    
    public Command() {

        super();
        this.setUp();
    }

    private void setUp() {

        this.setLayout(new FlowLayout(2));

        MyButton confirmCommand = new MyButton("Confirm your Command", Color.GREEN);
        this.confirmCommand = confirmCommand;

        MyButton reset = new MyButton("Cancel your Order", Color.RED);
        this.reset = reset;
       
        

        this.add(confirmCommand, BorderLayout.CENTER);
        this.add(reset, BorderLayout.EAST);
    }

    /**
     * @return the confirmCommand
     */
    public JButton getConfirmCommand() {
        return confirmCommand;
    }

    /**
     * @return the reset
     */
    public JButton getReset() {
        return reset;
    }
    
    
    
}
