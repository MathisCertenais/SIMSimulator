package objets;


public class EnceinteConnecte extends Objet {
    
    public EnceinteConnecte(){
       super("Enceinte connecte","eteint");
       actions.add("Allumer l'enceinte");    //Ajout des Actions de Bases de l'enceinte connecté
       actions.add("Eteindre l'Enceinte");
       actions.add("Changer de musique");
       actions.add("Augmenter le volume");
       actions.add("Diminuer le volume");
    }
}