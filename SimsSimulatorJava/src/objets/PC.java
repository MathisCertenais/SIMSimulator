package objets;

import java.util.LinkedList;

public class PC extends Objet {
    
    public PC(){
       super("PC", "éteint");
       actions.add("Allumer le PC");    //Ajout des Actions de Bases de le PC
       actions.add("Eteindre le PC");
    }
}