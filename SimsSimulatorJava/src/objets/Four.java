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
                System.out.println("Le four est deja allumé");
            } else {
                this.etat = "allume";
                System.out.println("Vous allumez le four");
            }
        } else if (c == 1) {
            if (this.etat == "eteint") {
                System.out.println("Pour utiliser le four il faut d'abord l'allumer");
            } else {
                this.etat = "allume";
                System.out.println("Vous utilisez le four");
            }
        } 
        else if (c == 2) {
            if (this.etat == "eteint") {
                System.out.println("Le four est déja eteint");
            } else {
                this.etat = "eteindre";
                System.out.println("Vous eteignez le four");
            }
        }else {
            System.out.println("Il ne se passe rien");
        }
    }
}