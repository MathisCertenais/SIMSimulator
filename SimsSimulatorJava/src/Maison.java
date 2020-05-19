
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
        heure = 8.5;

    }

    public void setEtage(Etage etage_actuel) {
        if (liste_etages.contains(etage_actuel)) {
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

    public String toString(){
        String j;
        String h;
        String m;
        if(this.jour) j = "jour";
        else j = "nuit";
        h = "" + (this.heure - this.heure%1);
        m = "" + this.heure%1;
        return("Vous êtes dans la pièce " + this.memory_piece.getNom() + " à l'étage "
            + this.memory_etage.getNom() + ", il est " + h + ":" + m + " et il fait " + j);
    }
}
