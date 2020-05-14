package objets;

import java.util.LinkedList;

public class RobotTracteur extends Objet {
    
    public RobotTracteur(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("Activer le robot tracteur");    //Ajout des Actions de Bases de le robot tracteur
       actions.add("Desactiver le robot tracteur");
    }
}