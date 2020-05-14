package pieces;

import java.util.ArrayList;
import java.util.LinkedList;

import objets.Objet;

public class EmplacementVehiculeAerien extends Piece {

    public EmplacementVehiculeAerien(String nom, LinkedList<Piece> piece_Ajacent, ArrayList<Objet> list_objet) {
        super(nom, piece_Ajacent, list_objet);
    }
    
}