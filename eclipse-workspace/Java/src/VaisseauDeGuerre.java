
public class VaisseauDeGuerre extends Vaisseau {
	
	
	
 VaisseauDeGuerre(TypeVaisseau type) {
	 this.type=type;
	 if (type==TypeVaisseau.CHASSEUR) {
		 tonnageMax=0;
	 }
	 if (type==TypeVaisseau.FREGATE) {
		 tonnageMax=50;
	 }
	 else if (type==TypeVaisseau.CROISEUR) {
		 tonnageMax=100;
	 }
	// TODO Auto-generated constructor stub
}
	boolean armesDesactivees;
	
    void attaque(Vaisseau vaisseauCible, String arme, int duree){
    	if (armesDesactivees) {
    		System.out.println("Attaque impossible, l'armement est désactivé");
    	}
    	else {
    	System.out.println("Un vaisseau de type" + type + " attaque un vaisseau de type " + vaisseauCible.type+ " en utilisant l'arme " + arme + " pendant " + duree + " minutes");
    	vaisseauCible.resistanceDuBouclier=0;
    	vaisseauCible.blindage=vaisseauCible.blindage/2;
    	}
    	        
    }  
        
      void desactiverArmes(){
    	  armesDesactivees=true;
    		System.out.println("Désactivation des armes d'un vaisseau de type " + type);
    		  
    	  }
    	  
      
  	void activerBouclier(){
		desactiverArmes();
	        	  
  }



  	int emporterCargaison(int cargaison) {
		if (type.equals("CHASSEUR"))
		return cargaison;
		
		else {
			if (nbPassagers<12){
				return cargaison;
			}
			else {
				int tonnagePassagers = 2*nbPassagers;
				int tonnageRestant = tonnageMax-tonnageActuel;
				int tonnageACondiderer = (tonnagePassagers<tonnageRestant ? tonnageRestant : tonnageRestant);
						if (cargaison >tonnageACondiderer) {
							tonnageActuel=tonnageMax;
							return cargaison-tonnageACondiderer;
						}
						
						else {
							tonnageActuel=tonnageActuel+cargaison;
							return 0;
			}
			
		}
		}}
			
	

}
	