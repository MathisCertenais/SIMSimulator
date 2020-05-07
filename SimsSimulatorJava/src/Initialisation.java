package SimsSimulatorJava.src;

import SimsSimulatorJava.src.pieces.*;
import SimsSimulatorJava.src.objets.*;
import SimsSimulatorJava.src.etages.*;

import java.util.ArrayList;
import java.util.LinkedList;

public class Initialisation {

public static Maison initialiser() {
    //objets de la maison
    LinkedList<String> actions = new LinkedList<String>() ;
    Objet camera ;

    Objet lecteur_empreinte;
    Objet sonnette;

    Piece sejour;
    Piece exterieurAccueil;
    // pièce séjour
    LinkedList<Piece> piece_Ajacent_sejour= new LinkedList<Piece>();
    ArrayList<Objet> objets_exterieur_sejour = new ArrayList<Objet>();
    //objets_exterieur_sejour.add(camera);
    sejour = new Sejour("Sejour",piece_Ajacent_sejour,objets_exterieur_sejour);

    // pièce extérieure
    LinkedList<Piece> piece_Ajacent_exterieurAccueil = new LinkedList<Piece>();
    piece_Ajacent_exterieurAccueil.add(sejour);
    ArrayList<Objet> objets_exterieurAccueil = new ArrayList<Objet>();
    //objets_exterieurAccueil.add(camera);
    //objets_exterieurAccueil.add(lecteur_empreinte);
    //objets_exterieurAccueil.add(sonnette);
    exterieurAccueil = new Exterieur("Exterieur",piece_Ajacent_exterieurAccueil,objets_exterieurAccueil);
    sejour.ajouterPiece_Adj(exterieurAccueil);
    

     //liste pièce rez_de_chaussee
     LinkedList<Piece> pieces_rdc = new LinkedList<Piece>();
     pieces_rdc.add(sejour);
     pieces_rdc.add(sejour);

     //Etage rez_de_chaussee
     Etage rdc = new RDC("rez_de_chausee",pieces_rdc);
    
     //Liste étage 
     LinkedList<Etage> liste_etages = new LinkedList<Etage>();
     liste_etages.add(rdc);

     Maison maMaison = new Maison(liste_etages);
     maMaison.setEtage(rdc);
     maMaison.setPiece(exterieurAccueil);

    return maMaison;
}



}