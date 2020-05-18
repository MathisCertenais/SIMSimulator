package objets;

public class SondeHumidite extends Objet {
    
    public SondeHumidite(){
        super("Sonde d'humidité","Active");
        actions.add("Regarder la valeur d'humidite");    //Ajout des Actions de Bases de la sonde humidite
    }

    public void realiserAction(int c) {
        if(c == 0){
            if(this.etat == "allumée"){
                System.out.println("La sonde d'humidité est déjà utilisé");
            }
            else {
                this.etat = "allumée";
                System.out.println("Le seche linge s'allume");
            }
        }
        else if(c == 1){
            if(this.etat == "éteinte"){
                System.out.println("Le seche linge est déjà éteint");
            }
            else {
                this.etat = "éteinte";
                System.out.println("Le robot seche linge s'éteint");
            }
        }
        else {
            System.out.println("Il ne se passe rien"); 
        }
        
    }

 
}
