/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salleproject;

import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author sarkissian
 */
public class MySpinner extends JSpinner {
    
     int width;
     int height;
    
    public MySpinner(int width, int height){
       super();
       this.setUp();
       //this.width = width;
       //this.height = height;
       this.setSize(WIDTH, HEIGHT);
    }

    private void setUp() {

        SpinnerModel model1 = new SpinnerNumberModel(0, 0, 100, 1);
            JSpinner sp1 = new JSpinner(model1);
            //sp1.setSize(10, 5);
    }
    
    public void resetJSpinner(JSpinner sp){
        
        sp.setValue(0);
    }
    
}
