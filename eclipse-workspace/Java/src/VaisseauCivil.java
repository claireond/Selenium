
public class VaisseauCivil extends Vaisseau{
	
	
	
	public VaisseauCivil(TypeVaisseau type) {
		 this.type=type;
		 if (type==TypeVaisseau.CARGO) {
			 tonnageMax=500;
		 }
		 if (type==TypeVaisseau.VAISSEAUMONDE) {
			 tonnageMax=2000;
		
		 }
		
	}

	 int emporterCargaison(int cargaison) {
		 
		 
		 int tonnageRestant = tonnageMax-tonnageActuel;
		 
		 

							if (cargaison >tonnageRestant) {
								tonnageActuel=tonnageMax;
								return cargaison-tonnageRestant;
							}
							
							else {
								tonnageActuel=tonnageActuel+cargaison;
								return 0;
				}
				
			}
			}


	    

