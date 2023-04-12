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

        //permettra d'analyser le texte de mon fichier
        JSONParser j1 = new JSONParser(); 

        //Création d'une arraylist qui sera lu et ajouté dans mes Jlabel titre
        ArrayList list_entree = new ArrayList(); 

        try {
            //File rider va trouver mon fichier stocké dans mon répertoire
            JSONObject jsonO = (JSONObject) j1.parse(new FileReader("menu.json"));// "menu.json"

            // Récupère la valeur associé à la clé starter et la convertie en json array
            JSONArray starters = (JSONArray) jsonO.get("starters"); //cherche la liste starters
            
            // Création d'un objet iterator de type jsonobjet permettant de parcourir les éléments 
            Iterator<JSONObject> startersList = starters.iterator(); 
            
            // On parcourt notre tableau de starters tant que hasNext renvoie true la boucle continue
            while (startersList.hasNext()) {
                
                
                JSONObject entree = startersList.next();

                //récupère l'id de mon entrée
                Long id = (Long) entree.get("id");
                
                // récupère description de mon entrée
                String description = (String) entree.get("description");

                //Création d'un nouveau plat avec son id et sa description 
                list_entree.add(new Dish(id,description));

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
            JSONObject jsonO = (JSONObject) j2.parse(new FileReader("menu.json"));

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
            JSONObject jsonO = (JSONObject) j3.parse(new FileReader("menu.json"));

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

