package objets;

import java.util.LinkedList;

public class StoreConnecte extends Objet {
    
    public StoreConnecte(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("Ouvrir le store connecte");    //Ajout des Actions de Bases de le store connecte
       actions.add("Fermer le store connecte");
    }
}