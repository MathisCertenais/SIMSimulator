package objets;

import java.util.LinkedList;

public class AspirateurAutonome extends Objet {
    
    public AspirateurAutonome(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("Demarrer l'aspirateur");            //Ajout des Actions de Bases pour l'aspirateur
       actions.add("Arreter l'aspirateur"); 
    }
}