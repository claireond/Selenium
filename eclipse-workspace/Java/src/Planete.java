
public abstract class Planete {
    String nom;
    int diametre;
    //Vaisseau vaisseauAccoste;
    
    Atmosphere atmosphere;
   
    static String forme="Sph�rique";
    static int nbPlanetesDecouvertes;
    int nbTotalHumains;
     
    Planete(String nom){
        this.nom=nom;
        nbPlanetesDecouvertes++;
    }
    
   int revolution(int degres){
          System.out.println("Je suis la plan�te "+nom+" et je tourne autour de mon �toile de "+degres+" degr�s.");
        return degres/360;
    }
    
    int rotation(int degres){
        System.out.println("Je suis la plan�te "+nom+" et je tourne sur moi-m�me de "+degres+" degr�s.");
        return degres/360;
    }
    
 
    
    static String expansion (double milliardsDeKilometres){
        if (milliardsDeKilometres < 14){
            return "Oh la la mais c'est super rapide !";
        }
        else {
            return "Je r�ve ou c'est plus rapide que la lumi�re ?";
        }
    }




	}


