package pieces;

import java.util.ArrayList;
import java.util.LinkedList;

import objets.Objet;

public class Ascenseur extends Piece {

    public Ascenseur(String nom, LinkedList<Piece> piece_Ajacent, ArrayList<Objet> list_objet) {
        super(nom, piece_Ajacent, list_objet);
    }
    
}