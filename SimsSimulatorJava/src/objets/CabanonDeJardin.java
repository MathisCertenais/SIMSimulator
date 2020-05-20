package objets;


public class CabanonDeJardin extends Objet {
    
    public CabanonDeJardin(){
       super("Cabanon De Jardin", "disponible");
       actions.add("Rentrer dans le Cabanon de Jardin");    //Ajout des Actions de Bases du Cabanon de Jardin
       actions.add("Sortir du Cabanon de Jardin");
       actions.add("Prendre des outils");
       actions.add("Deposer des outils");
       
    }

    @Override
    public void realiserAction(int c) {
        if(c == 0){
            if(this.etat == "occupe" || this.etat == "Occupe"){         //Occupe correspond a quand on a pris des outils
                System.out.println("Vous êtes déja dans le Cabanon de Jardin");
            }
            else {
                this.etat = "occupe";
                System.out.println("Vous rentrez dans le Cabanon de Jardin");
            }
        }
        else if(c == 1){
            if(this.etat == "disponible"){
                System.out.println("Vous n'êtes pas dans le Cabanon de Jardin");
            }
            else {
                this.etat = "disponible";
                System.out.println("Vous sortez du Cabanon de Jardin");
            }
        }else if(c == 2){
            if(this.etat == "disponible"){
                System.out.println("Il faut être dans le Cabanon de Jardin pour pouvoir prendre des outils");
            } else if(this.etat == "outils"){
                System.out.println("Vous avez déja pris des outils, veuillez d'abord deposer les précédents");
            }
            else {
                this.etat = "Occupe";
                System.out.println("*Vous prenez des outils*");
            }
        }else if(c == 3){
            if(this.etat == "occupe"){
                System.out.println("Vous n'avez pas d'outils à deposer, veuillez d'abord prendres des outils");
            }else if(this.etat == "disponible"){
                System.out.println("Vous devez être dans le cabanon pour prendre des outils");
            }
            else {
                this.etat = "occupe";
                System.out.println("*Vous deposez des outils*");
            }
        }
        else {
            System.out.println("Il ne se passe rien"); 
        }
        
    }
}