package objets;


public class LaveLinge extends Objet {
    
    public LaveLinge(){
       super("Lave Linge","incatif");
       actions.add("utiliser le Lave linge");    //Ajout des Actions de Bases de le Lave linge
    }

    @Override
    public void realiserAction(int c) {
         if(c == 0){
            System.out.println("vous avez utiliser le lave linge");
         }   
         else {
            System.out.println("Il ne se passe rien"); 
        }
    }
}