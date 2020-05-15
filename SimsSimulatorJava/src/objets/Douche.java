package objets;


public class Douche extends Objet {
    
    public Douche(){
       super("Douche","disponible");
       actions.add("Allumer l'eau");    //Ajout des Actions de Bases de la douche
       actions.add("Eteindre l'eau");
       actions.add("Augmenter la temperature");
       actions.add("Diminuer la temperature");
       actions.add("Entrer dans la douche");
       actions.add("Sortir de la douche");

    }
}