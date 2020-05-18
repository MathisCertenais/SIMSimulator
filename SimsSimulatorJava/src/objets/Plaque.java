package objets;


public class Plaque extends Objet {

    private int puissance;
    
    public Plaque(){
       super("Plaque de cuisson", "éteinte");
       puissance = 0;
       actions.add("Allumer la plaque");    //Ajout des Actions de Bases de la plaque
       actions.add("Eteindre la plaque");
       actions.add("Augmenter la puissance de la plaque");    
       actions.add("Diminuer la puissance de la plaque");
    }

    @Override
    public void realiserAction(int c) {
        if(c == 0){
            if(this.etat == "allumée"){
                System.out.println("La plaque est déjà allumeée");
            }
            else {
                this.etat = "allumée";
                this.puissance = 0;
                System.out.println("La plaque s'allume");
            }
        }
        else if(c == 1){
            if(this.etat == "éteinte"){
                System.out.println("La plaque est déjà éteinte");
            }
            else {
                this.etat = "éteinte";
                System.out.println("La plaque s'éteint");
            }
        }
        else if(c == 2 && this.etat == "allumée"){
            if(puissance < 10){
                puissance += 1;
                System.out.println("Vous augmentez la puissance");
            }
            else{
                System.out.println("La puissance est à son maximum");
            }
        }
        else if(c == 3 && this.etat == "allumée"){
            if(puissance > 0){
                puissance -= 1;
                System.out.println("Vous diminuez la puissance");
            }
            else{
                System.out.println("La puissance est à son minimum");
            }
        }
        else {
            System.out.println("Il ne se passe rien"); 
        }
        
    }

    @Override
    public String toString(){
        if(etat == "allumée"){
            return("La plaque est allumé à la puissance " + puissance);
        }
        else{
            return("La plaque est éteinte");
        }
    }
}