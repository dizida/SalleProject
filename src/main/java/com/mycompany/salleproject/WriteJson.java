/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salleproject;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author sarkissian
 */
public class WriteJson {

    public WriteJson() {

    }

    public void generator(ArrayList<Dish> list_entree ,  ArrayList<Dish> list_Plate , ArrayList<Dish> list_Desserts) {
        
        JSONObject obj = new JSONObject(); //Création de l'objet général
        
        //Rajout de l'id du début, le temps écoulé
        
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String tsp = timestamp.getTime() + ""; //Transformation en string
        obj.put("id", tsp);
               
        JSONArray starters = new JSONArray();//création d'une liste d'objet
        for (Dish s : list_entree){
            
            JSONObject starters2 = new JSONObject();//Création d'un objet à qui je donne un l'id et une qté
            starters2.put("id", s.getId());
            starters2.put("qty", s.getQty());
            starters.add(starters2);// j'ajoute mon objet à ma liste 
        } obj.put("Starters", starters);
        
        
        
        JSONArray main_courses = new JSONArray();//création d'une liste d'objet
        for (Dish s : list_Plate){
            
            JSONObject main_courses2 = new JSONObject();//Création d'un objet à qui je donne un l'id et une qté
            main_courses2.put("id", s.getId());
            main_courses2.put("qty", s.getQty());
            main_courses.add(main_courses2);// j'ajoute mon objet à ma liste 
        } obj.put("main_courses", main_courses);
        
        JSONArray desserts = new JSONArray();//création d'une liste d'objet
        for (Dish s : list_Desserts){
            
            JSONObject desserts2= new JSONObject();//Création d'un objet à qui je donne un l'id et une qté
            desserts2.put("id", s.getId());
            desserts2.put("qty", s.getQty());
            desserts.add(desserts2);// j'ajoute mon objet à ma liste 
        } obj.put("Desserts", desserts);
        
        
       
        System.out.print(obj);

        try {

            FileWriter file = new FileWriter("/Users/sarkissian/Downloads/restaurant_commande.Json" + tsp);
            file.write(obj.toJSONString());
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

       //return obj.toJSONString();
               

    

    }
}
