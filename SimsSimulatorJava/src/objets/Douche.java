package objets;

import java.util.LinkedList;

public class Douche extends Objet {
    
    public Douche(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("Allumer l'eau");    //Ajout des Actions de Bases de la douche
       actions.add("Eteindre l'eau");
       actions.add("Augmenter la temperature");
       actions.add("Diminuer la temperature");
       actions.add("Entrer dans la douche");
       actions.add("Sortir de la douche");

    }
}