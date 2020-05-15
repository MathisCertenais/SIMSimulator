package objets;

public class FerARepasser extends Objet {
    
    public FerARepasser(){
       super("Fer a repasser","eteint");
       actions.add("allumer le fer a repasser");    //Ajout des Actions de Bases de le fer a repasser
       actions.add("utiliser le fer a repasser"); 
       actions.add("eteindre le fer a repasser"); 
    }
}