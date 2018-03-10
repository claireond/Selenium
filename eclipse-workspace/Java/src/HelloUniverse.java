

public class HelloUniverse {

	public static void main(String... args) {
 
    	PlaneteTellurique mercure = new PlaneteTellurique("Mercure", 1);
        mercure.diametre = 4880;
   
        PlaneteTellurique venus = new PlaneteTellurique("Venus", 2);
        venus.diametre = 12100;
      
        PlaneteTellurique terre = new PlaneteTellurique("Terre", 10);
        terre.diametre = 12756;

        PlaneteTellurique mars = new PlaneteTellurique("Mars", 3);
        mars.diametre = 6792;

        Planete jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;

        Planete saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;

        Planete uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;

        Planete neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;
        
     
        Vaisseau chasseur= new VaisseauDeGuerre(TypeVaisseau.CARGO);
        chasseur.blindage=156;
        chasseur.resistanceDuBouclier=2;
        
        Vaisseau vaisseauMonde= new VaisseauCivil(TypeVaisseau.VAISSEAUMONDE);
        vaisseauMonde.blindage=4784;
        vaisseauMonde.resistanceDuBouclier=30;
        
        Vaisseau fregate = new VaisseauDeGuerre(TypeVaisseau.FREGATE);
        fregate.nbPassagers=24;
        fregate.tonnageMax=50;
         
       Vaisseau cargo = new VaisseauCivil(TypeVaisseau.CARGO);
     cargo.nbPassagers=50;
        
        Vaisseau croiseur = new VaisseauCivil(TypeVaisseau.CROISEUR);
        croiseur.nbPassagers=80;
        
        Vaisseau chasseur2= new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur2.nbPassagers=4;
        chasseur2.blindage=156;
        chasseur2.resistanceDuBouclier=2;
        
        Vaisseau chasseur3=new VaisseauCivil(TypeVaisseau.CHASSEUR);
        chasseur3.nbPassagers=5;
        chasseur3.blindage=156;
        chasseur3.resistanceDuBouclier=2;
        
        Vaisseau cargo2=new VaisseauCivil(TypeVaisseau.CARGO);
        cargo2.nbPassagers=10001;
        cargo2.blindage=1520;
        cargo2.resistanceDuBouclier=20;
        
        terre.accueillirVaisseaux(chasseur2, chasseur3, cargo2);
   
            /* 
       
        Scanner sc = new Scanner(System.in);
        String recommencer;
        do
        {
        System.out.println("Quel vaisseau souhaitez vous sélectionner ?");
        String vaisseauSelectionne = sc.nextLine();
        System.out.println("Sur quelle planète voulez vous vous poser?");
        String planeteSelectionne = sc.nextLine();
        System.out.println("Quel tonnage souhaitez vous embarquer ?");
        int tonnage = sc.nextInt();
        sc.nextLine();
     
	TypeVaisseau typeVaisseau=TypeVaisseau.valueOf(vaisseauSelectionne);
        Vaisseau vaisseau=null;
        switch(typeVaisseau)  {
        case CHASSEUR :
        	vaisseau=chasseur;
        	break;
        case VAISSEAUMONDE :
        	vaisseau=vaisseauMonde;
        	break;
        case CARGO :
        	vaisseau=cargo;
        	break;
        case CROISEUR :
        	vaisseau=croiseur;
        	break;
        case FREGATE :
        	vaisseau=fregate;
        	break;
        }
        
     PlaneteTellurique planete=null;
        switch (planeteSelectionne) {
        case "Mercure" :
        	planete=mercure;
        	break;
        	
        case "Mars" :
        	planete=mars;
        	break;	
        case "Terre" :
        	planete=terre;
        	break;	
        case "Venus" :
        	planete=venus;
        	break; 	
     
        }
        
        if (!planete.restePlaceDisponible()){
        	System.out.println("Le vaisseau ne peut pas se poser sur la planète par manque de place dans la baie.");
        }
        else {
        	 planete.accueillirVaisseaux(vaisseau);
             int rejet = vaisseau.emporterCargaison(tonnage);
             System.out.println("Le rejet est de " + rejet);
        }
        
        System.out.println("Voulez-vous recommencer?");
        recommencer=sc.nextLine();
        }
        while (recommencer.equalsIgnoreCase("oui"));
      
      /*
        terre.accueillirVaisseau(chasseur);
        System.out.println("le chasseur a rejeté " + chasseur.emporterCargaison(20) + " tonnes.");
        
        terre.accueillirVaisseau(fregate);
         System.out.println("la fregate a rejeté " +  fregate.emporterCargaison(45) + " tonnes.");
         System.out.println("la fregate a rejeté " +  fregate.emporterCargaison(12) + " tonnes.");
        
           
         Vaisseau Nouvellefregate = new VaisseauDeGuerre(TypeVaisseau.FREGATE);
         Nouvellefregate.nbPassagers=14;
         terre.accueillirVaisseau(Nouvellefregate);
         System.out.println("la fregate a rejeté " +  Nouvellefregate.emporterCargaison(30) + " tonnes.");
          

         terre.accueillirVaisseau(vaisseauMonde);
         System.out.println("le vaisseau monde a rejeté " +  vaisseauMonde.emporterCargaison(1560) + " tonnes.");
         System.out.println("le vaisseau monde a rejeté " +  vaisseauMonde.emporterCargaison(600) + " tonnes.");
         
         
        vaisseauMonde.activerBouclier();
        chasseur.activerBouclier();
        ((VaisseauDeGuerre)chasseur).attaque(vaisseauMonde, "laser photonique", 3);
        vaisseauMonde.desactiverBouclier();
        
        mars.accueillirVaisseau(vaisseauMonde);
        mars.accueillirVaisseau(chasseur);    
        
       
        System.out.println("Le Vaisseau-Monde dispose encore de "+vaisseauMonde.resistanceDuBouclier+" minutes de protection grâce à son bouclier.");
        System.out.println("Le Vaisseau-Monde dispose encore d'un blindage de valeur "+vaisseauMonde.blindage+".");

        Atmosphere atmosphereUranus=new Atmosphere();
		atmosphereUranus.tauxHydrogene=new Float (83.0f);
        atmosphereUranus.tauxHelium=new Float (15.0f);
        atmosphereUranus.tauxMethane=new Float (2.5f);
        atmosphereUranus.tauxAzote=new Float (0.0f);
        uranus.atmosphere=atmosphereUranus;
      
        
        System.out.println("L'atmosphère d'Uranus est composée de : " );
        if (uranus.atmosphere.tauxHydrogene!=null) {
            System.out.println("Taux hydrogene : " + uranus.atmosphere.tauxHydrogene);
        }
        if (uranus.atmosphere.tauxHelium!=null) {
            System.out.println("Taux hydrogene : " + uranus.atmosphere.tauxHelium);
        }
        if (uranus.atmosphere.tauxArgon!=null) {
        	System.out.println("Taux argon : " + uranus.atmosphere.tauxArgon);
        }
        if (uranus.atmosphere.tauxAzote!=null) {
        	System.out.println("Taux azote : " + uranus.atmosphere.tauxAzote);
        }
    
        if (uranus.atmosphere.tauxDioxydeCarbone!=null) {
        	System.out.println("Taux dioxyde de carbone : " + uranus.atmosphere.tauxDioxydeCarbone);
        }
        if (uranus.atmosphere.tauxMethane!=null) {
        	System.out.println("Taux dioxyde de méthane: " + uranus.atmosphere.tauxMethane);
        }
        if (uranus.atmosphere.tauxSodium!=null) {
        	System.out.println("Taux dioxyde de méthane: " + uranus.atmosphere.tauxSodium);
        }*/


	}

}
