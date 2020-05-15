package objets;


public class Four extends Objet {
    
    public Four(){
       super("Four","eteint");
       actions.add("allumer le four");    //Ajout des Actions de Bases de le four
       actions.add("utiliser le four"); 
       actions.add("eteindre le four"); 
    }

    @Override
    public void realiserAction(int c) {
        if (c == 0) {
            if (this.etat == "allume") {
                System.out.println("Le four est deja allume");
            } else {
                this.etat = "allume";
                System.out.println("Vous allume le four");
            }
        } else if (c == 1) {
            if (this.etat == "eteint") {
                System.out.println("Pour utiliser le four il faut d'abord l'allumer");
            } else {
                this.etat = "allumer";
                System.out.println("Vous utiliser le four");
            }
        } 
        else if (c == 2) {
            if (this.etat == "eteint") {
                System.out.println("Le four est deja eteint");
            } else {
                this.etat = "eteindre";
                System.out.println("Vous eteigner le four");
            }
        }else {
            System.out.println("Il ne se passe rien");
        }
    }
}