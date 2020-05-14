package objets;

import java.util.LinkedList;

public class Fenetre extends Objet {
    
    public Fenetre(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("Ouvrir la fenêtre");    //Ajout des Actions de Bases de la fenêtre
       actions.add("Fermer la fenêtre");
    }

    
}