package objets;

import java.util.Scanner;

public class Tele extends Objet {

    private int chaine;

    public Tele() {
        super("Tele", "éteinte");
        actions.add("Allumer la tele"); // Ajout des Actions de Bases de la tele
        actions.add("Eteindre la tele");
        actions.add("Changer de chaine sur la tele");
        this.chaine = 1;
    }

    @Override
    public void realiserAction(int c) {
        if (c == 0) {
            if (this.etat == "allumée") {
                System.out.println("La télévision est déjà allumée");
            } else {
                this.etat = "allumée";
                System.out.println("La télévision s'allume");
            }
        } else if (c == 1) {
            if (this.etat == "éteinte") {
                System.out.println("La télévision est déjà éteinte");
            } else {
                this.etat = "éteinte";
                System.out.println("La télévision s'éteint");
            }
        } else if (c == 2 && this.etat == "allumée") {
            Scanner scan = new Scanner(System.in);
            System.out.print("Tapez la chaine que vous souhaitez : ");
            int nbChaine = scan.nextInt();
            this.chaine = nbChaine;
            System.out.println("Vous changez de chaine");
        } else {
            System.out.println("Il ne se passe rien");
        }

    }

    @Override
    public String toString() {
        if (etat == "allumée") {
            return ("La télévision est allumé sur la chaine " + chaine);
        } else {
            return ("La télévision est éteinte");
        }
    }
}
