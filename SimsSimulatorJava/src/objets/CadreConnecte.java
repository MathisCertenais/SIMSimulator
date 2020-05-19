package objets;


public class CadreConnecte extends Objet {
    
    public CadreConnecte(){
       super("Cadre Connecte","actif");            //Ajout des Actions de Bases pour le cadre connecte
       actions.add("Eteindre le cadre");
       actions.add("Allumer le cadre");
       actions.add("Changer de photo");    
       actions.add("Regarder la photo");
       
    }

    @Override
    public void realiserAction(int c) {
        if(c == 0){
            if(this.etat == "éteint"){
                System.out.println("Le cadre connecté est déjà eteint");
            }
            else {
                this.etat = "eteint";
                System.out.println("Le cadre connecté s'eteint");
            }
        }
        else if(c == 1){
            if(this.etat == "actif"){
                System.out.println("Le cadre connecté est déjà actif");
            }
            else {
                this.etat = "actif";
                System.out.println("Le cadre connecté s'allume");
            }
        }
        else if(c == 2){
            if(this.etat == "eteint"){
                System.out.println("Veuillez d'abord allumer le cadre avant de changer de photo");
            }
            else {
                this.etat = "actif";
                System.out.println("*changment de la photo*");
            }
        }else if(c == 3){
                if(this.etat == "eteint"){
                    System.out.println("*Super...Vous regardez en écran noir*");
                }
                else {
                    this.etat = "actif";
                    System.out.println("*vous regardez la photo*");
                }
            }
             else {
            System.out.println("Il ne se passe rien"); 
            }
        }
    }
}