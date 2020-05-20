
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import objets.Objet;
import pieces.Ascenseur;
import pieces.Piece;

public class launcher {

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
                System.out.print("Tapez le chiffre correspondant à l'action : ");
                int idAction = scan.nextInt();

                // Quitter le jeu
                if (idAction == 0) {
                    play = false;
                    System.out.println("Merci d'avoir jouer !!");
                }

                // Changement de piece
                if (idAction == 1) {

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

                    //Choix de l'étage
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
            }
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
                    boolean play = true;
                    while (play) {

                        // Choix première action
                        System.out.println("Vous pouvez :");
                        System.out.println("0- Quitter le jeu");
                        System.out.print("Tapez le chiffre correspondant : ");
                        int idAction = scan.nextInt();

                        // Quitter le jeu
                        if (idAction == 0) {
                            play = false;
                            System.out.println("Merci d'avoir jouer !!");
                        }
                    }
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