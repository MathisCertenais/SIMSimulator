package pieces;

import java.util.ArrayList;
import java.util.LinkedList;

import objets.Objet;

public class Salon extends Piece {

    public Salon(String nom, LinkedList<Piece> piece_Ajacent, ArrayList<Objet> list_objet) {
        super(nom, piece_Ajacent, list_objet);
    }
    
}