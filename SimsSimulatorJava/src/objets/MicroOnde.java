package objets;

import java.util.LinkedList;

public class MicroOnde extends Objet {
    
    public MicroOnde(String nom, String etat, LinkedList<String> actions){
       super(nom,etat,actions);
       actions.add("allumer le micro-onde");    //Ajout des Actions de Bases de le micro-onde
       actions.add("eteindre le micro_onde");  
    }
}