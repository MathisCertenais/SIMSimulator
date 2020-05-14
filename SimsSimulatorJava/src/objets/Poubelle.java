package objets;

import java.util.LinkedList;

public class Poubelle extends Objet {
    
    public Poubelle(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("Ouvrir la poubelle");    //Ajout des Actions de Bases de la poubelle
       actions.add("Fermer la poubelle");
    }
}