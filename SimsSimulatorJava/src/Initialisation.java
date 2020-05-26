
import java.util.ArrayList;
import java.util.LinkedList;

import etages.Etage;
import etages.Etage1;
import etages.RDC;
import etages.SousSol;
import etages.Toit;
import maison.Maison;
import objets.*;
import pieces.AccesGarage;
import pieces.Ascenseur;
import pieces.Buanderie;
import pieces.Bureau;
import pieces.CaveAVin;
import pieces.Chambre;
import pieces.Cuisine;
import pieces.EmplacementVehiculeAerien;
import pieces.EntrepotColis;
import pieces.Exterieur;
import pieces.Garage;
import pieces.HomeCinema;
import pieces.Jardin;
import pieces.Piece;
import pieces.PieceSecrete;
import pieces.PotagerHydroponique;
import pieces.SDB;
import pieces.SalleMultiGaming;
import pieces.SalleServeur;
import pieces.Salon;
import pieces.Sejour;
import pieces.Terrasse;
import pieces.Toilette;
import pieces.ZonePanneauPhotovoltaique;

public class Initialisation {

public static Maison initialiser() {
    //objets de la maison
   
    Objet aspirateurAutonome = new AspirateurAutonome() ;
    Objet cadreConnecte = new CadreConnecte();
    Objet cameraSurveillance = new CameraSurveillance();
    Objet canape = new Canape();
    Objet capteurHumidite = new CapteurHumidite();
    Objet capteurTemperature = new CapteurTemperature();
    Objet douche = new Douche();
    Objet enceinteConnecte = new EnceinteConnecte();
    Objet fenetre = new Fenetre();
    Objet ferArepasser = new FerARepasser();
    Objet four = new Four();
    Objet frigo = new Frigo();
    Objet hotte = new Hotte();
    Objet lavelinge = new LaveLinge();
    Objet lavevaiselle = new LaveVaisselle();
    Objet microOnde = new MicroOnde();
    Objet mirroirConnecte = new MiroirConnecte();
    Objet pc = new PC();
    Objet philipsHue = new PhilipsHue();
    Objet plaque = new Plaque();
    Objet plateformeVehicule = new PlateformeVehicule();
    Objet pompeAchaleur = new PompeAChaleur();
    Objet portailConnecte = new PortailConnecte();
    Objet poubelle = new Poubelle();
    Objet robotRangement = new RobotRangement();
    Objet robotTracteur = new RobotTracteur();
    Objet secheLinge = new SecheLinge();
    Objet sondeHumidite = new SondeHumidite();
    Objet sondeTemperature = new SondeTemperature();
    Objet storeConnecte = new StoreConnecte();
    Objet tele = new Tele();
    Objet thermostat = new Thermostat();
    Objet chaise = new Chaise();
    Objet cabanonDeJardin = new CabanonDeJardin();
    Objet potager = new Potager();
    Objet piscine = new Piscine();

    //attributs pièce sous-sol
    Piece emplacement_voitures;
    Piece ascenseur_sous_sol;
    Piece salle_serveur;
    Piece cave_a_vin;

    //attributs pièce rez-de-chaussee
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
    Piece terrasse;
    Piece jardin;
    
    


    //attributs pièce 1er étage
    Piece chambre_enfant_1;
    Piece chambre_enfant_2;
    Piece salon;
    Piece chambre_amis_1;
    Piece chambre_amis_2;
    Piece buanderie;
    Piece sdb_Etage;
    Piece ascenseur_1etage;

    //attributs pièce toit
    Piece emplacement_véhicule_aerien;
    Piece potager_hydroponique;
    Piece entrepos_colis;
    Piece zone_panneaux_photovoltaique;
    Piece ascenseur_toit;


    /************-------------------REZ-DE-CHAUSSEE---------------------------********/
    // pièce séjour
    LinkedList<Piece> piece_Adjacent_sejour= new LinkedList<Piece>();
    ArrayList<Objet> objets_sejour = new ArrayList<Objet>();
    objets_sejour.add(philipsHue);
    objets_sejour.add(cameraSurveillance);
    objets_sejour.add(tele);
    objets_sejour.add(storeConnecte);
    objets_sejour.add(enceinteConnecte);
    objets_sejour.add(pompeAchaleur);
    objets_sejour.add(canape);
    objets_sejour.add(cadreConnecte);
    objets_sejour.add(aspirateurAutonome);
    objets_sejour.add(poubelle);
    sejour = new Sejour("Sejour",piece_Adjacent_sejour,objets_sejour);

    // pièce extérieure
    LinkedList<Piece> piece_Adjacent_exterieurAccueil = new LinkedList<Piece>();
    piece_Adjacent_exterieurAccueil.add(sejour);
    ArrayList<Objet> objets_exterieurAccueil = new ArrayList<Objet>();
    exterieurAccueil = new Exterieur("Exterieur",piece_Adjacent_exterieurAccueil,objets_exterieurAccueil);
    sejour.ajouterPiece_Adj(exterieurAccueil);
    
    // pièce cuisine
    LinkedList<Piece> piece_Adjacent_cuisine = new LinkedList<Piece>();
    piece_Adjacent_cuisine.add(sejour);
    ArrayList<Objet> objets_cuisine = new ArrayList<Objet>();
    objets_cuisine.add(philipsHue);
    objets_cuisine.add(cameraSurveillance);
    objets_cuisine.add(hotte);
    objets_cuisine.add(frigo);
    objets_cuisine.add(fenetre);
    objets_cuisine.add(plaque);
    objets_cuisine.add(pompeAchaleur);
    objets_cuisine.add(four);
    objets_cuisine.add(thermostat);
    objets_cuisine.add(microOnde);
    objets_cuisine.add(storeConnecte);
    objets_cuisine.add(lavevaiselle);
    objets_cuisine.add(poubelle);
    cuisine = new Cuisine("Cuisine",piece_Adjacent_cuisine,objets_cuisine);
    sejour.ajouterPiece_Adj(cuisine);

    //pièce home cinéma 
    LinkedList<Piece> piece_Adjacent_homeCinema = new LinkedList<Piece>();
    piece_Adjacent_homeCinema.add(sejour);
    piece_Adjacent_homeCinema.add(cuisine);
    ArrayList<Objet> objets_homeCinema = new ArrayList<Objet>();
    objets_homeCinema.add(philipsHue);
    objets_homeCinema.add(cameraSurveillance);
    objets_homeCinema.add(tele);
    objets_homeCinema.add(pompeAchaleur);
    objets_homeCinema.add(poubelle);
    objets_homeCinema.add(canape);
    homeCinema = new HomeCinema("Home_Cinema",piece_Adjacent_homeCinema,objets_homeCinema);
    cuisine.ajouterPiece_Adj(homeCinema);
    sejour.ajouterPiece_Adj(homeCinema);

    //pièce acces garage 
    LinkedList<Piece> piece_Adjacent_acces_garage = new LinkedList<Piece>();
    piece_Adjacent_acces_garage.add(sejour);
    piece_Adjacent_acces_garage.add(cuisine);
    piece_Adjacent_acces_garage.add(exterieurAccueil);
    ArrayList<Objet> objets_acces_garage = new ArrayList<Objet>();
    objets_acces_garage.add(philipsHue);
    objets_acces_garage.add(cameraSurveillance);
    objets_acces_garage.add(pompeAchaleur);
    objets_acces_garage.add(plateformeVehicule);
    objets_acces_garage.add(poubelle);
    accesGarage = new AccesGarage("Acces_Garage",piece_Adjacent_acces_garage,objets_acces_garage);
    cuisine.ajouterPiece_Adj(accesGarage);
    sejour.ajouterPiece_Adj(accesGarage);
    exterieurAccueil.ajouterPiece_Adj(accesGarage);

    //pièce multi-gaming 
    LinkedList<Piece> piece_Adjacent_multi_gaming = new LinkedList<Piece>();
    piece_Adjacent_multi_gaming.add(homeCinema);
    piece_Adjacent_multi_gaming.add(sejour);
    ArrayList<Objet> objets_multi_gaming = new ArrayList<Objet>();
    objets_multi_gaming.add(philipsHue);
    objets_multi_gaming.add(cameraSurveillance);
    objets_multi_gaming.add(tele);
    objets_multi_gaming.add(storeConnecte);
    objets_multi_gaming.add(fenetre);
    objets_multi_gaming.add(enceinteConnecte);
    objets_multi_gaming.add(pompeAchaleur);
    objets_multi_gaming.add(pc);
    objets_multi_gaming.add(poubelle);
    salleMultiGaming = new SalleMultiGaming("Salle_multi_gaming",piece_Adjacent_multi_gaming,objets_multi_gaming);
    homeCinema.ajouterPiece_Adj(salleMultiGaming);
    sejour.ajouterPiece_Adj(salleMultiGaming);

    //pièce toilette 
    LinkedList<Piece> piece_Adjacent_toilette = new LinkedList<Piece>();
    piece_Adjacent_toilette.add(salleMultiGaming);
    piece_Adjacent_toilette.add(sejour);
    ArrayList<Objet> objets_toilette = new ArrayList<Objet>();
    objets_toilette.add(philipsHue);
    objets_toilette.add(cameraSurveillance);
    objets_toilette.add(mirroirConnecte);
    objets_toilette.add(poubelle);
    toilette = new Toilette("toilette",piece_Adjacent_toilette,objets_toilette);
    salleMultiGaming.ajouterPiece_Adj(toilette);
    sejour.ajouterPiece_Adj(toilette);  

    //pièce Salle de bain
    LinkedList<Piece> piece_Adjacent_SDB = new LinkedList<Piece>();
    piece_Adjacent_SDB.add(salleMultiGaming);
    ArrayList<Objet> objets_SDB = new ArrayList<Objet>();
    objets_SDB.add(philipsHue);
    objets_SDB.add(cameraSurveillance);
    objets_SDB.add(storeConnecte);
    objets_SDB.add(fenetre);
    objets_SDB.add(pompeAchaleur);
    objets_SDB.add(mirroirConnecte);
    objets_SDB.add(lavelinge);
    objets_SDB.add(poubelle);
    objets_SDB.add(douche);
    salle_de_bain = new SDB("Salle_de_bain",piece_Adjacent_SDB,objets_SDB);
    salleMultiGaming.ajouterPiece_Adj(salle_de_bain);

    //pièce chambre
    LinkedList<Piece> piece_Adjacent_Chambre = new LinkedList<Piece>();
    piece_Adjacent_Chambre.add(salleMultiGaming);
    piece_Adjacent_Chambre.add(salle_de_bain);
    piece_Adjacent_Chambre.add(sejour);
    ArrayList<Objet> objets_chambre = new ArrayList<Objet>();
    objets_chambre.add(philipsHue);
    objets_chambre.add(cameraSurveillance);
    objets_chambre.add(storeConnecte);
    objets_chambre.add(tele);
    objets_chambre.add(storeConnecte);
    objets_chambre.add(fenetre);
    objets_chambre.add(pompeAchaleur);
    objets_chambre.add(mirroirConnecte);
    objets_chambre.add(poubelle);    
    chambre = new Chambre("Chambre",piece_Adjacent_Chambre,objets_chambre);
    salleMultiGaming.ajouterPiece_Adj(chambre);
    salle_de_bain.ajouterPiece_Adj(chambre);
    sejour.ajouterPiece_Adj(chambre);

    //pièce bureau
    LinkedList<Piece> piece_Adjacent_bureau = new LinkedList<Piece>();
    piece_Adjacent_bureau.add(chambre);
    piece_Adjacent_bureau.add(sejour);
    ArrayList<Objet> objets_bureau = new ArrayList<Objet>();
    objets_bureau.add(philipsHue);
    objets_bureau.add(cameraSurveillance);
    objets_bureau.add(fenetre);
    objets_bureau.add(pompeAchaleur);
    objets_bureau.add(poubelle);
    bureau = new Bureau("Bureau",piece_Adjacent_bureau,objets_bureau);
    chambre.ajouterPiece_Adj(bureau);
    sejour.ajouterPiece_Adj(bureau);

    /***Partie extérieure du rez-de-chausse */

    // pièce terassse  
    LinkedList<Piece> piece_Adjacent_terasse = new LinkedList<Piece>();
    piece_Adjacent_terasse.add(exterieurAccueil);
    piece_Adjacent_terasse.add(chambre);
    ArrayList<Objet> objets_terasse = new ArrayList<Objet>();
    objets_terasse.add(philipsHue);
    objets_terasse.add(cameraSurveillance);
    objets_terasse.add(chaise);
    objets_terasse.add(capteurTemperature);
    objets_terasse.add(capteurHumidite);
    objets_terasse.add(canape);
    objets_terasse.add(poubelle);
    terrasse = new Terrasse("Terrasse",piece_Adjacent_terasse,objets_terasse);
    chambre.ajouterPiece_Adj(terrasse);
    exterieurAccueil.ajouterPiece_Adj(terrasse);

    // pièce Jardin  
    LinkedList<Piece> piece_Adjacent_jardin = new LinkedList<Piece>();
    piece_Adjacent_jardin.add(exterieurAccueil);
    piece_Adjacent_jardin.add(terrasse);
    ArrayList<Objet> objets_jardin = new ArrayList<Objet>();
    objets_jardin.add(potager);
    objets_jardin.add(cameraSurveillance);
    objets_jardin.add(chaise);
    objets_jardin.add(capteurTemperature);
    objets_jardin.add(capteurHumidite);
    objets_jardin.add(piscine);
    objets_jardin.add(poubelle);
    objets_jardin.add(cabanonDeJardin);
    jardin = new Jardin("Jardin",piece_Adjacent_jardin,objets_jardin);
    terrasse.ajouterPiece_Adj(jardin);
    exterieurAccueil.ajouterPiece_Adj(jardin);

    
    
    



    /***FIN de la partie extérieure du rez-de-chausse */

    //pièce ascenseur rdc
    LinkedList<Piece> piece_Adjacent_ascenseur_rdc = new LinkedList<Piece>();
    piece_Adjacent_ascenseur_rdc.add(sejour);
    ArrayList<Objet> objets_ascenseur_rdc = new ArrayList<Objet>();
    ascenseur_rdc = new Ascenseur("Ascenceur rdc",piece_Adjacent_ascenseur_rdc,objets_ascenseur_rdc);
    sejour.ajouterPiece_Adj(ascenseur_rdc);

    /************-----------------FIN--REZ-DE-CHAUSSEE---------------------------********/

    /************-----------------DEBUT--1er-ETAGE--------------------------------********/
    
    //chambre enfant n°1
    LinkedList<Piece> piece_adjacent_ChambreEnfant1 = new LinkedList<Piece>();
    ArrayList<Objet> objets_ChambreEnfant1 = new ArrayList<Objet>();
    chambre_enfant_1 = new Chambre("Chambre enfant 1",piece_adjacent_ChambreEnfant1,objets_ChambreEnfant1);
    objets_ChambreEnfant1.add(philipsHue);
    objets_ChambreEnfant1.add(cameraSurveillance);
    objets_ChambreEnfant1.add(storeConnecte);
    objets_ChambreEnfant1.add(pompeAchaleur);
    objets_ChambreEnfant1.add(poubelle);

    //chambre enfant n°2
    LinkedList<Piece> piece_adjacent_ChambreEnfant2= new LinkedList<Piece>();
    ArrayList<Objet> objets_ChambreEnfant2 = new ArrayList<Objet>();
    chambre_enfant_2 = new Chambre("Chambre enfant 2",piece_adjacent_ChambreEnfant2,objets_ChambreEnfant2);
    objets_ChambreEnfant2.add(philipsHue);
    objets_ChambreEnfant2.add(cameraSurveillance);
    objets_ChambreEnfant2.add(storeConnecte);
    objets_ChambreEnfant2.add(pompeAchaleur);
    objets_ChambreEnfant2.add(poubelle);

    //chambre amis n°1
    LinkedList<Piece> piece_adjacent_ChambreAmis1= new LinkedList<Piece>();
    ArrayList<Objet> objets_ChambreAmis1 = new ArrayList<Objet>();
    chambre_amis_1 = new Chambre("Chambre amis 1",piece_adjacent_ChambreAmis1,objets_ChambreAmis1);
    objets_ChambreAmis1.add(philipsHue);
    objets_ChambreAmis1.add(cameraSurveillance);
    objets_ChambreAmis1.add(storeConnecte);
    objets_ChambreAmis1.add(pompeAchaleur);
    objets_ChambreAmis1.add(poubelle);

    //chambre amis n°2
    LinkedList<Piece> piece_adjacent_ChambreAmis2= new LinkedList<Piece>();
    ArrayList<Objet> objets_ChambreAmis2 = new ArrayList<Objet>();
    chambre_amis_2 = new Chambre("Chambre amis 2",piece_adjacent_ChambreAmis2,objets_ChambreAmis2);
    objets_ChambreAmis2.add(philipsHue);
    objets_ChambreAmis2.add(cameraSurveillance);
    objets_ChambreAmis2.add(storeConnecte);
    objets_ChambreAmis2.add(pompeAchaleur);
    objets_ChambreAmis2.add(cadreConnecte);
    objets_ChambreAmis2.add(poubelle);

    //buanderie
    LinkedList<Piece> piece_adjacent_Buanderie= new LinkedList<Piece>();
    ArrayList<Objet> objets_Buanderie = new ArrayList<Objet>();
    buanderie = new Buanderie("Buanderie",piece_adjacent_Buanderie,objets_Buanderie);
    objets_Buanderie.add(philipsHue);
    objets_Buanderie.add(cameraSurveillance);
    objets_Buanderie.add(lavelinge);
    objets_Buanderie.add(pompeAchaleur);
    objets_Buanderie.add(secheLinge);
    objets_Buanderie.add(storeConnecte);
    objets_Buanderie.add(fenetre);
    objets_Buanderie.add(ferArepasser);
    objets_Buanderie.add(poubelle);
    

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
    objets_Salon.add(philipsHue);
    objets_Salon.add(cameraSurveillance);
    objets_Salon.add(canape);
    objets_Salon.add(cadreConnecte);
    objets_Salon.add(pompeAchaleur);
    objets_Salon.add(storeConnecte);
    objets_Salon.add(aspirateurAutonome);
    objets_Salon.add(poubelle);

    //salle de bain
    LinkedList<Piece> piece_adjacent_SalleDeBain= new LinkedList<Piece>();
    piece_adjacent_SalleDeBain.add(salon);
    ArrayList<Objet> objets_SalleDeBain = new ArrayList<Objet>();
    sdb_Etage = new SDB("SalleDeBain",piece_adjacent_SalleDeBain,objets_SalleDeBain);
    salon.ajouterPiece_Adj(sdb_Etage);
    objets_SalleDeBain.add(philipsHue);
    objets_SalleDeBain.add(cameraSurveillance);
    objets_SalleDeBain.add(mirroirConnecte);
    objets_SalleDeBain.add(douche);
    objets_SalleDeBain.add(pompeAchaleur);
    objets_SalleDeBain.add(storeConnecte);
    objets_SalleDeBain.add(fenetre);
    objets_SalleDeBain.add(poubelle);

    //pièce ascenseur 1er etage
    LinkedList<Piece> piece_Adjacent_ascenseur_1erEtage = new LinkedList<Piece>();
    piece_Adjacent_ascenseur_1erEtage.add(salon);
    ArrayList<Objet> objets_ascenseur_1erEtage = new ArrayList<Objet>();
    //
    ascenseur_1etage = new Ascenseur("Ascenseur 1er etage",piece_Adjacent_ascenseur_1erEtage,objets_ascenseur_1erEtage);
    salon.ajouterPiece_Adj(ascenseur_1etage);
    /************--------------------FIN---1er--ETAGE-----------------------------********/
    /************-----------------DEBUT--TOIT-------------------------------------********/

    //emplacement vehicule aerien
    LinkedList<Piece> piece_adjacent_EmplacementVehiculeAerien= new LinkedList<Piece>();
    ArrayList<Objet> objets_EmplacementVehiculeAerien = new ArrayList<Objet>();
    emplacement_véhicule_aerien = new EmplacementVehiculeAerien("Emplacement vehicule aerien",piece_adjacent_EmplacementVehiculeAerien,objets_EmplacementVehiculeAerien);
    objets_EmplacementVehiculeAerien.add(philipsHue);
    objets_EmplacementVehiculeAerien.add(cameraSurveillance);
    objets_EmplacementVehiculeAerien.add(poubelle);

    //potager hydroponique
    LinkedList<Piece> piece_adjacent_PotagerHydroponique= new LinkedList<Piece>();
    piece_adjacent_PotagerHydroponique.add(emplacement_véhicule_aerien);
    ArrayList<Objet> objets_PotagerHydroponique = new ArrayList<Objet>();
    potager_hydroponique = new PotagerHydroponique("Potager hydroponique",piece_adjacent_PotagerHydroponique,objets_PotagerHydroponique);
    emplacement_véhicule_aerien.ajouterPiece_Adj(potager_hydroponique);
    objets_PotagerHydroponique.add(philipsHue);
    objets_PotagerHydroponique.add(cameraSurveillance);
    objets_PotagerHydroponique.add(sondeTemperature);
    objets_PotagerHydroponique.add(sondeHumidite);
    objets_PotagerHydroponique.add(portailConnecte);
    objets_PotagerHydroponique.add(robotTracteur);
    objets_PotagerHydroponique.add(poubelle);

    //entrepot colis
    LinkedList<Piece> piece_adjacent_EntrepotColis= new LinkedList<Piece>();
    piece_adjacent_EntrepotColis.add(emplacement_véhicule_aerien);
    piece_adjacent_EntrepotColis.add(potager_hydroponique);
    ArrayList<Objet> objets_EntrepotColis = new ArrayList<Objet>();
    entrepos_colis = new EntrepotColis("Entrepot colis",piece_adjacent_EntrepotColis,objets_EntrepotColis);
    emplacement_véhicule_aerien.ajouterPiece_Adj(entrepos_colis);
    potager_hydroponique.ajouterPiece_Adj(entrepos_colis);
    objets_EntrepotColis.add(philipsHue);
    objets_EntrepotColis.add(cameraSurveillance);
    objets_EntrepotColis.add(robotRangement);
    objets_EntrepotColis.add(pompeAchaleur);
    objets_EntrepotColis.add(aspirateurAutonome);
    objets_EntrepotColis.add(poubelle);

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
    objets_ZonePanneauPhotovoltaique.add(philipsHue);
    objets_ZonePanneauPhotovoltaique.add(cameraSurveillance);
    objets_ZonePanneauPhotovoltaique.add(poubelle);

    //pièce ascenseur toit
    LinkedList<Piece> piece_Adjacent_ascenseur_toit = new LinkedList<Piece>();
    piece_Adjacent_ascenseur_toit.add(entrepos_colis);
    ArrayList<Objet> objets_ascenseur_toit = new ArrayList<Objet>();
    //
    ascenseur_toit = new Ascenseur("Ascenseur toit",piece_Adjacent_ascenseur_toit,objets_ascenseur_toit);
    entrepos_colis.ajouterPiece_Adj(ascenseur_toit);
    /************-----------------FIN--TOIT---------------------------------------********/

    /************-----------------DEBUT--SOUS-SOL---------------------------------********/

    //garage
    LinkedList<Piece> piece_adjacent_Garage= new LinkedList<Piece>();
    ArrayList<Objet> objets_Garage = new ArrayList<Objet>();
    emplacement_voitures = new Garage("Garage",piece_adjacent_Garage,objets_Garage);
    objets_Garage.add(philipsHue);
    objets_Garage.add(cameraSurveillance);
    objets_Garage.add(plateformeVehicule);
    objets_Garage.add(poubelle);

    //salle serveur
    LinkedList<Piece> piece_adjacent_SalleServeur= new LinkedList<Piece>();
    ArrayList<Objet> objets_SalleServeur = new ArrayList<Objet>();
    salle_serveur = new SalleServeur("Salle serveur",piece_adjacent_SalleServeur,objets_SalleServeur);
    emplacement_voitures.ajouterPiece_Adj(salle_serveur);
    salle_serveur.ajouterPiece_Adj(emplacement_voitures);
    objets_SalleServeur.add(philipsHue);
    objets_SalleServeur.add(cameraSurveillance);
    objets_SalleServeur.add(capteurTemperature);
    objets_SalleServeur.add(pompeAchaleur);
    objets_SalleServeur.add(poubelle);
    
    //cave a vin
    LinkedList<Piece> piece_adjacent_CaveAVin= new LinkedList<Piece>();
    ArrayList<Objet> objets_CaveAVin = new ArrayList<Objet>();
    cave_a_vin = new CaveAVin("Cave a vin",piece_adjacent_CaveAVin,objets_CaveAVin);
    salle_serveur.ajouterPiece_Adj(cave_a_vin);
    cave_a_vin.ajouterPiece_Adj(salle_serveur);
    emplacement_voitures.ajouterPiece_Adj(cave_a_vin);
    cave_a_vin.ajouterPiece_Adj(emplacement_voitures);
    objets_CaveAVin.add(philipsHue);
    objets_CaveAVin.add(cameraSurveillance);
    objets_CaveAVin.add(capteurTemperature);
    objets_CaveAVin.add(capteurHumidite);
    objets_CaveAVin.add(pompeAchaleur);
    objets_CaveAVin.add(poubelle);

    //pièce ascenseur sous_sol
    LinkedList<Piece> piece_Adjacent_ascenseur_sous_sol = new LinkedList<Piece>();
    piece_Adjacent_ascenseur_sous_sol.add(cave_a_vin);
    ArrayList<Objet> objets_ascenseur_sous_sol = new ArrayList<Objet>();
    //
    ascenseur_sous_sol = new Ascenseur("Ascenseur sous-sol",piece_Adjacent_ascenseur_sous_sol,objets_ascenseur_sous_sol);
    cave_a_vin.ajouterPiece_Adj(ascenseur_sous_sol);

    /************-----------------FIN--SOUS-SOL-----------------------------------********/


      //liste pièce rez_de_chaussee
      LinkedList<Piece> pieces_rdc = new LinkedList<Piece>();
      pieces_rdc.add(sejour);
      pieces_rdc.add(exterieurAccueil);
      pieces_rdc.add(homeCinema);
      pieces_rdc.add(cuisine);
      pieces_rdc.add(salleMultiGaming);
      pieces_rdc.add(salle_de_bain);
      pieces_rdc.add(bureau);
      pieces_rdc.add(chambre);
      pieces_rdc.add(toilette);
      pieces_rdc.add(accesGarage);
      pieces_rdc.add(ascenseur_rdc);
      pieces_rdc.add(terrasse);
      pieces_rdc.add(jardin);


       //liste pièce 1er etage 
       LinkedList<Piece> pieces_1erEtage = new LinkedList<Piece>();
       pieces_1erEtage.add(salon);
       pieces_1erEtage.add(chambre_amis_1);
       pieces_1erEtage.add(chambre_amis_2);
       pieces_1erEtage.add(chambre_enfant_1);
       pieces_1erEtage.add(chambre_enfant_1);
       pieces_1erEtage.add(buanderie);
       pieces_1erEtage.add(sdb_Etage);
       pieces_1erEtage.add(ascenseur_1etage);

      //liste pièce toit
      LinkedList<Piece> pieces_toit = new LinkedList<Piece>();
      pieces_toit.add(emplacement_véhicule_aerien);
      pieces_toit.add(potager_hydroponique);
      pieces_toit.add(entrepos_colis);
      pieces_toit.add(zone_panneaux_photovoltaique);
      pieces_toit.add(ascenseur_toit);

      //liste pièce sous-sol
      LinkedList<Piece> pieces_sous_sol = new LinkedList<Piece>();
      pieces_sous_sol.add(emplacement_voitures);
      pieces_sous_sol.add(cave_a_vin);
      pieces_sous_sol.add(salle_serveur);
      pieces_sous_sol.add(ascenseur_sous_sol);
 
      //Etage rez_de_chaussee
      Etage rdc = new RDC("rez_de_chausee",pieces_rdc);
      //Etage 1er
      Etage etage1er = new Etage1("1er_étage",pieces_1erEtage);
      //Etage toit
      Etage toit = new Toit("toit",pieces_toit);
      //Etage sous-sol
      Etage sous_sol = new SousSol("sous-sol",pieces_sous_sol);
     
      //Liste étage 
      LinkedList<Etage> liste_etages = new LinkedList<Etage>();
      liste_etages.add(rdc);
      liste_etages.add(etage1er);
      liste_etages.add(toit);
      liste_etages.add(sous_sol);
 
      Maison maMaison = new Maison(liste_etages);
      maMaison.setEtage(rdc);
      maMaison.setPiece(exterieurAccueil);
 
     return maMaison;


}



}