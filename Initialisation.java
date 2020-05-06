import java.util.ArrayList;
import java.util.LinkedList;

public class Initialisation {

public Maison initialiser() {
    //objets de la maison
    Objet camera ;
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
     LinkedList<Piece> piece_rdc = new LinkedList<Piece>();
     piece_rdc.add(sejour);

    //Liste étage 

    LinkedList<Etage> liste_etages = new LinkedList<Etage>();
    liste_etages.add(rez_de_chaussee);
    Maison maMaison = new Maison(liste_etages);

    return maMaison;
}



}