/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salleproject;

import javax.swing.JLabel;

/**
 *
 * @author sarkissian
 */
public class MyLabel extends JLabel{
        
    private String texte;
    
    public MyLabel(String texte, int alignment){
        
        super(texte, alignment);
        
    }
    
    public MyLabel(){
        
        super();
        
    }
    
    public void changeText(String texte) {
        this.setText(texte);
        
        
}
    
    
}
