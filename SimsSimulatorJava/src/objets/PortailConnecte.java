package objets;

import java.util.LinkedList;

public class PortailConnecte extends Objet {
    
    public PortailConnecte(){
       super("Portail", "fermé");
       actions.add("Ouvrir le portail connecter");    //Ajout des Actions de Bases de le portail connecter
       actions.add("Fermer le portail connecter");
    }
}