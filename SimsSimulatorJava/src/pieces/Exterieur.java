package pieces;

import java.util.ArrayList;
import java.util.LinkedList;

import objets.Objet;

public class Exterieur extends Piece {
    
    public Exterieur(String nom, LinkedList<Piece> Piece_Ajacent,ArrayList<Objet> list_objet) {
        super(nom, Piece_Ajacent,list_objet);
    }

}