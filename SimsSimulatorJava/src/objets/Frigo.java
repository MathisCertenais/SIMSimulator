package objets;


public class Frigo extends Objet {
    
    public Frigo(){
       super("Frigo","Ferme");
       actions.add("Ouvrir le frigo");    //Ajout des Actions de Bases de le frigo
       actions.add("Fermer le frigo"); 
      
    }
}