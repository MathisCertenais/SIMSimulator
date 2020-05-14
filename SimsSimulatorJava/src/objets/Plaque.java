package objets;

import java.util.LinkedList;

public class Plaque extends Objet {
    
    public Plaque(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("Allumer la plaque");    //Ajout des Actions de Bases de la plaque
       actions.add("Eteindre la plaque");
       actions.add("Augmenter la puissance de la plaque");    
       actions.add("Diminuer la puissance de la plaque");
    }
}