package objets;

import java.util.LinkedList;

public class LaveVaisselle extends Objet {
    
    public LaveVaisselle(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("utiliser le Lave Vaisselle");    //Ajout des Actions de Bases de le Lave Vaisselle
       actions.add("Vider le Lave Vaisselle");    
    }
}