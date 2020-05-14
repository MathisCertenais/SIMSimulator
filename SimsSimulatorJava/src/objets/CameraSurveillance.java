package objets;

import java.util.LinkedList;

public class CameraSurveillance extends Objet {
    
    public CameraSurveillance(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("Regarder les enregistrements");    //Ajout des Actions de Bases pour la camera
    }
}