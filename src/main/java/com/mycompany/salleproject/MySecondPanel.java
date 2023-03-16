/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salleproject;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author sarkissian
 */
public class MySecondPanel extends JPanel {

    private Dish namePlate;
    private ArrayList<MySpinner> a;
    
    

    public MySecondPanel(Dish namePlate) {

        super();
        this.namePlate = namePlate;
        ArrayList<MySpinner> b = new ArrayList<MySpinner>();
        this.a = b;
        this.setUp();

    }

    

    private void setUp() {
        

        this.setLayout(new GridLayout());
        //Je récupère la despription de mon plat
        MyLabel entree1 = new MyLabel(namePlate.getDescription(), 2); 

       
        //Création d'un spinner qui est associé à un plat qui lui même est associé à la description Dish
        MySpinner sp1 = new MySpinner(namePlate);
        //J'ajoute mon spinner à mon arraylist de spinner
        a.add(sp1); 

        this.add(entree1, BorderLayout.WEST);
        this.add(sp1, BorderLayout.EAST);

    }

    /**
     * @return the a
     */
    public ArrayList<MySpinner> getA() {
        return a;
    }

}
