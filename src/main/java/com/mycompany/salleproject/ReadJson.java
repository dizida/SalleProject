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

        ArrayList list_entree = new ArrayList();

        try {
            JSONObject jsonO = (JSONObject) j1.parse(new FileReader("/Users/sarkissian/Downloads/restaurant_exemple_menu.json"));

            JSONArray starters = (JSONArray) jsonO.get("starters"); //cherche la liste starters
            System.out.println(starters);

            Iterator<JSONObject> startersList = starters.iterator();
            while (startersList.hasNext()) {
                JSONObject entree = startersList.next();//première entrée

                Long id = (Long) entree.get("id");
                String description = (String) entree.get("description");

                list_entree.add(description);

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
    
    public ArrayList readPlate() {

        JSONParser j2 = new JSONParser();

        ArrayList list_Plate = new ArrayList();

        try {
            JSONObject jsonO = (JSONObject) j2.parse(new FileReader("/Users/sarkissian/Downloads/restaurant_exemple_menu.json"));

            JSONArray main_courses = (JSONArray) jsonO.get("main_courses"); //cherche la liste plats
            System.out.println(main_courses);

            Iterator<JSONObject> startersList = main_courses.iterator();
            while (startersList.hasNext()) {
                
                JSONObject plate = startersList.next();//première entrée

                Long id = (Long) plate.get("id");
                String description = (String) plate.get("description");

                list_Plate.add(description);

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

            JSONArray desserts = (JSONArray) jsonO.get("desserts"); //cherche la liste plats
            System.out.println(desserts);

            Iterator<JSONObject> startersList = desserts.iterator();
            while (startersList.hasNext()) {
                
                JSONObject plate = startersList.next();//première entrée

                Long id = (Long) plate.get("id");
                String description = (String) plate.get("description");

                list_Desserts.add(description);

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

