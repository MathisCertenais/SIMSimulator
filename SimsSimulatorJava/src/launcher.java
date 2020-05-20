
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import objets.*;
import pieces.Ascenseur;
import pieces.Piece;

public class launcher {

    public static void boucleJeu(boolean admin, Maison maison, Scanner scan) {

        // Creation de la liste d'objet
        Objet aspirateurAutonome = new AspirateurAutonome();
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
        LinkedList<Objet> nouveauxObjets = new LinkedList<Objet>();
        nouveauxObjets.add(aspirateurAutonome);
        nouveauxObjets.add(cadreConnecte);
        nouveauxObjets.add(cameraSurveillance);
        nouveauxObjets.add(canape);
        nouveauxObjets.add(capteurHumidite);
        nouveauxObjets.add(capteurTemperature);
        nouveauxObjets.add(douche);
        nouveauxObjets.add(enceinteConnecte);
        nouveauxObjets.add(fenetre);
        nouveauxObjets.add(ferArepasser);
        nouveauxObjets.add(four);
        nouveauxObjets.add(frigo);
        nouveauxObjets.add(hotte);
        nouveauxObjets.add(lavelinge);
        nouveauxObjets.add(lavevaiselle);
        nouveauxObjets.add(microOnde);
        nouveauxObjets.add(mirroirConnecte);
        nouveauxObjets.add(pc);
        nouveauxObjets.add(philipsHue);
        nouveauxObjets.add(plaque);
        nouveauxObjets.add(plateformeVehicule);
        nouveauxObjets.add(pompeAchaleur);
        nouveauxObjets.add(portailConnecte);
        nouveauxObjets.add(poubelle);
        nouveauxObjets.add(robotRangement);
        nouveauxObjets.add(robotTracteur);
        nouveauxObjets.add(secheLinge);
        nouveauxObjets.add(sondeHumidite);
        nouveauxObjets.add(sondeTemperature);
        nouveauxObjets.add(storeConnecte);
        nouveauxObjets.add(tele);
        nouveauxObjets.add(thermostat);
        nouveauxObjets.add(chaise);
        nouveauxObjets.add(cabanonDeJardin);
        nouveauxObjets.add(potager);
        nouveauxObjets.add(piscine);

        // Début du jeu
        boolean play = true;
        while (play) {
            maison.checkJour();
            System.out.println(maison);

            // Choix de la premiere action
            System.out.println("Vous pouvez :");
            System.out.println("0- Quitter le jeu");
            System.out.println("1- Changer de piece");
            System.out.println("2- Inspecter un objet");
            if (maison.getPiece() instanceof Ascenseur) {
                System.out.println("3- Changer d'étage");
            }
            if (admin) {
                System.out.println("454- Fixer l'heure");
                System.out.println("666- Ajouter un objet dans la pièce");
            }
            System.out.print("Tapez le chiffre correspondant à l'action : ");
            int idAction = scan.nextInt();

            // Quitter le jeu
            if (idAction == 0) {
                play = false;
                System.out.println("Merci d'avoir jouer !!");
            }

            // Changement de piece
            else if (idAction == 1) {

                // Affichage des pieces
                System.out.println("Aller dans la piece :");
                LinkedList<Piece> pieces_possibles = maison.getPiece().getpiece_Ajacent();
                for (int i = 0; i < pieces_possibles.size(); i++) {
                    System.out.println(i + "- " + pieces_possibles.get(i).getNom());
                }

                // Choix de la piece
                System.out.print("Tapez le chiffre correspondant à la pièce : ");
                int idPiece = scan.nextInt();
                if (idPiece > -1 && idPiece < pieces_possibles.size()) {
                    maison.setPiece(pieces_possibles.get(idPiece));
                    for (Objet objet : pieces_possibles.get(idPiece).getlist_objet()) {
                        objet.actualiser(maison.getJour());
                    }
                    maison.passageTps(0.3);
                } else {
                    System.out.println("Erreur, le numéro ne correspond à aucune piece");
                }
            }

            // Inspection d'un objet
            else if (idAction == 2) {

                // Affichage des objets
                System.out.println("Inspecter quel objet :");
                ArrayList<Objet> objets_dispo = maison.getPiece().getlist_objet();
                for (int i = 0; i < objets_dispo.size(); i++) {
                    System.out.println(i + "- " + objets_dispo.get(i).getNom());
                }

                // Choix de l'objet
                System.out.print("Tapez le chiffre correspondant à l'objet : ");
                int idObjet = scan.nextInt();
                if (idObjet > -1 && idObjet < objets_dispo.size()) {

                    // Focus sur un objet
                    boolean focusObj = true;
                    while (focusObj) {
                        System.out.println(objets_dispo.get(idObjet));

                        // Affichage des actions
                        System.out.println("Actions réalisable :");
                        LinkedList<String> actions_dispo = objets_dispo.get(idObjet).getAction();
                        for (int i = 0; i < actions_dispo.size(); i++) {
                            System.out.println(i + "- " + actions_dispo.get(i));
                        }
                        System.out.println(actions_dispo.size() + "- Laisser l'objet tranquille");

                        // Choix de l'action
                        System.out.print("Tapez le chiffre correspondant à l'objet : ");
                        int idActionObj = scan.nextInt();
                        if (idActionObj > -1 && idActionObj < actions_dispo.size()) {
                            maison.getPiece().getlist_objet().get(idObjet).realiserAction(idActionObj);
                            maison.passageTps(0.15);
                        } else if (idActionObj == actions_dispo.size()) {
                            focusObj = false;
                        } else {
                            System.out.println("Erreur, le noméro ne correspond à aucune action");
                        }
                    }
                } else {
                    System.out.println("Erreur, le numéro ne correspond à aucun objet");
                }

            }

            // Changer d'etage
            else if (idAction == 3 && maison.getPiece() instanceof Ascenseur) {

                // Affichage des etages
                System.out.println("Liste des étages :");
                for (int i = 0; i < maison.getAllEtage().size(); i++) {
                    System.out.println(i + "- " + maison.getAllEtage().get(i).getNom());
                }

                // Choix de l'étage
                System.out.print("Tapez le chiffre correspondant à l'étage : ");
                int idEtage = scan.nextInt();
                if (idEtage > -1 && idEtage < maison.getAllEtage().size()) {
                    maison.setEtage(maison.getAllEtage().get(idEtage));
                    for (int i = 0; i < maison.getEtage().getAllPiece().size(); i++) {
                        if (maison.getEtage().getPiece(i) instanceof Ascenseur) {
                            maison.setPiece(maison.getEtage().getPiece(i));
                        }
                    }
                    maison.passageTps(0.5);
                } else {
                    System.out.println("Erreur, le numéro ne correspond à aucun étage");
                }
            }

            // Changement de l'heure
            else if (idAction == 454 && admin) {
                System.out.println("Avancez dans le temps de combien d'heures ?");
                System.out.println("Tapez le nombre en heure avec une virgule pour les minutes");
                System.out.print("(Exemple : 8h30 = 8,5) : ");
                double heure = scan.nextDouble();
                maison.passageTps(heure);
            }

            // Ajout d'un objet
            else if (idAction == 666 && admin) {

                //Affichage des objets
                System.out.println("Liste d'objets disponibles :");
                for (int i = 0; i < nouveauxObjets.size(); i++) {
                    System.out.println((i + "- " + nouveauxObjets.get(i)));
                }

                //Selection d'un objet
                System.out.print("Tapez le numéro correspondant : ");
                int idObjetAjout = scan.nextInt();

                //Ajout de l'objet
                boolean present = false;
                for(int i=0; i<maison.getPiece().getlist_objet().size(); i++){
                    Class obj = nouveauxObjets.get(idObjetAjout).getClass();
                    present = maison.getPiece().getlist_objet().get(i) instanceof obj;
                }
            }

            // Mauvais numéro
            else {
                System.out.println("Erreur, le numéro est incorrect");
            }

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Maison maison = Initialisation.initialiser();
        System.out.println("Bienvenue dans notre Maison");
        System.out.println("Veuillez choisir votre rôle :");
        System.out.println("1- Joueur");
        System.out.println("2- Admin");
        System.out.print("Tapez le chiffre correspondant : ");
        int idRole = scan.nextInt();

        /*** Boucle joueur du jeu ***/
        if (idRole == 1) {
            System.out.println("Bienvenue Joueur !");
            boucleJeu(false, maison, scan);
        }

        /*** Boucle admin du jeu ***/
        else if (idRole == 2) {

            // Entrée du mot de passe
            int nbEssais = 0;
            while (nbEssais < 3) {
                System.out.print("Veuillez saisir le mot de passe : ");
                String mdp = scan.next();
                System.out.println(mdp);

                // Succès mot de passe
                if (mdp.equals("1234")) {
                    System.out.println("Vous êtes maintenant administrateur");
                    nbEssais = 3;
                    boucleJeu(true, maison, scan);
                }

                // Echec mot de passe
                else {
                    System.out.println("Mode de passe incorrect");
                    nbEssais += 1;
                    System.out.println("Il reste " + (3 - nbEssais) + " tentatives");
                }
            }
        }
        scan.close();
    }
}