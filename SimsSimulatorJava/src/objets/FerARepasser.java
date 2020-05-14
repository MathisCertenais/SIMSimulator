package objets;

import java.util.LinkedList;

public class FerARepasser extends Objet {
    
    public FerARepasser(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("allumer le fer a repasser");    //Ajout des Actions de Bases de le fer a repasser
       actions.add("utiliser le fer a repasser"); 
       actions.add("eteindre le fer a repasser"); 
    }
}