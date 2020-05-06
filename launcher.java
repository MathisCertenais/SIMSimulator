
public class launcher {

public static void main(String[] args) {
    Maison maison = Initialisation.initialiser();
    System.out.println("Bienvenue dans notre Maison");
    System.out.println("Vous êtes actuellement dans la pièce" + maison.piececourante.);
}
}