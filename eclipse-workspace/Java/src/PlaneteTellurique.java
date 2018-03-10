
public class PlaneteTellurique extends Planete implements Habitable{
	int totalVisiteurs;
	Vaisseau vaisseauAccoste;

	Vaisseau[] baieAccostage; 


	PlaneteTellurique(String nom, int tailleBaie) {
		super(nom);
		this.baieAccostage=new Vaisseau[tailleBaie];
	}

	boolean restePlaceDisponible () {
		for (int index=0; index<baieAccostage.length;index++) {

			if (baieAccostage[index]==null){
				return true; 
			}
		}
		return false;

	}



	public void accueillirVaisseaux (Vaisseau... vaisseaux){
		

		for (int i=0; i>vaisseaux.length;i++) 
		{

			if (vaisseaux[i] instanceof VaisseauDeGuerre) {

				((VaisseauDeGuerre)vaisseaux[i]).desactiverArmes();
			}

			nbTotalHumains=nbTotalHumains+vaisseaux[i].nbPassagers;
		
			for (int index=0; index<baieAccostage.length;index++) {

				if (baieAccostage[index]==null){
					baieAccostage[index]=vaisseaux[index];
					break;
				}

			
			}
		}
	}


}



/*if (vaisseauAccoste==null) {		
			System.out.println("Aucun vaisseau ne s'en va");

		}
		else {
			System.out.println("Un vaisseau de type " + vaisseauAccoste.type + " doit s'en aller");
		}
		return vaisseauAccoste=vaisseau;
    }
;}*/




