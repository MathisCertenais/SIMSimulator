package objets;


public class Hotte extends Objet {
    
    public Hotte(){
       super("Hotte","eteint");
       actions.add("Allumer le hotte");    //Ajout des Actions de Bases de le hotte
       actions.add("Eteindre le hotte"); 
    }

    @Override
    public void realiserAction(int c) {
        if (c == 0) {
            if (this.etat == "allume") {
                System.out.println("La hotte est deja Allume");
            } else {
                this.etat = "allume";
                System.out.println("Vous allume la hotte");
            }
        } else if (c == 0) {
            if (this.etat == "eteint") {
                System.out.println("la hotte est deja eteint");
            } else {
                this.etat = "eteint";
                System.out.println("vous eteigner la hotte");
            }
        }   else {
            System.out.println("Il ne se passe rien");
        }
    }
}