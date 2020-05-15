package objets;


public class Fenetre extends Objet {
    
    public Fenetre(){
       super("Fenetre","Ferme");
       actions.add("Ouvrir la fenêtre");    //Ajout des Actions de Bases de la fenêtre
       actions.add("Fermer la fenêtre");
    }

    
}