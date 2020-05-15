package objets;


public class LaveVaisselle extends Objet {
    
    public LaveVaisselle(){
       super("Lave Vaisselle","éteint");
       actions.add("utiliser le Lave Vaisselle");    //Ajout des Actions de Bases de le Lave Vaisselle  
    }

    @Override
    public void realiserAction(int c) {
         if(c == 0){
            System.out.println("vous avez utiliser le lave vaisselle");
         }   
         else {
            System.out.println("Il ne se passe rien"); 
        }
    }
}