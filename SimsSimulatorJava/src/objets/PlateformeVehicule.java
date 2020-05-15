package objets;

import java.util.LinkedList;

public class PlateformeVehicule extends Objet {
    
    public PlateformeVehicule(){
       super("Platforme à vehicule", "operationnel");
       actions.add("Choisir une voiture");    //Ajout des Actions de Bases de la plateforme a vehicule
       actions.add("Utiliser la plateforme a vehicule");
    }
}