
import java.util.ArrayList;
import java.util.LinkedList;

import etages.Etage;
import etages.RDC;
import objets.Objet;
import pieces.AccesGarage;
import pieces.Cuisine;
import pieces.Exterieur;
import pieces.HomeCinema;
import pieces.Piece;
import pieces.SalleMultiGaming;
import pieces.Sejour;

public class Initialisation {

public static Maison initialiser() {
    //objets de la maison
    LinkedList<String> actions = new LinkedList<String>() ;
    Objet camera ;

    Objet lecteur_empreinte;
    Objet sonnette;

    //Objet pièce sous-sol
    Piece emplacement_voitures;
    Piece ascenseur_vehicule;
    Piece ascenseur_sous_sol;
    Piece serveur;
    Piece cave_a_vin;
    //Objet pièce rez-de-chaussee
    Piece exterieurAccueil;
    Piece sejour;
    Piece accesGarage;
    Piece cuisine;
    Piece homeCinema;
    Piece salleMultiGaming;
    Piece bureau;
    Piece chambre;
    Piece Salle_de_bain; 
    Piece toilette;
    Piece ascenseur_rdc;
    //Objet pièce 1er étage
    Piece chambre_enfant_1;
    Piece chambre_enfant_2;
    Piece salon;
    Piece chambre_amis_1;
    Piece chambre_amis_2;
    Piece buanderie;
    Piece SDB_Etage;
    Piece ascenseur_1etage;
    //Objet pièce toit
    Piece emplacement_véhicule_aerien;
    Piece potager_hydroponique;
    Piece entrepos_colis;
    Piece panneaux_photovoltaique;
    Piece ascenseur_toit;
    

    /************-------------------REZ-DE-CHAUSSEE---------------------------********/
    // pièce séjour
    LinkedList<Piece> piece_Adjacent_sejour= new LinkedList<Piece>();
    ArrayList<Objet> objets_sejour = new ArrayList<Objet>();
    //objets_exterieur_sejour.add(camera);
    sejour = new Sejour("Sejour",piece_Adjacent_sejour,objets_sejour);

    // pièce extérieure
    LinkedList<Piece> piece_Adjacent_exterieurAccueil = new LinkedList<Piece>();
    piece_Adjacent_exterieurAccueil.add(sejour);
    ArrayList<Objet> objets_exterieurAccueil = new ArrayList<Objet>();
    //objets_exterieurAccueil.add(camera);
    //objets_exterieurAccueil.add(lecteur_empreinte);
    //objets_exterieurAccueil.add(sonnette);
    exterieurAccueil = new Exterieur("Exterieur",piece_Adjacent_exterieurAccueil,objets_exterieurAccueil);
    sejour.ajouterPiece_Adj(exterieurAccueil);
    
    // pièce cuisine
    LinkedList<Piece> piece_Adjacent_cuisine = new LinkedList<Piece>();
    piece_Adjacent_cuisine.add(sejour);
    ArrayList<Objet> objets_cuisine = new ArrayList<Objet>();
    //
    cuisine = new Cuisine("Cuisine",piece_Adjacent_cuisine,objets_cuisine);
    sejour.ajouterPiece_Adj(cuisine);

    //pièce home cinéma 
    LinkedList<Piece> piece_Adjacent_homeCinema = new LinkedList<Piece>();
    piece_Adjacent_homeCinema.add(sejour);
    piece_Adjacent_homeCinema.add(cuisine);
    ArrayList<Objet> objets_homeCinema = new ArrayList<Objet>();
    //
    homeCinema = new HomeCinema("Home_Cinema",piece_Adjacent_homeCinema,objets_homeCinema);
    cuisine.ajouterPiece_Adj(homeCinema);
    sejour.ajouterPiece_Adj(homeCinema);

    //pièce acces garage 
    LinkedList<Piece> piece_Adjacent_acces_garage = new LinkedList<Piece>();
    piece_Adjacent_acces_garage.add(sejour);
    piece_Adjacent_acces_garage.add(cuisine);
    //piece_Adjacent_acces_garage.add(exterieurAccueil);
    ArrayList<Objet> objets_acces_garage = new ArrayList<Objet>();
    //
    accesGarage = new AccesGarage("Acces_Garage",piece_Adjacent_acces_garage,objets_acces_garage);
    cuisine.ajouterPiece_Adj(accesGarage);
    sejour.ajouterPiece_Adj(accesGarage);

    //pièce multi-gaming 
    LinkedList<Piece> piece_Adjacent_multi_gaming = new LinkedList<Piece>();
    piece_Adjacent_multi_gaming.add(homeCinema);
    piece_Adjacent_multi_gaming.add(sejour);
    ArrayList<Objet> objets_multi_gaming = new ArrayList<Objet>();
    //
    salleMultiGaming = new SalleMultiGaming("Salle_multi_gaming",piece_Adjacent_multi_gaming,objets_multi_gaming);
    homeCinema.ajouterPiece_Adj(salleMultiGaming);
    sejour.ajouterPiece_Adj(salleMultiGaming);

    //pièce toilette 
    LinkedList<Piece> piece_Adjacent_toilette = new LinkedList<Piece>();
    piece_Adjacent_toilette.add(salleMultiGaming);
    piece_Adjacent_toilette.add(sejour);
    ArrayList<Objet> objets_toilette = new ArrayList<Objet>();
    //
    toilette = new AccesGarage("toilette",piece_Adjacent_toilette,objets_toilette);
    salleMultiGaming.ajouterPiece_Adj(toilette);
    sejour.ajouterPiece_Adj(toilette);  

    //pièce Salle de bain
    LinkedList<Piece> piece_Adjacent_SDB = new LinkedList<Piece>();
    piece_Adjacent_SDB.add(salleMultiGaming);
    ArrayList<Objet> objets_SDB = new ArrayList<Objet>();
    //
    Salle_de_bain = new AccesGarage("Salle_de_bain",piece_Adjacent_SDB,objets_SDB);
    salleMultiGaming.ajouterPiece_Adj(Salle_de_bain);

    //pièce chambre
    LinkedList<Piece> piece_Adjacent_Chambre = new LinkedList<Piece>();
    piece_Adjacent_Chambre.add(salleMultiGaming);
    piece_Adjacent_Chambre.add(Salle_de_bain);
    piece_Adjacent_Chambre.add(sejour);
    ArrayList<Objet> objets_chambre = new ArrayList<Objet>();
    //
    chambre = new AccesGarage("Salle_de_bain",piece_Adjacent_Chambre,objets_chambre);
    salleMultiGaming.ajouterPiece_Adj(chambre);
    Salle_de_bain.ajouterPiece_Adj(chambre);
    sejour.ajouterPiece_Adj(chambre);

    //pièce bureau
    LinkedList<Piece> piece_Adjacent_bureau = new LinkedList<Piece>();
    piece_Adjacent_bureau.add(chambre);
    piece_Adjacent_bureau.add(sejour);
    ArrayList<Objet> objets_bureau = new ArrayList<Objet>();
    //
    bureau = new AccesGarage("Salle_de_bain",piece_Adjacent_bureau,objets_bureau);
    chambre.ajouterPiece_Adj(sejour);
    sejour.ajouterPiece_Adj(sejour);

    /************-----------------FIN--REZ-DE-CHAUSSEE---------------------------********/


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