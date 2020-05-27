package maison;

import java.util.LinkedList;

import etages.Etage;
import pieces.Piece;

public class Maison {

    private LinkedList<Etage> liste_etages = new LinkedList<Etage>();
    private Etage memory_etage;
    private Piece memory_piece;
    private boolean jour;
    private double heure;

    public Maison(LinkedList<Etage> liste_etages) {
        this.liste_etages = liste_etages;
        jour = true;
        heure = 15.5;

    }

    public void setEtage(Etage etage_actuel) {
        if (memory_etage == etage_actuel) {
            System.out.println("Vous y êtes déjà");
        } else if (liste_etages.contains(etage_actuel)) {
            memory_etage = etage_actuel;
        } else {
            System.out.println("Impossible, l'étage n'existe pas");
        }
    }

    public void setPiece(Piece piece_actuel) {
        if (memory_etage.getAllPiece().contains(piece_actuel)) {
            memory_piece = piece_actuel;
        } else {
            System.out.println("Impossible, la piece n'existe pas");
        }
    }

    public Piece getPiece() {
        return memory_piece;
    }

    public Etage getEtage() {
        return memory_etage;
    }

    public LinkedList<Etage> getAllEtage() {
        return liste_etages;
    }

    public boolean getJour(){
        return jour;
    }

    public void checkJour() {
        if (heure > 20 || heure < 6) {
            jour = false;
        } else
            jour = true;
    }

    public void passageTps(double t) {
        this.heure = this.heure + t;
        if (this.heure >= 24) {
            this.heure = this.heure - 24;
        }
    }

    public String toString() {
        String j;
        String h;
        String m;
        if (this.jour)
            j = "jour";
        else
            j = "nuit";
        h = "" + (int) (this.heure - this.heure % 1);
        m = "" + (int) ((this.heure % 1) * 60);
        return ("Vous êtes dans la pièce " + this.memory_piece.getNom() + " à l'étage " + this.memory_etage.getNom()
                + ", il est " + h + "h" + m + " et il fait " + j);
    }
}
