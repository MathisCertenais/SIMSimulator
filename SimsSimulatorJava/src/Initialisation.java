
import java.util.ArrayList;
import java.util.LinkedList;

import etages.Etage;
import etages.RDC;
import objets.Objet;
import pieces.AccesGarage;
import pieces.AscenseurVehicule;
import pieces.Buanderie;
import pieces.CaveAVin;
import pieces.Chambre;
import pieces.Cuisine;
import pieces.EmplacementVehiculeAerien;
import pieces.EntrepotColis;
import pieces.Exterieur;
import pieces.Garage;
import pieces.HomeCinema;
import pieces.Piece;
import pieces.PotagerHydroponique;
import pieces.SDB;
import pieces.SalleMultiGaming;
import pieces.SalleServeur;
import pieces.Salon;
import pieces.Sejour;
import pieces.ZonePanneauPhotovoltaique;

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
    Piece salle_de_bain; 
    Piece toilette;
    Piece ascenseur_rdc;
    //Objet pièce 1er étage
    Piece chambre_enfant_1;
    Piece chambre_enfant_2;
    Piece salon;
    Piece chambre_amis_1;
    Piece chambre_amis_2;
    Piece buanderie;
    Piece sdb_Etage;
    Piece ascenseur_1etage;
    //Objet pièce toit
    Piece emplacement_véhicule_aerien;
    Piece potager_hydroponique;
    Piece entrepos_colis;
    Piece zone_panneaux_photovoltaique;
    Piece ascenseur_toit;
    Piece salle_serveur;
    Piece garage;

    

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
    salle_de_bain = new AccesGarage("Salle_de_bain",piece_Adjacent_SDB,objets_SDB);
    salleMultiGaming.ajouterPiece_Adj(salle_de_bain);

    //pièce chambre
    LinkedList<Piece> piece_Adjacent_Chambre = new LinkedList<Piece>();
    piece_Adjacent_Chambre.add(salleMultiGaming);
    piece_Adjacent_Chambre.add(salle_de_bain);
    piece_Adjacent_Chambre.add(sejour);
    ArrayList<Objet> objets_chambre = new ArrayList<Objet>();
    //
    chambre = new AccesGarage("Salle_de_bain",piece_Adjacent_Chambre,objets_chambre);
    salleMultiGaming.ajouterPiece_Adj(chambre);
    salle_de_bain.ajouterPiece_Adj(chambre);
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

    /************-----------------DEBUT--1er-ETAGE--------------------------------********/
    
    //chambre enfant n°1
    LinkedList<Piece> piece_adjacent_ChambreEnfant1 = new LinkedList<Piece>();
    ArrayList<Objet> objets_ChambreEnfant1 = new ArrayList<Objet>();
    chambre_enfant_1 = new Chambre("Chambre enfant 1",piece_adjacent_ChambreEnfant1,objets_ChambreEnfant1);

    //chambre enfant n°2
    LinkedList<Piece> piece_adjacent_ChambreEnfant2= new LinkedList<Piece>();
    ArrayList<Objet> objets_ChambreEnfant2 = new ArrayList<Objet>();
    chambre_enfant_2 = new Chambre("Chambre enfant 2",piece_adjacent_ChambreEnfant2,objets_ChambreEnfant2);

    //chambre amis n°1
    LinkedList<Piece> piece_adjacent_ChambreAmis1= new LinkedList<Piece>();
    ArrayList<Objet> objets_ChambreAmis1 = new ArrayList<Objet>();
    chambre_amis_1 = new Chambre("Chambre amis 1",piece_adjacent_ChambreAmis1,objets_ChambreAmis1);

    //chambre amis n°2
    LinkedList<Piece> piece_adjacent_ChambreAmis2= new LinkedList<Piece>();
    ArrayList<Objet> objets_ChambreAmis2 = new ArrayList<Objet>();
    chambre_amis_2 = new Chambre("Chambre amis 2",piece_adjacent_ChambreAmis2,objets_ChambreAmis2);

    //buanderie
    LinkedList<Piece> piece_adjacent_Buanderie= new LinkedList<Piece>();
    ArrayList<Objet> objets_Buanderie = new ArrayList<Objet>();
    buanderie = new Buanderie("Buanderie",piece_adjacent_Buanderie,objets_Buanderie);

    //salon
    LinkedList<Piece> piece_adjacent_Salon= new LinkedList<Piece>();
    piece_adjacent_Salon.add(chambre_enfant_1);
    piece_adjacent_Salon.add(chambre_enfant_2);
    piece_adjacent_Salon.add(chambre_amis_1);
    piece_adjacent_Salon.add(chambre_amis_2);
    piece_adjacent_Salon.add(buanderie);
    ArrayList<Objet> objets_Salon = new ArrayList<Objet>();
    salon = new Salon("Salon",piece_adjacent_Salon,objets_Salon);
    chambre_enfant_1.ajouterPiece_Adj(salon);
    chambre_enfant_2.ajouterPiece_Adj(salon);
    chambre_amis_1.ajouterPiece_Adj(salon);
    chambre_amis_2.ajouterPiece_Adj(salon);
    buanderie.ajouterPiece_Adj(salon);
    
    //salle de bain
    LinkedList<Piece> piece_adjacent_SalleDeBain= new LinkedList<Piece>();
    piece_adjacent_SalleDeBain.add(salon);
    ArrayList<Objet> objets_SalleDeBain = new ArrayList<Objet>();
    salle_de_bain = new SDB("SalleDeBain",piece_adjacent_SalleDeBain,objets_SalleDeBain);
    salon.ajouterPiece_Adj(salle_de_bain);

    /************-----------------DEBUT--TOIT-------------------------------------********/

    //emplacement vehicule aerien
    LinkedList<Piece> piece_adjacent_EmplacementVehiculeAerien= new LinkedList<Piece>();
    ArrayList<Objet> objets_EmplacementVehiculeAerien = new ArrayList<Objet>();
    emplacement_véhicule_aerien = new EmplacementVehiculeAerien("Emplacement vehicule aerien",piece_adjacent_EmplacementVehiculeAerien,objets_EmplacementVehiculeAerien);

    //potager hydroponique
    LinkedList<Piece> piece_adjacent_PotagerHydroponique= new LinkedList<Piece>();
    piece_adjacent_PotagerHydroponique.add(emplacement_véhicule_aerien);
    ArrayList<Objet> objets_PotagerHydroponique = new ArrayList<Objet>();
    potager_hydroponique = new PotagerHydroponique("Chambre enfant 2",piece_adjacent_PotagerHydroponique,objets_PotagerHydroponique);
    emplacement_véhicule_aerien.ajouterPiece_Adj(potager_hydroponique);

    //entrepot colis
    LinkedList<Piece> piece_adjacent_EntrepotColis= new LinkedList<Piece>();
    piece_adjacent_EntrepotColis.add(emplacement_véhicule_aerien);
    piece_adjacent_EntrepotColis.add(potager_hydroponique);
    ArrayList<Objet> objets_EntrepotColis = new ArrayList<Objet>();
    entrepos_colis = new EntrepotColis("Entrepot colis",piece_adjacent_EntrepotColis,objets_EntrepotColis);
    emplacement_véhicule_aerien.ajouterPiece_Adj(entrepos_colis);
    potager_hydroponique.ajouterPiece_Adj(entrepos_colis);

    //zone panneau photovoltaique
    LinkedList<Piece> piece_adjacent_ZonePanneauPhotovoltaique= new LinkedList<Piece>();
    piece_adjacent_ZonePanneauPhotovoltaique.add(emplacement_véhicule_aerien);
    piece_adjacent_ZonePanneauPhotovoltaique.add(potager_hydroponique);
    piece_adjacent_ZonePanneauPhotovoltaique.add(entrepos_colis);
    ArrayList<Objet> objets_ZonePanneauPhotovoltaique = new ArrayList<Objet>();
    zone_panneaux_photovoltaique = new ZonePanneauPhotovoltaique("Zone panneau photovoltaique",piece_adjacent_ZonePanneauPhotovoltaique,objets_ZonePanneauPhotovoltaique);
    emplacement_véhicule_aerien.ajouterPiece_Adj(zone_panneaux_photovoltaique);
    potager_hydroponique.ajouterPiece_Adj(zone_panneaux_photovoltaique);
    entrepos_colis.ajouterPiece_Adj(zone_panneaux_photovoltaique);

    /************-----------------FIN--TOIT---------------------------------------********/

    /************-----------------DEBUT--SOUS-SOL---------------------------------********/

    //ascenseur vehicule
    LinkedList<Piece> piece_adjacent_AscenseurVehicule = new LinkedList<Piece>();
    ArrayList<Objet> objets_AscenseurVehicule = new ArrayList<Objet>();
    ascenseur_vehicule = new AscenseurVehicule("Ascenseur vehicule",piece_adjacent_AscenseurVehicule,objets_AscenseurVehicule);

    //garage
    LinkedList<Piece> piece_adjacent_Garage= new LinkedList<Piece>();
    ArrayList<Objet> objets_Garage = new ArrayList<Objet>();
    garage = new Garage("Garage",piece_adjacent_Garage,objets_Garage);
    ascenseur_vehicule.ajouterPiece_Adj(garage);

    //salle serveur
    LinkedList<Piece> piece_adjacent_SalleServeur= new LinkedList<Piece>();
    ArrayList<Objet> objets_SalleServeur = new ArrayList<Objet>();
    salle_serveur = new SalleServeur("Salle serveur",piece_adjacent_SalleServeur,objets_SalleServeur);
    garage.ajouterPiece_Adj(salle_serveur);

    //cave a vin
    LinkedList<Piece> piece_adjacent_CaveAVin= new LinkedList<Piece>();
    ArrayList<Objet> objets_CaveAVin = new ArrayList<Objet>();
    cave_a_vin = new CaveAVin("Cave a vin",piece_adjacent_CaveAVin,objets_CaveAVin);
    salle_serveur.ajouterPiece_Adj(cave_a_vin);
    cave_a_vin.ajouterPiece_Adj(salle_serveur);

    
    /************-----------------FIN--SOUS-SOL-----------------------------------********/


      //liste pièce rez_de_chaussee
      LinkedList<Piece> pieces_rdc = new LinkedList<Piece>();
      pieces_rdc.add(sejour);
      pieces_rdc.add(exterieurAccueil);
 
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