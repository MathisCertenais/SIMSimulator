package SimsSimulatorJava.src.pieces;

import SimsSimulatorJava.src.objets.*;

import java.util.LinkedList;
import java.util.ArrayList;

public class Chambre extends Piece{

    public Chambre(String nom, LinkedList<Piece> Piece_Ajacent,ArrayList<Objet> list_objet){
        super(nom, Piece_Ajacent, list_objet);
    }
}