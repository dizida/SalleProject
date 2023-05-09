/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salleproject;

/**
 *
 * @author sarkissian
 */
// Création d'une classe plat qui va me permettre de créer des objets de type plat
public class Dish {
    
    private Long id;
    private String description;
    private int qty;
    
    public Dish (Long id, String description){
        this.description = description;
        this.id = id;
        this.qty = 0;
      
    
}

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    
}
