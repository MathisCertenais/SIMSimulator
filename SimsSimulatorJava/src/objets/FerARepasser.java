package objets;

public class FerARepasser extends Objet {
    
    public FerARepasser(){
       super("Fer a repasser","allume");
       actions.add("allumer le fer a repasser");    //Ajout des Actions de Bases de le fer a repasser
       actions.add("utiliser le fer a repasser"); 
       actions.add("eteindre le fer a repasser"); 
    }
    @Override
    public void realiserAction(int c) {
        if (c == 0) {
            if (this.etat == "allume") {
                System.out.println("Le fer a repasser est déja allumé");
            } else {
                this.etat = "allume";
                System.out.println("Vous allumez le fer a repasser");
            }
        } else if (c == 1) {
            if (this.etat == "eteint") {
                System.out.println("Pour utiliser le fer a repasser il faut d'abord l'allumer");
            } else {
                this.etat = "allumer";
                System.out.println("Vous utilisez le fer a repasser");
            }
        } 
        else if (c == 2) {
            if (this.etat == "eteint") {
                System.out.println("Le fer a repasser est déja eteint");
            } else {
                this.etat = "eteindre";
                System.out.println("Vous eteignez le fer a repasser");
            }
        }else {
            System.out.println("Il ne se passe rien");
        }
    }
}