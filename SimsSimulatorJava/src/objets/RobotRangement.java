package objets;

import java.util.LinkedList;

public class RobotRangement extends Objet {
    
    public RobotRangement(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("Activer le robot rangement");    //Ajout des Actions de Bases de le robot rangement
       actions.add("Desactiver le robot rangement");
    }
}