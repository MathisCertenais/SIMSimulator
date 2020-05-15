package objets;


public class LaveVaisselle extends Objet {
    
    public LaveVaisselle(){
       super("Lave Vaisselle","éteint");
       actions.add("utiliser le Lave Vaisselle");    //Ajout des Actions de Bases de le Lave Vaisselle
       actions.add("Vider le Lave Vaisselle");    
    }
}