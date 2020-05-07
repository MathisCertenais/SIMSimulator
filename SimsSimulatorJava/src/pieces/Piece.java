package SimsSimulatorJava.src.pieces;

import SimsSimulatorJava.src.objets.*;

import java.util.ArrayList;
import java.util.LinkedList;

public abstract class Piece {
    // Attributs de la Pièce
    String nom;
    LinkedList<Piece> piece_Ajacente;
    ArrayList<Objet> list_objets;  

    public Piece(String nom, LinkedList<Piece> piece_Ajacent,ArrayList<Objet> list_objet) {
        this.nom = nom;
        this.piece_Ajacente =  piece_Ajacent;
        this.list_objets =  list_objet;
    }

    public String getNom(){
        return this.nom;
    }

    public LinkedList<Piece> getpiece_Ajacent(){
        return  this.piece_Ajacente;
    }
    public ArrayList<Objet> getlist_objet(){
        return  this.list_objets;
    }

    public void ajouterPiece_Adj(Piece p){
        this.piece_Ajacente.add(p);
    }
}