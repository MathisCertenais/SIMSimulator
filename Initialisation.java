import java.util.ArrayList;
import java.util.LinkedList;

public class Initialisation {

public Maison initialiser() {
    //objets de la maison
    LinkedList<String> actions = new LinkedList<String>() ;
    Objet camera = new Objet("Caméra de surveillance","non_utilisé",actions);

    Objet lecteur_empreinte;
    Objet sonnette;

    Piece sejour;
    Piece exterieurAccueil;

    // pièce extérieure
    LinkedList<Piece> piece_Ajacent_exterieurAccueil = new LinkedList<Piece>();
    piece_Ajacent_exterieurAccueil.add(sejour);
    ArrayList<Objet> objets_exterieurAccueil = new ArrayList<Objet>();
    objets_exterieurAccueil.add(camera);
    objets_exterieurAccueil.add(lecteur_empreinte);
    objets_exterieurAccueil.add(sonnette);
    exterieurAccueil = new Exterieur(piece_Ajacent_exterieurAccueil,objets_exterieurAccueil);

    // pièce séjour
    LinkedList<Piece> piece_Ajacent_sejour= new LinkedList<Piece>();
    piece_Ajacent_sejour.add(exterieurAccueil);
    ArrayList<Objet> objets_exterieur_sejour = new ArrayList<Objet>();
    objets_exterieur_sejour.add(camera);
    sejour = new Sejour(piece_Ajacent_sejour,objets_exterieur_sejour);

     //liste pièce rez_de_chaussee
     LinkedList<Piece> pieces_rdc = new LinkedList<Piece>();
     pieces_rdc.add(sejour);
     pieces_rdc.add(sejour);

     //Etage rez_de_chaussee
     Etage rdc = new RDC(pieces_rdc);
    
     //Liste étage 
     LinkedList<Etage> liste_etages = new LinkedList<Etage>();
     liste_etages.add(rdc);

     Maison maMaison = new Maison(liste_etages);

    return maMaison;
}



}