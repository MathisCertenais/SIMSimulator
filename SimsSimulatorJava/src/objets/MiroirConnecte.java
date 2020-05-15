package objets;


public class MiroirConnecte extends Objet {
    
    public MiroirConnecte(){
       super("Miroir connecte","inactif");
       actions.add("utiliser le Miroir connecte");    //Ajout des Actions de Bases de le Miroir connecte
       actions.add("Changer la luminosité du miroir connecte");    
    }
}