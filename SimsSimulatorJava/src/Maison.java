

import java.util.LinkedList;

import etages.Etage;
import pieces.Piece;

public class Maison {

    private LinkedList<Etage> liste_etages = new LinkedList<Etage>();
    private Etage memory_etage;
    private Piece memory_piece;
    //Liste_etages.add(sous_sol);
    //Liste_etages.add(rez_de_chaussee);
    //Liste_etages.add(premier_etage);
    //Liste_etages.add(toit);

    public Maison(LinkedList<Etage> liste_etages) {
        this.liste_etages = liste_etages;
        
    }

    public void setEtage(Etage etage_actuel){
        if (liste_etages.contains(etage_actuel)){
            memory_etage = etage_actuel;
        }
        System.out.println("Impossible, l'étage n'existe pas");
    }

    public void setPiece(Piece piece_actuel){
        if (memory_etage.getAllPiece().contains(piece_actuel)){
            memory_piece = piece_actuel;
        }
        System.out.println("Impossible, la piece n'existe pas");
    }

    public Piece getPiece(){
        return memory_piece;
    }

    public Etage getEtage(){
        return memory_etage;
    }
}
