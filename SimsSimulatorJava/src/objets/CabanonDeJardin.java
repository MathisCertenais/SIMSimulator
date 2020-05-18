package objets;


public class CabanonDeJardin extends Objet {
    
    public CabanonDeJardin(){
       super("Cabanon De Jardin", "fermé");
       actions.add("Rentrer dans le Cabanon de Jardin");    //Ajout des Actions de Bases du Cabanon de Jardin
       actions.add("Sortir du Cabanon de Jardin");
       actions.add("prendre des légumes");
       actions.add("planter des graines");
       
    }

    @Override
    public void realiserAction(int c) {
        if(c == 0){
            if(this.etat == "occupe"){
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
                System.out.println("Il faut être dans le Cabanon de Jardin pour pouvoir prendre des légumes");
            }
            else {
                System.out.println("*Vous prenez des legumes*");
            }
        }else if(c == 3){
            if(this.etat == "disponible"){
                System.out.println("Il faut être dans le Cabanon de Jardin pour pouvoir planter des graines");
            }
            else {
                System.out.println("*Vous plantez des graines*");
            }
        }
        else {
            System.out.println("Il ne se passe rien"); 
        }
        
    }
}