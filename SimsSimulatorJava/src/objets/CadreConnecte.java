package objets;


public class CadreConnecte extends Objet {
    
    public CadreConnecte(){
       super("Cadre Connecte","actif");
       actions.add("Changer de photo");    //Ajout des Actions de Bases pour le cadre connecte
       actions.add("Regarder la photo");
    }
}