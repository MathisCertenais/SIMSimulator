package objets;

import java.util.LinkedList;

public class EnceinteConnecte extends Objet {
    
    public EnceinteConnecte(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("Allumer l'enceinte");    //Ajout des Actions de Bases de l'enceinte connecté
       actions.add("Eteindre l'Enceinte");
       actions.add("Changer de musique");
       actions.add("Augmenter le volume");
       actions.add("Diminuer le volume");
    }
}