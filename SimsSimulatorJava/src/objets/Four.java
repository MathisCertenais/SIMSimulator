package objets;


public class Four extends Objet {
    
    public Four(){
       super("Four","eteint");
       actions.add("allumer le four");    //Ajout des Actions de Bases de le four
       actions.add("utiliser le four"); 
       actions.add("eteindre le four"); 
    }
}