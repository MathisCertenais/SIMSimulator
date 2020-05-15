package objets;

public class Tele extends Objet {
    
    public Tele(){
        super("Tele", "Allumé");
       actions.add("Allumer la tele");    //Ajout des Actions de Bases de la tele
       actions.add("Eteindre la tele");
       actions.add("Changer de chaine sur la tele");
    }
}
