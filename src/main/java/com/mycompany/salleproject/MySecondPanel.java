/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salleproject;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author sarkissian
 */
public class MySecondPanel extends JPanel {

    public MySecondPanel() {

        super();
        this.setUp();

    }

    private void setUp() {
        //JPanel myCanvas = new JPanel(new BorderLayout());

            this.setLayout(new BorderLayout());
            MyLabel entree1 = new MyLabel("Pate bolognaise au saumon", 2);

            SpinnerModel model1 = new SpinnerNumberModel(1, 0, 100, 1);
            JSpinner sp1 = new JSpinner(model1);
            sp1.setSize(3, 3);

            this.add(entree1, BorderLayout.WEST);
            this.add(sp1, BorderLayout.EAST);

    }

}
