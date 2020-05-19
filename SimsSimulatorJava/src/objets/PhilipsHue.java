package objets;


public class PhilipsHue extends Objet {
    
    public PhilipsHue(){
       super("Ampoule PhilipsHue", "éteinte");
       actions.add("Allumer l'ampoule Philips Hue");    //Ajout des Actions de Bases de l'ampoule Philips Hue
       actions.add("Eteindre l'ampoule Philips Hue");
    }

    @Override
    public void realiserAction(int c) {
        if(c == 0){
            if(this.etat == "allumée"){
                System.out.println("L'ampoule est déjà allumeée");
            }
            else {
                this.etat = "allumée";
                System.out.println("L'ampoule s'allume");
            }
        }
        else if(c == 1){
            if(this.etat == "éteinte"){
                System.out.println("L'ampoule est déjà éteinte");
            }
            else {
                this.etat = "éteinte";
                System.out.println("L'ampoule s'éteint");
            }
        }
        else {
            System.out.println("Il ne se passe rien"); 
        }
        
    }
    @Override
    public void actualiser(boolean jour){
        if(jour){
            this.etat ="éteinte";
        }else{
            this.etat ="allumée";
        }
    }
}