/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salleproject;

import java.awt.BorderLayout;
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

    String namePlate;
    private ArrayList<JSpinner> a;

    public MySecondPanel(String namePlate) {

        super();
        this.namePlate = namePlate;
        this.a = b;
        this.setUp();

    }

    //ArrayList<JSpinner> b = new ArrayList<JSpinner>();

    private void setUp() {
        

        this.setLayout(new BorderLayout());
        MyLabel entree1 = new MyLabel(namePlate, 2);

        //SpinnerModel model1 = new SpinnerNumberModel(0, 0, 100, 1);
        //JSpinner sp1 = new JSpinner(model1);
        //sp1.setSize(3, 3);
        MySpinner sp1 = new MySpinner(5, 5);
        b.add(sp1);

        this.add(entree1, BorderLayout.WEST);
        this.add(sp1, BorderLayout.EAST);

    }

    /**
     * @return the a
     */
    public ArrayList<JSpinner> getA() {
        return b;
    }

}
