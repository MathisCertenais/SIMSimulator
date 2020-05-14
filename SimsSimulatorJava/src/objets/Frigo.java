package objets;

import java.util.LinkedList;

public class Frigo extends Objet {
    
    public Frigo(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("Ouvrir le frigo");    //Ajout des Actions de Bases de le frigo
       actions.add("Fermer le frigo"); 
      
    }
}