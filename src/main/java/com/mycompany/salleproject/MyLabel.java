/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salleproject;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 *
 * @author sarkissian
 */
public class MyLabel extends JLabel{
        
    private String texte;
    
    public MyLabel(String texte, int alignment){
        
        super(texte, alignment);
        SetUp();
    }
    
    public MyLabel(String texte){
        
        super(texte);
        SetUp();
    }
    
    public void changeText(String texte) {
        this.setText(texte);
        
        
}
    private void SetUp() {
    setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(Color.BLACK),
    BorderFactory.createEmptyBorder(8,8,8,8)));
    }
    
}
