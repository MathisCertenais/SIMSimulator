package objets;

public class StoreConnecte extends Objet {
    
    public StoreConnecte(){
        super("Store connecté","Ouvert");
        actions.add("Ouvrir le store connecte");    //Ajout des Actions de Bases de le store connecte
        actions.add("Fermer le store connecte");
    }
}