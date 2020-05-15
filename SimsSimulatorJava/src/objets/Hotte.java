package objets;


public class Hotte extends Objet {
    
    public Hotte(){
       super("Hotte","eteint");
       actions.add("Allumer le hotte");    //Ajout des Actions de Bases de le hotte
       actions.add("Eteindre le hotte"); 
    }
}