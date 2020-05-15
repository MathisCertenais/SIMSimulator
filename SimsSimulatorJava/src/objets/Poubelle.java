package objets;

import java.util.LinkedList;

public class Poubelle extends Objet {
    
    public Poubelle(){
       super("Poubelle", "fermée");
       actions.add("Ouvrir la poubelle");    //Ajout des Actions de Bases de la poubelle
       actions.add("Fermer la poubelle");
    }
}