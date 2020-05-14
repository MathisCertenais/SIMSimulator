package objets;

import java.util.LinkedList;

public class PortailConnecte extends Objet {
    
    public PortailConnecte(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("Ouvrir le portail connecter");    //Ajout des Actions de Bases de le portail connecter
       actions.add("Fermer le portail connecter");
    }
}