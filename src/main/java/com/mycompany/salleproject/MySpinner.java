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

    private int width;
    private int height;
    private Dish dish;

    public MySpinner(Dish dish)  { // J'associe mon JSpinner à un objet dish
        super(new SpinnerNumberModel(0, 0, 100, 1));
        this.dish = dish;
        

    }
    // Remise à 0 de mes jspinner
    public void resetJSpinner(JSpinner sp) {

        sp.setValue(0);
    }

    /**
     * @return the dish
     */
    public Dish getDish() {
        return dish;
    }

}
