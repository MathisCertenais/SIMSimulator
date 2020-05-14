package objets;

import java.util.LinkedList;

public class MiroirConnecte extends Objet {
    
    public MiroirConnecte(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("utiliser le Miroir connecte");    //Ajout des Actions de Bases de le Miroir connecte
       actions.add("Changer la luminosité du miroir connecte");    
    }
}