package objets;


public class AspirateurAutonome extends Objet {
    
    public AspirateurAutonome(){
       super("AspirateurAutonome","a l'arret");
       actions.add("Demarrer l'aspirateur");            //Ajout des Actions de Bases pour l'aspirateur
       actions.add("Arreter l'aspirateur"); 
    }

    @Override
    public void realiserAction(int c) {
        if(c == 0){
            if(this.etat == "en cours de fonctionnement"){
                System.out.println("L'aspirateur est déjà en cours de fonctionnement");
            }
            else {
                this.etat = "en cours de fonctionnement";
                System.out.println("L'aspirateur demarre");
            }
        }
        else if(c == 1){
            if(this.etat == "a l'arret"){
                System.out.println("L'aspirateur est déjà a l'arret");
            }
            else {
                this.etat = "a l'arret";
                System.out.println("L'aspirateur retourne a sa base et s'arrete");
            }
        }
        else {
            System.out.println("Il ne se passe rien"); 
        }
    }
}