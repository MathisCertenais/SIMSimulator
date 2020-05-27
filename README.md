# SimsSimulator 

Ce projet à été réalisé dans le cadre du module Projet IOT du Semestre 6 à L'ESIR.

## Démarrage du Projet 

Pour pouvoir lancer le projet vous devez importer notre projet dans un IDE comptatible java. Après cela vous n'avez plus qu'a lancer la fonction main dans la classe ```Launcher``` 

## Prérequis

Un IDE java 

## Installation

Juste clone le répertoire du projet avec le lien suivant : [Projet](https://github.com/MathisCertenais/SIMSimulator/)

## Architecture du code 

Notre code est composé de quatre packages : 

```
objets / pieces / maison / etages 
```
Ensuite dans le package courant (src)  nous avons deux classes la classe ``` Initialisation ``` qui contient une méthode ``` initialiser() ``` qui permet de créer tous les objets, pièces et étages ainsi que la maison qui vas contenir touts cela. Cette méthode est appelée dans le deuxième fichier contenu dans le src à savoir dans la classe ``` launcher ```.  
La classe launcher contient une méthode qui constitue le moteur de jeux et qui permet au joueur d'intéragir avec les objets / pièces / étages et de réaliser des actions. Cette classe contient également le mode Admin qui est décris plus bas. 

## Détail de chaque package :

### package objets 
```
Dans ce package nous avons tous les classes dédiées aux objets. La classe abstraite Objet permet de définir les actions de base que peut réaliser un objet ainsi que les attributs nécessaires.
Récap : 
* Classe abstraite Objet 
* Classes implémentant la classe Objet (CabanonDeJardin, PC, Frigo ...)
```
### package maison 
```
Ce package contient uniquement la classe Maison. Ce package à été créé pour répondre à un besoin sur lors de la création de la pièce secrète en administrateur. 
```
### package pieces 
```
Dans ce package nous avons tous les classes dédiées aux pièces. La classe abstraite Pièce permet de définir les listes et attributs de base que contient une pièce.
Récap : 
* Classe abstraite Piece 
* Classes implémentant la classe Piece (Chambre , Jardin, Salon ...)
```
### package pieces 
```
Dans ce package nous avons tous les classes dédiées aux Etages . La classe abstraite Etage permet de définir les listes et attribus de base que contient un Etage.
Récap : 
* Classe abstraite Etage 
* Classes implémentant la classe Etage (Etage1 , SousSol, Toit ...)
```
## Description de la classe Objet :

### Les attributs : 
     * String nom => le nom de l'objet qui vas etre affiché au joueur 
     * String etat => l'état de l'objet qui permet de savoir si le joueur à deja intéragitr avec ou non et donc limiter les actions en fonction.
     * LinkedList<String> actions => listes des actions possibles pour le joueur sur l'objet
     
### Le constructeur : 
    public Objet(String nom, String etat){ // on demande juste le nom et l'état de l'objet 
        this.nom = nom;
        this.etat = etat;
        this.actions = new LinkedList<String>(); // création de la liste à l'initalisation de l'objet 
    }
    
### Les méthodes :
   
  * public String getNom() // retourne le nom 
  * public String getEtat() // retourne l'état courant de l'objet
  * public LinkedList<String> getAction() // retourne la lsite des actions sur l'objet
  * public void realiserAction(int c) // méthode qui réalise les actions en fonction de celle choisit par le joueur dans la liste des actions possibles      
  * public String toString() // affichage du nom + état de l'objet
  * public void actualiser(boolean jour) // méthode qui acualise certain objet en fonction de s'il fait nuit ou jour (exemple store connecté)
    
## Description de la classe Piece : 

### Les attributs : 
    * String nom => le nom de la pièce qui vas etre affiché au joueur 
    * LinkedList<Piece> piece_Ajacente => liste qui contient les pièces que l'on peut accèder depuis la pièce courante
    * ArrayList<Objet> list_objets => listes des objets contenus dans la pièce 
    
### Le constructeur : 
    public Piece(String nom, LinkedList<Piece> piece_Ajacent,ArrayList<Objet> list_objet) { // on demande tous les attributs lors de la création de l'objet 
        this.nom = nom;
        this.piece_Ajacente =  piece_Ajacent;
        this.list_objets =  list_objet;
    }
   
### Les méthodes :
 *  public String getNom() // retourne le nom 
 *  public LinkedList<Piece> getpiece_Ajacent() // retourne la liste des pièces adjacentes à la pièce 
 *  public ArrayList<Objet> getlist_objet() // retourne la liste des objets que contient la pièce
 *  public void ajouterPiece_Adj(Piece p) // ajoute une pièce dans la liste des pièces adjacentes 
 *  public boolean verif(boolean admin) // permet de vérifier si le joueur est en mode admin et donc accèder à des pièces en plus qui sont réservé à l'admin
    
## Description de la méthode initialiser() de la classe Initialisation : 

Dans la méthode nous avons en premier tous les attributs pour chaque pièces / objets. Ensuite des commentaires séparent les différents étage ainsi que les différentes pièces.
Dans chaque étage nous avons les pièces et dans chaques pièces nous avons les objets à ajouter dans la liste, les pièces adjacentes à ajouter dans la pièces pour pouvoir les initialiser.
Après cette étape très longue nous avons la création des étages et l'ajout des pièces dans chaque étage. La dernière étape consiste à créer une liste des étages et d'inserer à l'intérieur tous les étages. 
Quand cette liste est remplis, on créé une maison avec la liste des étages et on définit le point de départ à au ```rez-de-chaussée``` dans la pièce ```Extérieur```.
Enfin nous retournons l'objet maison qui vas etre utilisé dans le launcher.

## Différents modes possible : 

* Mode basique joueur avec l'intéraction avec des objets , le changement de pièce et d'étage

* Mode Administrateur avec la possibilité d'ajouter ou de supprimer des objets et d'ajouter et de changer l'heure du jeu 

## Auteurs du projet 

* **Mathis Certenais ** - [MathisCertenais](https://github.com/MathisCertenais)
* **Maxime Gerbaud ** - [MrMaxime](https://github.com/MrMaxime)
* **Paul Gougeon ** - [PaulGougeon](https://github.com/PaulGougeon)
* **Christophe Peroumal Tevanin ** - [chritouff](https://github.com/chritouff)


