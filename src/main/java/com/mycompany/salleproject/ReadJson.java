/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.salleproject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.ArrayList;

/**
 *
 * @author sarkissian
 */
public class ReadJson {

    public ReadJson() {

    }

    public ArrayList readEntree() {

        JSONParser j1 = new JSONParser();

        ArrayList list_entree = new ArrayList(); //Création d'une arraylist qui sera lu pour mon jlabel

        try {
            JSONObject jsonO = (JSONObject) j1.parse(new FileReader("/Users/sarkissian/Downloads/restaurant_exemple_menu.json"));

            JSONArray starters = (JSONArray) jsonO.get("starters"); //cherche la liste starters
            
            // Permettra de parcourir ma liste starters
            Iterator<JSONObject> startersList = starters.iterator(); 
            // On parcourt notre liste de straters tant que hasNext est vrai la boucle continue
            while (startersList.hasNext()) {
                JSONObject entree = startersList.next();//lecture première entrée

                Long id = (Long) entree.get("id");//récupère l'id de mon entrée
                String description = (String) entree.get("description");// récupère description de mon entrée

                list_entree.add(new Dish(id,description));//Ajoute sous forme de Dish mon id et ma description

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return list_entree;

    }
    
    public ArrayList<Dish> readPlate() {

        JSONParser j2 = new JSONParser();

        ArrayList<Dish> list_Plate = new ArrayList();

        try {
            JSONObject jsonO = (JSONObject) j2.parse(new FileReader("/Users/sarkissian/Downloads/restaurant_exemple_menu.json"));

            JSONArray main_courses = (JSONArray) jsonO.get("main_courses"); //cherche la mainCourse plats
            

            Iterator<JSONObject> plateList = main_courses.iterator();
            while (plateList.hasNext()) {
                
                JSONObject plate = plateList.next();//premier plat

                Long id = (Long) plate.get("id");
                String description = (String) plate.get("description");
                       
                list_Plate.add(new Dish(id,description));

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return list_Plate;

    }
    
    public ArrayList readDessert() {

        JSONParser j3 = new JSONParser();

        ArrayList list_Desserts = new ArrayList();

        try {
            JSONObject jsonO = (JSONObject) j3.parse(new FileReader("/Users/sarkissian/Downloads/restaurant_exemple_menu.json"));

            JSONArray desserts = (JSONArray) jsonO.get("desserts"); //cherche la liste dessert
            

            Iterator<JSONObject> dessertList = desserts.iterator();
            while (dessertList.hasNext()) {
                
                JSONObject plate = dessertList.next();//premier dessert

                Long id = (Long) plate.get("id");
                String description = (String) plate.get("description");

                list_Desserts.add(new Dish(id,description));

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return list_Desserts;

    }
}

