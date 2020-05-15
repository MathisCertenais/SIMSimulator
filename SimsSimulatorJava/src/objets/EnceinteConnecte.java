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

    public void realiserAction(int c) {
        if (c == 0) {
            if (this.etat == "allume") {
                System.out.println("L'enceinte est deja allume");
            } else {
                this.etat = "allume";
                System.out.println("Vous allume l'enceinte");
            }
        }
        else if (c == 1) {
            if (this.etat == "eteint") {
                System.out.println("l'enceinte est deja eteinte");
            } else {
                this.etat = "eteint";
                System.out.println("Vous eteigner l'enceinte");
            }
        } else if (c == 2) {
            if (this.etat == "eteint") {
                System.out.println("Pour changer de musique il faut d'abord allume l'enceinte");
            } else {
                this.etat = "allume";
                System.out.println("Vous changer de musique");
            }
        }else if (c == 3) {
                if (this.etat == "eteint") {
                    System.out.println("Pour augmenter le volume il faut d'abord allume l'enceinte");
                } else {
                    this.etat = "allume";
                    System.out.println("Vous augmenter le volume");
                }
            }
            else if (c == 4) {
                if (this.etat == "eteint") {
                    System.out.println("Pour diminuer le volume il faut d'abord allume l'enceinte");
                } else {
                    this.etat = "allume";
                    System.out.println("Vous diminuer le volume");
                }
            }else {
            System.out.println("Il ne se passe rien");
        }
    }
}